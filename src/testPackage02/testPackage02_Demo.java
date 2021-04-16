package testPackage02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class testPackage02_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Logger logger = LogManager.getLogger();
		 logger.debug("Debug Log");
		 
		 if (2<0) {
			 logger.info("Info Log");
		 }else {
			 logger.error("Error Log");
			 logger.fatal("Fatal Log");
		 }

	}

}
