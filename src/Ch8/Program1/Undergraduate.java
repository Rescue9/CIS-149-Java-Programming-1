package Ch8.Program1;

public class Undergraduate extends Student
{
    private int level; //1 for freshman, 2 for sophomore,
                       //3 for junior, or 4 for senior.
    public Undergraduate( )
    {
        super( );
        level = 1;
    }
    
    public Undergraduate(String initialName, int initialStudentNumber, 
                         int initialLevel)
    {
        super(initialName, initialStudentNumber);
        setLevel(initialLevel); //Checks 1 <= initialLevel <= 4
    }
    
    public void reset(String newName, int newStudentNumber, 
	                  int newLevel)
    {
        reset(newName, newStudentNumber); //Student�s reset
        setLevel(newLevel); //Checks 1 <= newLevel <= 4
    }
    
    public int getLevel( )
    {
        return level;
    }
    
    public void setLevel(int newLevel)
    {
        if ((1 <= newLevel) && (newLevel <= 4))
            level = newLevel;
        else
        {
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }
    
    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.println("Student Level: " + level);
    }
 
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return equals((Student)otherUndergraduate) &&
               (this.level == otherUndergraduate.level);
    }
/*  // Alternate version 
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return super.equals(otherUndergraduate) &&
               (this.level == otherUndergraduate.level);
    }
*/	
}
