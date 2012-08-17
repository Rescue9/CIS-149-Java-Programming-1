package Ch1.Program1;

public class Flag {

	// flag is 55 characters across

	public static void main(String[] args){
		
		// calling methods
		topAndBottom();
		blankBorderStarsArea();
		sixStars();
		blankBorderStarsArea();
		fiveStarsEmpty();
		blankBorderStarsAreaStripe();
		sixStarsEmpty();
		blankBorderStarsAreaStripe();
		fiveStarsEmpty();
		blankBorderStarsArea();
		sixStars();
		blankBorderStarsArea();
		fiveStars();
		blankBorderStarsArea();
		sixStarsEmpty();
		blankBorderStarsAreaStripe();
		fiveStarsEmpty();
		blankBorderStarsAreaStripe();
		sixStarsEmpty();
		stripeStarsArea();
		blankBorderStripesArea();
		stripes();
		blankBorderStripesArea();
		stripes();
		blankBorderStripesArea();
		stripes();
		blankBorderStripesArea();
		stripes();
		blankBorderStripesArea();
		stripes();
		blankBorderStripesArea();
		blankBorderStripesArea();
		topAndBottom();
		
	}
	
	public static void topAndBottom(){
		System.out.println("*******************************************************");
	}
	
	public static void blankBorderStarsArea(){
		System.out.println("*            |                                        *");
	}
	
	public static void blankBorderStarsAreaStripe(){
		System.out.println("*            |________________________________________*");
	}
	
	public static void sixStars(){
		System.out.println("* * * * * * *|________________________________________*");
	}
	
	public static void sixStarsEmpty(){
		System.out.println("* * * * * * *|                                        *");
	}
	
	public static void fiveStars(){
		System.out.println("*  * * * * * |________________________________________*");
	}
	
	public static void fiveStarsEmpty(){
		System.out.println("*  * * * * * |                                        *");
	}
	
	public static void blankBorderStripesArea(){
		System.out.println("*                                                     *");
	}
	
	public static void stripes(){
		System.out.println("*_____________________________________________________*");
	}
	
	public static void stripeStarsArea(){
		System.out.println("*____________|________________________________________*");

	}

}
