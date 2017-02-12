package jp.tuyoyun;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.cloudear.test.db.Test3;
import jp.cloudear.test.db.Test3Mapper;
import jp.cloudear.test.db2.Test6;
import jp.cloudear.test.db2.Test6Example;
import jp.cloudear.test.db2.Test6Mapper;

@Component
public class Db implements Callable {

	@Autowired
	Test3Mapper mapperBase;

	@Autowired
	Test3MapperEx mapper;

	@Autowired
	Test6Mapper mapper6;

	@Autowired
	@Qualifier("sqlSessionFactory")
	SqlSessionFactoryBean sessionFactoryBean;

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// resultHandler();

		// session();
		// session.rollback();

		Test3 key = mapperBase.selectByPrimaryKey(704L);
		System.out.println(key.getTitle());

		Test3 test3 = new Test3();
		test3.setTitle("test10");
		test3.setRssUrl("http://test10");
		mapperBase.insert(test3);

		Test6Example example = new Test6Example();
		example.createCriteria().andRssInfoIdEqualTo(new BigDecimal("594"));
		List<Test6> list = mapper6.selectByExample(example);
		System.out.println(list.get(0).getTitle());

		// insert();
		System.out.println(mapper);
		// test();

		// try (Cursor<Test3> todos = mapper.selectCursor()) { //
		// try-with-resources文でCursorを確実にクローズする
		// boolean consumed = todos.isConsumed();
		// boolean open = todos.isOpen();
		// int index = todos.getCurrentIndex();
		// boolean hasNext = todos.iterator().hasNext();
		// System.out.println();
		// }

		return "ok";
	}

	private void test() {
		System.out.println();

	}

	private void session() throws Exception {
		SqlSessionFactory sessionFactory = sessionFactoryBean.getObject();
		SqlSession session = sessionFactory.openSession();

		Test3 record = new Test3();
		record.setTitle("test9");
		record.setRssUrl("http://test9");
		session.insert("insert", record);
		session.commit();
	}

	@Transactional
	private void insert() {
		// Test3 record = new Test3();
		// record.setTitle("test7");
		// record.setRssUrl("http://test7");
		// mapperBase.insert(record);
	}

	private void resultHandler() {
		mapper.collect(new ResultHandler<Test3>() {

			@Override
			public void handleResult(ResultContext<? extends Test3> context) {
				Test3 test3 = context.getResultObject();
				System.out.println(test3.getRssUrl());
			}
		});
	}

}
