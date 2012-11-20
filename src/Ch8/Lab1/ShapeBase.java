package Ch8.Lab1;

public abstract class ShapeBase implements ShapeInterface {

	private int offset;
	
	public abstract void drawHere();
	
	public ShapeBase(){
		offset = 0;
	}
	
	public ShapeBase(int theOffset){
		offset = theOffset;
	}
	
	public void drawAt(int lineNumber){
		for (int count = 0; count < lineNumber; count++){
			System.out.println(); // I like braces because it helps me better read code when I need to debug.
		}
		drawHere();
	}
	
	public void setOffset(int newOffset){
		offset = newOffset;
	}
	
	public int getOffset(){
		return offset;
	}
}
