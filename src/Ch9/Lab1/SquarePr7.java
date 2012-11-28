package Ch9.Lab1;

public class SquarePr7 extends Rectangle{

	public SquarePr7(){
		super();
	}
	
	public SquarePr7(int theOffset, int theSide){
		super(theOffset, theSide, theSide);
	}
	
	public void reset(int newOffset, int newSide){
		super.reset(newOffset, newSide, newSide);
	}
}
