package org.newdawn.spaceinvaders;


import java.time.Duration;
import java.time.Instant;

/**
 * A wrapper class that provides timing methods. This class
 * provides us with a central location where we can add
 * our current timing implementation. In this version, we're going to
 * rely on the java.time package and java.lang.Thread.sleep() method.
 *
 * @author Kevin Glass, modified by Assistant
 */
public class SystemTimer {
	/**
	 * Get the high resolution time in milliseconds
	 *
	 * @return The high resolution time in milliseconds
	 */
	public static long getTime() {
		// Using Instant class to get the current high resolution time in milliseconds
		return Instant.now().toEpochMilli();
	}

	/**
	 * Sleep for a fixed number of milliseconds.
	 *
	 * @param duration The amount of time in milliseconds to sleep for
	 */
	public static void sleep(long duration) {
		try {
			// Using Thread.sleep() method to sleep for a given duration in milliseconds
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// In case of interruption, print the stack trace
			e.printStackTrace();
		}
	}
}
