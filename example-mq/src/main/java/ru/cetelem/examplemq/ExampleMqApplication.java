package ru.cetelem.examplemq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class ExampleMqApplication   implements CommandLineRunner{
	private static final Log log = LogFactory.getLog(ExampleMqApplication.class);
	
	@Autowired
	private ExampleJMSSender exampleJMSSender;
	
	public static void main(String[] args) {
		SpringApplication.run(ExampleMqApplication.class, args);
	}
	


    @Override
    public void run(String... args) throws Exception {
    	log.info("started!");
    	exampleJMSSender.sendMesage("Hello world!".getBytes());
    }
		
}
