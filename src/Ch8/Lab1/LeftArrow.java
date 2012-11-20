package Ch8.Lab1;

public class LeftArrow extends ShapeBase {
	
	private int tail;
	private int base;
	
	public LeftArrow(){
		super();
		tail = 0;
		base = 3;
	}
	
	public LeftArrow(int theOffset, int theTail, int theBase){
		super(theOffset);
		tail = theTail;
		if(theBase<3){
			base = 3;
		}else if (theBase %2 == 0){ // remainder == 0 is an even number
			base = theBase + 1; // add one to make it odd
			System.out.println("Added 1 to make the base odd");
		}else {
			base = theBase;
		}
	}
	
	public LeftArrow(int theTail, int theBase){
		super();
		tail = theTail;
		if(theBase <3){
			base = 3;
		}else if (theBase %2 == 0){	// is it odd...
			base = theBase + 1; // make it odd
			System.out.println("Added 1 to make the base odd");
		} else {
			base = theBase;
		}
	}

	public void set(int newOffset, int newTail, int newBase){
		setOffset(newOffset);
		tail = newTail;
		if(newBase <3){
			base = 3;
		}else if (newBase %2 == 0){	// is it odd...
			base = newBase + 1; // make it odd
			System.out.println("Added 1 to make the base odd");
		} else {
			base = newBase;
		}
	}
	
	/**
	 * method to change the length of the tail
	 */
	public void setTail(int newTail){
		tail = newTail;
	}
	
	/**
	 * method to change the size of the base of the arrowhead
	 */
	public void setBase(int newBase){
		if (newBase <3){
			base = 3;
		}else if (newBase % 2 == 0){ // is it odd...
			base = newBase + 1; // make it odd
			System.out.println("Added 1 to make the base odd");
		}else {
			base = newBase;
		}
	}
	
	/**
	 * method to write the values of the three parameters
	 */
	public void writeOutput(){
		writeOffset();
		writeTail();
		writeBase();
	}
	
	/**
	 * method to write the value of offset
	 */
	public void writeOffset(){
		System.out.println("Offset = " + getOffset());
	}
	
	/**
	 * method to write the value of tail
	 */
	public void writeTail(){
		System.out.println("Tail = " + getTail());
	}
	
	/**
	 * method to write the value of base
	 */
	public void writeBase(){
		System.out.println("Base = " + getBase());
	}
	
	/**
	 * method to return the value of tail
	 */
	public int getTail(){
		return tail;
	}
	
	/**
	 * method to return the value of base
	 */
	public int getBase(){
		return base;
	}
	
	/**
	 * draws the left arrow at the current line
	 */
	public void drawHere(){
		drawTop();
		drawTail();
		drawBottom();
	}
	
	/**
	 * draws the top at the current line
	 */
	public void drawTop(){
		int linecount = getBase() / 2;
		int numberOfSpaces = getOffset() + linecount * 2;
		spaces(numberOfSpaces);
		System.out.println("*");
		int count;
		int insideWidth = 1;
		for(count =1; count < linecount; ++count){
			numberOfSpaces = numberOfSpaces - 2;
			spaces(numberOfSpaces);
			System.out.print("*");
			spaces(insideWidth);
			System.out.println("*");
			insideWidth = insideWidth + 2;
		}
	}
	
	/**
	 * draws the tail at the current line
	 */
	public void drawTail(){
		spaces(getOffset());
		System.out.print("*");
		int insideWidth = (int)(getBase() / 2) * 2 - 1;
		spaces(insideWidth);
		int count;
		for(count =0; count <= tail; ++count){
			System.out.print("*");
		}
		System.out.println();
	}
	
	/**
	 * draws the bottom at the current line
	 */
	public void drawBottom(){
		int startOfLine = getOffset() + 2;
		int count;
		int linecount = getBase() / 2;
		int insideWidth = (linecount - 1) * 2 - 1;
		for(count =1; count < linecount; ++count){
			spaces(startOfLine);
			System.out.print("*");
			spaces(insideWidth);
			System.out.println("*");
			startOfLine = startOfLine + 2;
			insideWidth = insideWidth - 2;
		}
		
		// print the last line
		spaces(startOfLine);
		System.out.println("*");
	}
	
	/**
	 * method to write the indicated number of spaces
	 */
	public static void spaces(int number){
		int count;
		for(count =0; count < number; ++count){
			System.out.print(' '); // there is a single space between the quotes
		}
	}
}
