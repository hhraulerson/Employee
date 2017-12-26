/**
Program that creates an abstract Employee class.

@author Hiram Raulerson
@version 1.2
 
E-mail Address: hhr3@students.uwf.edu.
 
Last Changed: October 11, 2015.
 
COP5007	Project #: 3
File Name: Employee.java
*/

public abstract class Employee
{
   /**
   Tracks the next available ID number that can be assigned to 
   an employee
   */
   private static int nextIDNum = 1000;
   
   /**
   Stores the employee's name
   */
   private String name;
   
   /**
   Stores the employee's ID
   */
   private int IDNum;
   
   /**
   Default constructor creates an Employee object with default values 
   for all instance variables
   */
   public Employee()
   {
      setName("No Name");
      setEmployeeID();
   }
   
   /**
   Constructs an Employee object with the employee's name equal to
   the first parameter value and the employee's ID set using the static
   variable nextIDNum
   @param aName the employee's name
   */
   public Employee(String aName)
   {
      setName(aName);
      setEmployeeID();
   }
   
   /**
   Returns the employee's name
   @return the name of the employee
   */
   public String getName()
   {
      return name;
   }
   
   /**
   Returns the employee's ID
   @return the employee's ID
   */
   public int getEmployeeID()
   {
      return IDNum;
   }
   
   /**
   Returns the next available ID number that be can be 
   used to set an employee's ID
   @return the next available ID number
   */
   public static int getNextID()
   {
      return nextIDNum;
   }
   
   /**
	Sets the employee's name
	@param employeeName the name of the employee
   */
   public void setName(String employeeName)
   {
      if (employeeName == null || employeeName.equals(""))
      {
         System.out.println("Error: cannot use an empty string or a null " +
                           "string to assign an employee their name");
         System.out.println("Employee's name set to \"No Name\".\n");
         
         name = "No Name";
      } 
      else
      {
         name = employeeName;
      }
   }
   
   /**
	Sets the employee's ID number using the next
   available ID number (maintained by the static variable
   nextIDNum)
   */
   public void setEmployeeID()
   {
      IDNum = getNextID();
      
      incrementNextID();
   }
   
   /**
	Increments the next available ID number
   */
   private static void incrementNextID()
   {
      ++nextIDNum;
   }
   
   /**
	Abstract method that will calculate the
   weekly pay for an employee
   @return the employee's weekly pay
   */
   public abstract double computePay();
   
   /**
	Returns a nicely formatted String composed of all of the 
   employee's details
	@return the details of an employee
   */
   public String toString()
   {
      return ("Employee name:\t\t" + getName() + 
               "\nEmployee ID Number:\t" + getEmployeeID() + "\n");
   }
}