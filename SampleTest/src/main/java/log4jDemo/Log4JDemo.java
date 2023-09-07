package log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;



public class Log4JDemo {

    static Logger logger= (Logger) LogManager.getLogger(Log4JDemo.class);
	
	
	public static void main(String[] args) {
		System.out.println("\n   Hello world    \n");
		
		logger.trace("This is a Trace message");
		logger.info("This is an Information message");
		logger.error("This is an Error message");
		logger.warn("This is a Warning message");
		logger.fatal("This is a Fatal message");
		
		System.out.println("\n  Completed");
		
		
		
	}
}
