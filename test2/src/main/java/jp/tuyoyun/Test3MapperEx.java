package jp.tuyoyun;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.ResultHandler;

import jp.cloudear.test.db.Test3;

public interface Test3MapperEx {
	@Options(useCache = false)
	@Select("SELECT * FROM TEST3")
	@ResultType(Test3.class)
	void collect(ResultHandler<Test3> handler);

	// 失敗
	// @Select("SELECT * FROM TEST3")
	// @ResultType(Test3.class)
	// Cursor<Test3> selectCursor();
}