package edu.unc.genomics.io;

/**
 * Exception thrown when an Interval file's format cannot be autodetected
 * 
 * @author timpalpant
 * 
 */
public class IntervalFileSnifferException extends RuntimeException {

  private static final long serialVersionUID = 4085343850715532399L;

  /**
	 * 
	 */
  public IntervalFileSnifferException() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @param message
   */
  public IntervalFileSnifferException(String message) {
    super(message);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param cause
   */
  public IntervalFileSnifferException(Throwable cause) {
    super(cause);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param message
   * @param cause
   */
  public IntervalFileSnifferException(String message, Throwable cause) {
    super(message, cause);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param message
   * @param cause
   * @param enableSuppression
   * @param writableStackTrace
   */
  public IntervalFileSnifferException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
    // TODO Auto-generated constructor stub
  }

}
