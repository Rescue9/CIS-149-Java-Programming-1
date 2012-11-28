package Ch9.Lab1;

public class DimensionException extends Exception {

	private static final long serialVersionUID = 1L; // eclipse complains
	
	public DimensionException(){
		super("Invalid dimension: it must be greater than zero.");
	}
	
	public DimensionException(String dimension, int value){
		super(value + " is invalid for " + dimension
				+ ": it must be greater than zero.");
	}
	
	public DimensionException(String message){
		super(message);
	}
}
