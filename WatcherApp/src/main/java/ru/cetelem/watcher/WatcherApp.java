package ru.cetelem.watcher;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


import io.hawt.springboot.EnableHawtio;
import io.hawt.web.AuthenticationFilter;




@SpringBootApplication
@EnableHawtio
@ImportResource("classpath:camel-context.xml")
public class WatcherApp {
	
	private static final Log log = LogFactory.getLog(WatcherApp.class);
	
	public static void main(String[] args) {
		
		

		log.info("Init WatcherApp");
		log.info("See logs in logs\\watcharapp.logs");
		log.info("See admin console on http://localhost:8080/hawtio/index.html");
		log.info("------------------------------------------------------------");
		
		System.setProperty(AuthenticationFilter.HAWTIO_AUTHENTICATION_ENABLED, "false");
		SpringApplication.run(WatcherApp.class, args);
		
	}
} 



