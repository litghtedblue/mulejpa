package jp.tuyoyun;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.springframework.beans.factory.annotation.Autowired;

import jp.cloudear.test.db.Test3;

public class Db implements Callable {
	@Autowired
	Test3MapperEx mapper;

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		resultHandler();

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
