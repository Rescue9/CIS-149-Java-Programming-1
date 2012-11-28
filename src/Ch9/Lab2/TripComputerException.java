package Ch9.Lab2;

public class TripComputerException extends Exception {
	
	private static final long serialVersionUID = 1L; // eclipse complains

	/**
	 * creates a new instance of TripComputerException
	 */
	public TripComputerException(String reason){
		super(reason);
	}

}
