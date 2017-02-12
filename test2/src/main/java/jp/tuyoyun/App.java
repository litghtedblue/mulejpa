package jp.tuyoyun;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
// @MapperScan({ "jp.cloudear.test.db", "jp.tuyoyun" })
@ComponentScan("jp.tuyoyun")
@EnableTransactionManagement
public class App {
	// <spring:bean id="dataSource"
	// class="org.apache.commons.dbcp2.BasicDataSource"
	// destroy-method="close">

	@Bean(name = "dataSource1")
	@Primary
	public DataSource dataSource() {
		BasicDataSource bean = new org.apache.commons.dbcp2.BasicDataSource();
		bean.setDriverClassName("com.p6spy.engine.spy.P6SpyDriver");
		bean.setUrl("jdbc:p6spy:oracle:thin:@localhost:1521:xe");
		bean.setUsername("TEST");
		bean.setPassword("init");
		bean.setDefaultAutoCommit(false);
		return bean;
	}

	@Bean(name = "dataSource2")
	public DataSource dataSource2() {
		BasicDataSource bean = new org.apache.commons.dbcp2.BasicDataSource();
		bean.setDriverClassName("com.p6spy.engine.spy.P6SpyDriver");
		bean.setUrl("jdbc:p6spy:oracle:thin:@localhost:1521:xe");
		bean.setUsername("SYSTEM");
		bean.setPassword("ORACLE");
		bean.setDefaultAutoCommit(false);
		return bean;
	}

	@Bean(name = "transactionManager")
	@Autowired
	@Qualifier("dataSource")
	public PlatformTransactionManager transactionManager(DataSource source) {
		return new DataSourceTransactionManager(source);
	}

	@Bean(name = "transactionManager2")
	@Autowired
	@Qualifier("dataSource2")
	public PlatformTransactionManager transactionManager2(DataSource source) {
		return new DataSourceTransactionManager(source);
	}

	@Bean(name = "sqlSessionFactory")
	@Autowired
	@Qualifier("dataSource")
	public SqlSessionFactoryBean sqlSessionFactory(DataSource source) {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(source);
		bean.setConfigLocation(new ClassPathResource("batis.xml"));
		return bean;
	}

	@Bean(name = "sqlSessionFactory2")
	@Autowired
	@Qualifier("dataSource2")
	public SqlSessionFactoryBean sqlSessionFactory2(DataSource source) {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(source);
		bean.setConfigLocation(new ClassPathResource("batis.xml"));
		return bean;
	}

	@Bean
	public MapperScannerConfigurer conf() throws Exception {
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		configurer.setBasePackage("jp.tuyoyun,jp.cloudear.test.db");
		return configurer;
	}

	@Bean
	public MapperScannerConfigurer conf2() throws Exception {
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setSqlSessionFactoryBeanName("sqlSessionFactory2");
		configurer.setBasePackage("jp.cloudear.test.db2");
		return configurer;
	}

}
