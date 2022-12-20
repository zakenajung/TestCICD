package com.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Logging {

	/** Declare log for used in this class */
	// Automatic Detect logging.config in application
	private Logger log;

	/**
	 * 
	 * get Log.
	 * 
	 * @return
	 */
	public Logger getLog() {
		return log;
	}

	/**
	 * 
	 * set Log.
	 * 
	 * @param log
	 */
	public void setLog(final Logger log) {
		this.log = log;
	}

//	/**
//	 * 
//	 * Contructor of Logging.
//	 */
//
//	static {
//		File log4j2File = new File("*/log4j2.properties");
//		System.setProperty("log4j2.configurationFile", log4j2File.toURI().toString());
//	}

	/**
	 * 
	 * setLogInfo.
	 * 
	 * @param info
	 */
	public void info(final String info) {
		log.info(info);
	}

//	public Logging(final String className, final String log4JProperty) {
//
//		log = LogManager.getLogger(className);
////		final Properties prop = new Properties();
//		LoggerContext context = (LoggerContext) LogManager.getContext(false);
//		File file = new File(log4JProperty);
//
//		// this will force a reconfiguration
//		context.setConfigLocation(file.toURI());
////		final String log4JPropertyFile = LoadConfig.getProperty("LOG4J.CONFIG_FILE_PATH");
////		try {
////			prop.load(new FileInputStream(log4JProperty));
////			context.getConfiguration()
////			PropertyConfigurator.configure(prop);
////		} catch (IOException e) {
////			log.error("New Logging Error " + e.getMessage());
////		}
//
//	}

	public Logging(final String className) {
		// Get default config
//		this(className, LoadConfig.getProperty("LOG4J.CONFIG_FILE_PATH"));
		log = LogManager.getLogger(className);
	}

	// Info logging
	public void info(final String functionHeader, final String message) {
		log.info("Info [" + functionHeader + "] : " + message);
	}

	public void info(final String serviceName, final boolean isFromNGINX, final String hostName, final String ipAddress,
			final String accountNo, final String message) {
		log.info("Info [ServiceName=" + serviceName + "(FromNGINX=" + isFromNGINX + "), Hostname=" + hostName + "(IP="
				+ ipAddress + "), AccountNO=" + accountNo + "] : " + message);
	}

	// Debug logging
//	public void debug(final String message) {
//		log.debug(message);
//	}

	public void debug(final String functionHeader, final String message) {
		log.info("Debug [" + functionHeader + "] : " + message);
	}

	// Warning logging
	public void warn(final String functionHeader, final String message, final String className) {
		log.info("Warning [" + functionHeader + "] : " + message);
	}

	public void warn(final String serviceName, final boolean isFromNGINX, final String hostName, final String ipAddress,
			final String accountNo, final String message, final String className) {
		log.info("Warning [ServiceName=" + serviceName + "(FromNGINX=" + isFromNGINX + "), Hostname=" + hostName
				+ "(IP=" + ipAddress + "), AccountNO=" + accountNo + "] : " + message);
	}

	// Error logging
	public void error(final String functionHeader, final String message, final Exception exceptionObject) {
		log.info("Error [" + functionHeader + "] : " + message);
		if (exceptionObject != null) {
			log.info("Exception : " + exceptionObject.getClass().getCanonicalName());
			log.info("StackTraceElement : " + "xxx");
		}
	}

	public void error(final String functionHeader, final String message) {
		error(functionHeader, message, null);
	}

	public void debug(final String message) {
		log.debug(message);
	}

	public void warn(final String message) {
		log.warn(message);
	}

	public void error(final String message) {
		log.error(message);
	}

	public void fatal(final String message) {
		log.error(message);
	}

}