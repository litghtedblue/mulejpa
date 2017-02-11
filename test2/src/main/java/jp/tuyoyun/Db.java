package jp.tuyoyun;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import jp.cloudear.test.db.Test3;
import jp.cloudear.test.db.Test3Mapper;

public class Db implements Callable {

	@Autowired
	Test3Mapper mapperBase;

	@Autowired
	Test3MapperEx mapper;

	@Autowired
	SqlSessionFactoryBean sessionFactoryBean;

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// resultHandler();

		SqlSessionFactory sessionFactory = sessionFactoryBean.getObject();
		SqlSession session = sessionFactory.openSession();

		Test3 record = new Test3();
		record.setTitle("test6");
		record.setRssUrl("http://test6");
		session.insert("insert", record);
		session.commit();
		// session.rollback();

		insert();
		System.out.println();

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

	@Transactional
	private void insert() {
		Test3 record = new Test3();
		record.setTitle("test7");
		record.setRssUrl("http://test7");
		mapperBase.insert(record);
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
