package Ch9.Lab1;

/**
 Filename: RightTriangle.java

 Class for right triangle to be drawn on screen. For this class,
 a triangle points up and is completely determined by the size of
 its base. The height is made equal to its base to accommodate
 screen character spacing.  The triangle is printed with the
 vertical side first.

 Also has methods to calculate area and circumference.

 Inherits getOffset, setOffset, and drawAt from ShapeBase class,
 Listing 8.15.

 Based on Triangle.java, Listing 8.13.

 Programmer: Lew Rakocy
 email: LRakocy@devrycols.edu
 Date: 9/9/2000
 Changes: 03/15/2003 Made comments like text examples.
          03/27/2003 Deleted code to set minimum length of base and added
                     code to print nothing if base = 0 and only one * if
                     base = 1.
*/
public class RightTriangle extends ShapeBase
{
    private int base;

    public RightTriangle()
    {
        super();
        base = 0;
    }

    public RightTriangle(int theOffset, int theBase)
    {
        super(theOffset);
        base = theBase;
    }

    public void reset(int newOffset, int newBase)
    {
        setOffset(newOffset);
        base = newBase;
    }

    /**
     Draws the figure at current line.
    */
    public void drawHere()
    {
        drawTop();
        if(base > 1)
            drawBase();
    }

    private void drawBase()
    {
        spaces(getOffset());
        int count;
        for (count = 0; count < base; ++count)
            System.out.print('*');
        System.out.println();
    }

    private void drawTop()
    {
        // First line prints only if base > 0.

        if(base > 0)
        {
            spaces(getOffset());
            System.out.println("*");
        }

        // Print intermediate lines

        for(int lineNumber = 2; lineNumber < base; ++lineNumber)
        {
            spaces(getOffset());
            System.out.print("*"); // Start of line

            // Print spaces if there are any.
            // The number of spaces on a line is two less than
            // the line number.

            for(int i = 1; i <= lineNumber -2; ++i)
                System.out.print(" ");
            System.out.println("*"); // End of line
        }
    }

    private static void spaces(int number)
    {
        int count;
        for (count = 0; count < number; ++count)
            System.out.print(' ');
    }

    /**
     Methods to calculate area and circumference.
    */
    public double area()
    {
        return (0.5 * base * base);
    }

    public double circumference()
    {
        return (2 * base + base * Math.sqrt(2));
    }
}