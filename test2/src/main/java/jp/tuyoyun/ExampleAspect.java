package jp.tuyoyun;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {

	// @Before("execution(* jp.tuyoyun..*.*(..))")
	// public void before() {
	// System.out.println("このログは、メソッド処理「前」に実行しています。");
	// }
	//
	// @After("execution(* jp.tuyoyun..*.*(..))")
	// public void after() {
	// System.out.println("このログは、メソッド処理「後」に実行しています。");
	// }

	@Before("within(org.mybatis.spring.SqlSessionTemplate)")
	// @Before("execution(* org.mybatis.spring.SqlSessionTemplate.*(..))")
	// @Before("within(jp.tuyoyun.Db)")
	public void before2() {
		System.out.println("before !!");
	}

}
