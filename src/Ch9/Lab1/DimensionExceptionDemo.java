package Ch9.Lab1;

import java.util.Scanner;

public class DimensionExceptionDemo {
	
	public static int indent;
	public static int triangleSide;
	public static int side;
	public static int bottom;
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		char repeat; // repeat if user enters y for yes
		
		do {
			try {
				System.out.println();
				System.out.println("Enter indent value:");
				indent = keyboard.nextInt();
				if (indent < 0)
					throw new DimensionException("indent", indent);
				
				System.out.println();
				System.out.println("Enter triangle side value:");
				triangleSide = keyboard.nextInt();
				if (triangleSide <= 0)
					throw new DimensionException("triangle side", triangleSide);
				
				System.out.println();
				System.out.println("Enter rectangle and square side value:");
				side = keyboard.nextInt();
				if (side <= 0)
					throw new DimensionException("side", side);
				
				System.out.println();
				System.out.println("Enter rectangle bottom value");
				bottom = keyboard.nextInt();
				if (bottom <=0)
					throw new DimensionException("bottom", bottom);
				
				RightTriangle t1 = new RightTriangle(indent, triangleSide);
				Rectangle r1 = new Rectangle(indent, side, bottom);
				SquarePr7 s1 = new SquarePr7(indent, side);
				
				t1.drawAt(1);
				System.out.println();
				System.out.println("Area of triangle = " + t1.area());
				System.out.println();
				System.out.println("Circumference of triangle= " + t1.circumference());
				System.out.println();
				System.out.println("======================================");
				
				r1.drawAt(2);
				System.out.println("Area of rectangle = " + r1.area());
				System.out.println();
				System.out.println("Circumference of rectangle = " + r1.circumference());
				System.out.println();
				System.out.println("======================================");
				
				s1.drawAt(3);
				System.out.println("Area of square = " + s1.area());
				System.out.println();
				System.out.println("Circumference of square = " + s1.circumference());
				System.out.println();
				System.out.println("======================================");
			}
			
			catch (DimensionException e){
				System.out.println(e.getMessage());
			}
			
			System.out.println();
			System.out.println("Do again? (y or Y for Yes");
			repeat = keyboard.next().charAt(0);
		} while ((repeat == 'y') || (repeat == 'Y'));		
	}
}
