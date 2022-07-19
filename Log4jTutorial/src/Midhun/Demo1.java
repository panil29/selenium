package Midhun;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {

	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

log.debug("i am debugging");
       log.info("object is present");
	log.error("object is not present");
    
	log.fatal("this is fatal");
	
	
	
	
	
	
	}

}
