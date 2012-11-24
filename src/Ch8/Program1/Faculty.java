package Ch8.Program1;

public class Faculty extends Employee
{
    private String title;		// Every faculty member has a title

    public Faculty( )
    {
        super( );
        title = "";
    }

    public Faculty(String initialName, String initialDepartment, int initialID,
                   String initialTitle)
    {
        super(initialName, initialDepartment, initialID);
        title = initialTitle;
    }

    public void reset(String newName, String newDept, int newID,
	                  String newTitle)
    {
        reset(newName, newDept, newID); //Employee's reset
        title = newTitle;
    }

    public String getTitle( )
    {
        return title;
    }

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.println("Title: " + title);
    }

}
