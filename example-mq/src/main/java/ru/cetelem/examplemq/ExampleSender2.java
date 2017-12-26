package ru.cetelem.examplemq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ExampleSender2  implements IExampleJMSSender {
	private static final Log log = LogFactory.getLog(ExampleSender2.class);

	@Override
	public void sendMesage(byte[] mess) {
		// TODO Auto-generated method stub
		log.info("Send a message...");

		
	}

}
