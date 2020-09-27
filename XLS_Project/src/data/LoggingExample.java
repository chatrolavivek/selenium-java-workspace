package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		
		Logger app_log = Logger.getLogger("devpinoyLogger");
		app_log.debug("Hello");
		app_log.debug("We are writing in this log file");
		app_log.debug("Starting the test case xyz test..");
		app_log.debug("Starting the test case xyz test1..");
		
	}
}
