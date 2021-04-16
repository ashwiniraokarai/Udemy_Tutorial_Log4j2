package testPackage01;

import org.apache.logging.log4j.LogManager; //LogManager class in turn does a big bunch of import - clue, it DEPENDS on methods from many other classes
import org.apache.logging.log4j.Logger;

public class testPackage01_Demo {

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
