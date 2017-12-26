/**
Program that creates an HourlyEmployee class which
is a subclass of Employee.  An HourlyEmployee object keeps
track of the number of hours they worked and their hourly wage.

@author Hiram Raulerson
@version 1.2
 
E-mail Address: hhr3@students.uwf.edu.
 
Last Changed: October 11, 2015.
 
COP5007	Project #: 3
File Name: HourlyEmployee.java
*/

import java.text.NumberFormat;
import java.util.Locale;

public class HourlyEmployee extends Employee
{
   /**
   Stores an hourly employee's hourly rate
   */
   private double hourlyRate;
   
   /**
   Stores the number of hours an hourly employee worked during a week
   */
   private double hrsWorked;

   /**
   Stores a NumberFormat object to output weekly salary in appropriate currency
   */
   private NumberFormat rateFormatter;
   
   /**
   Default constructor creates an HourlyEmployee object with 
   default values for all instance variables.  Sets NumberFormat 
   object to US currency.
   */
   public HourlyEmployee()
   {
      super();
      setRate(10.00);
      setHoursWorked(40.00);
      rateFormatter = NumberFormat.getCurrencyInstance(Locale.US);
   }

   /**
   Constructs an HourlyEmployee object with the hourly employee's name equal to
   the first parameter value, the hourly employee's hourlyRate set equal to 
   the second parameter, and the hourly employee's hrsWorked set 
   equal to the third parameter value.  Sets NumberFormat object to US 
   currency.
   @param name the hourly employee's name
   @param rate the hourly employee's hourly rate
   @param hours the weekly hours for an hourly employee
   */
   public HourlyEmployee(String name, double rate, double hours)
   {
      super(name);
      setRate(rate);
      setHoursWorked(hours);
      rateFormatter = NumberFormat.getCurrencyInstance(Locale.US);
   }
   
   /**
   Returns the hourly employee's hourly rate
   @return the hourly rate of the employee
   */
   public double getRate()
   {
      return hourlyRate;
   }
   
   /**
   Returns the hours an hourly employee worked during a week
   @return the employee's hours worked during a week
   */
   public double getHoursWorked()
   {
      return hrsWorked;
   }

   /**
	Sets the hourly employee's hourly rate
	@param rate the hourly rate of the employee
   */
   public void setRate(double rate)
   {
      if (rate < 0)
      {
         System.out.println("Error: cannot set an employee's hourly wage with a " +
                           "negative number");
         System.out.println(super.getName() + "'s hourly rate set to $10.00/hour.\n");
        
         hourlyRate = 10.00;
      }
      else
      {
         hourlyRate = rate;
      }
   }
   
   /**
	Sets the hourly employee's hours worked in a week 
	@param hours the employee's hours worked in a week
   */
   public void setHoursWorked(double hours)
   {
      if (hours < 0)
      {
         hrsWorked = 40.00;
      }
      else
      {
         hrsWorked = hours;
      }
   }
   
   /**
	Calculates and returns an hourly employee's weekly
   pay based on the number of hours worked and their hourly wage
   (hourly employees earn 1.5x their wage when working over 40 hours
   in a given week)
   @return the employee's weekly pay
   */
   public double computePay()
   {
      double overtimeHours = getHoursWorked() - 40;
      
      if (overtimeHours <= 0)
      {
         return (getHoursWorked() * getRate());
      }
      else
      {
         return ((40 * getRate()) + (overtimeHours * getRate() * 1.5));
      }
   }
   
   /**
	Returns a nicely formatted String composed of all of the 
   hourly employee's details
	@return the details of an hourly employee
   */
   public String toString()
   {
      return (super.toString() + "Hourly Rate:\t\t" + rateFormatter.format(getRate()) + "\n");
   }
}