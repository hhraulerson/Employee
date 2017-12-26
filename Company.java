/**
Program that creates a Company class which stores all
Employee objects of a company.  Amongst other functions, this class 
can search for an employee using their ID, calculate the total 
payroll for the company (based on a 40 hour work week), and 
return the number of employees in the company.

@author Hiram Raulerson
@version 1.2
 
E-mail Address: hhr3@students.uwf.edu.
 
Last Changed: October 11, 2015.
 
COP5007	Project #: 3
File Name: Company.java
*/

import java.util.ArrayList;

public class Company
{
   /**
   A container to store all of a company's employees
   */
   private ArrayList<Employee> company;
   
   /**
   Stores a company's name
   */
   private String companyName;
   
   /**
   Default constructor constructs a Company object with 
   the company name set with a default value.  Also creates an
   ArrayList container (with capacity = 25) to store the 
   company's employees in. 
   */
   public Company()
   {
      setCompanyName("");
      company = new ArrayList<Employee>(25);      
   }
   
   /**
   Constructs a Company object with with the company name set equal to
   the parameter value.  Also creates an ArrayList container 
   (with capacity = 25) to store the company's employees in.
   @param aName the company's name 
   */
   public Company(String aName)
   {
      setCompanyName(aName);
      company = new ArrayList<Employee>(25);      
   }
   
   /**
   Returns the company's name
   @return the company's name
   */
   public String getCompanyName()
   {
      return companyName;
   }
   
   /**
	Sets the company's name
   @param aName the company's name
   */
   public void setCompanyName(String aName)
   {
      if (aName == null || aName.equals(""))
      {
         companyName = "Insert Company Name Here";
      }
      else
      {
         companyName = aName;
      }
   }
   
   /**
	Adds an employee to the company's container
   @param e the employee that is added to the container
   */
   public void addEmployee(Employee e)
   {
      company.add(e);
   }
   
   /**
	Searches for an employee using the employee's ID.  The employee
   object is returned if an employee exists with that ID.  Otherwise,
   a null object is returned.
   @param ID the employee's ID
   @return an employee object
   */
   public Employee getEmployee(int ID)
   {
      for (Employee e : company)
      {
         if (ID == e.getEmployeeID())
         {
            return e;
         }
      }
      
      System.out.println("\nError: No employee with employee ID " + ID +
                        " was found, so a \"null\" object was returned.");
                        
      return null;
   }
   
   /**
	Returns the number of employees in the company
   @return the number of employees in the company
   */
   public int getTotalNumberOfEmployees()
   {
      return company.size();
   }
   
   /**
	Returns the total employee for the company.  All employees
   pay is calculated and summed up.
   @return the company's total payroll
   */
   public double getTotalPayroll()
   {
      double payroll = 0;
      
      for (Employee e: company)
      {
         payroll += e.computePay();
      }
      
      return payroll;
   }
   
   /**
	Returns a nicely formatted String composed of all employees in 
   a company
	@return the details of all employees in a company
   */
   public String toString()
   {
      String allEmployees = "*********************************\n\n" + getCompanyName() +
                           "'s Employees: " + "\n\n";
      
      for (Employee e: company)
      {
         allEmployees += e.toString() + "\n";
      }
      
      allEmployees += "*********************************";
      
      return allEmployees;
   }
   
}