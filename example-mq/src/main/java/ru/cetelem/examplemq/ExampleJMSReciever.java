package ru.cetelem.examplemq;

import org.springframework.jms.annotation.JmsListener;

public class ExampleJMSReciever {
	  @JmsListener(destination = "TEST_QUEUE1"/*, containerFactory = "myFactory"*/)
	    public void receiveMessage(String message) {
	        System.out.println("Received <" + message + ">");
	    }	  
}
