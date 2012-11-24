package Ch8.Program1;


// Employee class; this is named Employee to distinguish it
// from the Employee class from Programming Project 1
public class Employee extends Person
{
    private int employeeID;
    private String department;

    public Employee( )
    {
        super( );
        employeeID = 0;//Indicating no number yet
        department = "";
    }

    public Employee(String initialName, String initialDepartment, int initialID)
    {
        super(initialName);
        department = initialDepartment;
        employeeID = initialID;
    }

    public void reset(String newName, String newDepartment, int newID)
    {
        setName(newName);
        department = newDepartment;
        employeeID = newID;
    }

    public int getEmployeeID( )
    {
        return employeeID;
    }

    public void setEmployeeID(int newID)
    {
        employeeID = newID;
    }

    public void writeOutput( )
    {
        System.out.println("Name: " + getName( ));
        System.out.println("Dept: " + department);
        System.out.println("Employee ID: " + employeeID);
    }

    public boolean equals(Employee otherEmployee)
    {
        return this.hasSameName(otherEmployee) &&
              (this.employeeID == otherEmployee.employeeID);
    }


    public String toString( )
    {
        return "Name: " + getName( ) +
        	   "\nDept: " + department +
			   "\nEmployee ID: "  + employeeID;
    }
}
