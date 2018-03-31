package hello;

import javax.sql.DataSource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {
	static final Logger log = LogManager.getLogger(SampleController.class); 

	@Autowired
	DataSource dataSource;

	@Autowired
	Mytable1Repository myTable1Repository;  
	
    @RequestMapping("/")
    @ResponseBody
    String home() {
    	
		log.info("findAll()...");
		
		for (Mytable1 myTable1 : myTable1Repository.findByNameLike("11")) {
			 return "found: " + myTable1.name; 
			//log.info (myTable1);
		}


		log.info ("Done!");
		
        return "Not found -  Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}