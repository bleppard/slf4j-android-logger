package com.leppardlabs.slf4j.android.logger;

/**
 * Created by benjaminl on 5/26/2016.
 */
public class AndroidLoggerConfig {
	// Current log level and tag
	static LogLevel logLevel = LogLevel.INFO;
	static String logTag = "Slf4jAndroidLogger";
	static boolean logToAndroid = true;
	static boolean logToCrashlytics = false;
	static boolean logToLogEntries = false;

	/**
	 * Initialize the logger. Should be called before any logging statements.
	 *
	 * @param logToAndroid Whether or not to log the Android Logging System.
	 * @param logLevel The slf4j level to log to the logging systems.
	 * @param logTag The log tag to use when logging to Android's logger. Maximum 23 chars!
	 * @param logToCrashlytics  Whether or not to log to Crashlytics.
	 * @param logToLogEntries Whether or not to log to LogEntries.com.
	 */
	public static void init(boolean logToAndroid, LogLevel logLevel, String logTag,
			boolean logToCrashlytics, boolean logToLogEntries) {

		AndroidLoggerConfig.logToAndroid = logToAndroid;
		setLogLevel(logLevel);
		setLogTag(logTag);
		AndroidLoggerConfig.logToCrashlytics = logToCrashlytics;
		AndroidLoggerConfig.logToLogEntries = logToLogEntries;
	}

	public static LogLevel getLogLevel() {
		return logLevel;
	}

	public static void setLogLevel(final LogLevel logLevel) {
		AndroidLoggerConfig.logLevel = logLevel;
	}

	public static String getLogTag() {
		return logTag;
	}

	public static void setLogTag(final String logTag) {
		AndroidLoggerConfig.logTag = logTag;
	}
}
