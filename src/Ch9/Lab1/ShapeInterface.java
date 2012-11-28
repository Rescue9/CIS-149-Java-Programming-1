package Ch9.Lab1;

public interface ShapeInterface {
	
	/**
	 * sets the offset for the shape
	 */
	public void setOffset(int newOffset);
	
	/**
	 * returns the offset for the shape
	 */
	public int getOffset();
	
	/**
	 * draws the shape at lineNumber lines down from the current line
	 */
	public void drawAt(int lineNumber);
	
	/**
	 * draws the shape at the current line
	 */
	public void drawHere();
	
}
