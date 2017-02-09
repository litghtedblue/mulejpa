package jp.tuyoyun;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.springframework.beans.factory.annotation.Autowired;

public class Test implements Callable {
	@Autowired
	RssRepository rep;

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		Rss findOne = rep.findOne(594L);

		return findOne.getRssUrl();
	}

}