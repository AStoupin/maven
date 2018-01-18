package ru.cetelem.examplemq;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

/*
 * 	New comment added 20/12 
 * 
 * */
public class ExampleJMSSender  {
	private static final Log log = LogFactory.getLog(ExampleJMSSender.class);
	
	private JmsTemplate jmsTemplate;

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	
	public void sendMesage(String message) {
		log.info(String.format("Send <%s>", message));
		
		jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				TextMessage textMess = session.createTextMessage(message);
				
				return textMess;
			}
		});

	}

}
