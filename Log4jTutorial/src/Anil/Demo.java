package Anil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

log.debug("i have clicked on button");
       log.info("Button is displayed");
	log.error("button is not displayed");
    
	log.fatal("button is missing");
	
	
	
	
	
	
	}

}
