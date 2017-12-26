/**
Program that creates a SalariedEmployee class which
is a subclass of Employee.  A SalariedEmployee object keeps
track of their weekly salary.

@author Hiram Raulerson
@version 1.1
 
E-mail Address: hhr3@students.uwf.edu.
 
Last Changed: October 11, 2015.
 
COP5007	Project #: 3
File Name: SalariedEmployee.java
*/

import java.text.NumberFormat;
import java.util.Locale;

public class SalariedEmployee extends Employee
{
   /**
   Stores a salaried employee's weekly salary (in dollars)
   */
   private double weeklySalary;
   
   /**
   Stores a NumberFormat object to output weekly salary in appropriate currency
   */
   private NumberFormat rateFormatter;
   
   /**
   Default constructor creates a SalariedEmployee object with 
   default values for all instance variables.  Sets NumberFormat 
   object to US currency.
   */
   public SalariedEmployee()
   {
      super();
      setWeeklySalary(500);
      rateFormatter = NumberFormat.getCurrencyInstance(Locale.US);
   }
   
   /**
   Constructs a SalariedEmployee object with the salaried employee's 
   name equal to the first parameter value and the salaried employee's 
   weekly salary set equal to the second parameter
   @param name the salaried employee's name.  Sets NumberFormat object 
   to US currency.
   @param salary the employee's weekly salary
   */
   public SalariedEmployee(String name, double salary)
   {
      super(name);
      setWeeklySalary(salary);
      rateFormatter = NumberFormat.getCurrencyInstance(Locale.US);
   }
   
   /**
   Returns the salaried employee's weekly salary
   @return the weekly salary of the employee
   */
   public double getWeeklySalary()
   {
      return weeklySalary;
   }
   
   /**
	Sets the salaried employee's weekly salary
   @param salary the weekly salary of the employee
   */
   public void setWeeklySalary(double salary)
   {
      if (salary < 0)
      {
         System.out.println("Error: cannot set an employee's weekly salary with a " +
                           "negative number");
         System.out.println(super.getName() + "'s salary set to $500.00.\n");
         
         weeklySalary = 500.00;
      }
      else
      {
         weeklySalary = salary;
      }
   }
   
   /**
	Returns a salary employee's weekly salary
   @return the employee's weekly salary
   */
   public double computePay()
   {
      return getWeeklySalary();
   }
   
   /**
	Returns a nicely formatted String composed of all of the 
   salaried employee's details
	@return the details of a salaried employee
   */
   public String toString()
   {
      return (super.toString() + "Weekly Salary:\t\t" + rateFormatter.format(getWeeklySalary()) + 
               "\n");
   }
}