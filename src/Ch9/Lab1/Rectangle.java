package Ch9.Lab1;

public class Rectangle extends ShapeBase {

	private int height;
	private int width;
	
	public Rectangle(){
		super();
		height = 0;
		width = 0;
	}
	
	public Rectangle(int theOffset, int theHeight, int theWidth){
		super(theOffset);
		height = theHeight;
		width = theWidth;
	}
	
	public void reset(int newOffset, int newHeight, int newWidth){
		setOffset(newOffset);
		height = newHeight;
		width = newWidth;
	}
	
	public void drawHere(){
		drawHorizontalLine();
		
		if (height > 2)
			drawSides();
		
		if (height > 1)
			drawHorizontalLine();
	}
	
	private void drawHorizontalLine(){
		spaces(getOffset());
		int count;
		for (count = 0; count < width; ++count){
			System.out.print("-");
		}
		System.out.println();
	}
	
	private void drawSides(){
		int count;
		for (count = 0; count <(height - 2); ++count)
			drawOneLineOfSides();
	}
	
	private void drawOneLineOfSides(){
		spaces(getOffset());
		System.out.print('|');
		if (width > 1){
			spaces(width - 2);
			System.out.println('|');
		}
	}
	
	private static void spaces(int number){
		int count;
		for (count = 0; count < number; ++count){
			System.out.print(' ');
		}
	}
	
	public int area(){
		return (height * width);
	}
	
	public int circumference(){
		return (2 * height + 2 * width);
	}
}
