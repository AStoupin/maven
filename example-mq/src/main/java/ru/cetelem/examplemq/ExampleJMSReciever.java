package ru.cetelem.examplemq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


public class ExampleJMSReciever {
	  private static final Log log = LogFactory.getLog(ExampleJMSReciever.class);
	
	  @JmsListener(destination = "TEST_QUEUE1"/*, containerFactory = "myFactory"*/)
	    public void receiveMessage(String message) {
			log.info(String.format("Recieve <%s>", message));
	    }	  
}
