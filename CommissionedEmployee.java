/**
Program that creates a CommissionedEmployee class which
is a subclass of SalariedEmployee.  A CommissionedEmployee 
object keeps track of their weekly salary, their weekly sales,
and their commission percentage.

@author Hiram Raulerson
@version 1.1
 
E-mail Address: hhr3@students.uwf.edu.
 
Last Changed: October 11, 2015.
 
COP5007	Project #: 3
File Name: CommissionedEmployee.java
*/

import java.text.NumberFormat;
import java.util.Locale;

public class CommissionedEmployee extends SalariedEmployee
{
   /**
   Stores a commissioned employee's weekly sales (in dollars)
   */
   private double weeklySales;
   
   /**
   Stores a commissioned employee's commission percentage
   */
   private double commissionPercentage;
   
   /**
   Stores a NumberFormat object to output commission in appropriate currency
   */
   private NumberFormat rateFormatter;
   
   /**
   Default constructor creates a CommissionedEmployee object with 
   default values for all instance variables.  Sets NumberFormat object to US 
   currency.
   */
   public CommissionedEmployee()
   {
      super();
      setWeeklySales(250);
      setCommissionPercent(0.15);
      rateFormatter = NumberFormat.getCurrencyInstance(Locale.US);
   }
   
   /**
   Constructs a CommissionedEmployee object with the commissioned employee's 
   name equal to the first parameter value, the employee's weekly salary 
   set equal to the second parameter, the employee's weekly sales set equal to 
   the third parameter, and the employee's commission percentatge set equal to the 
   fourth parameter.  Sets NumberFormat object to US currency.
   @param name the commissioned employee's name
   @param salary the employee's weekly salary
   @param sales the employee's weekly sales
   @param commission the employee's commission percentage
   */
   public CommissionedEmployee(String name, double salary, double sales, double commission)
   {
      super(name, salary);
      setWeeklySales(sales);
      setCommissionPercent(commission);
      rateFormatter = NumberFormat.getCurrencyInstance(Locale.US);
   }

   /**
   Returns the commissioned employee's weekly sales
   @return the weekly sales of the employee
   */
   public double getWeeklySales()
   {
      return weeklySales;
   }
   
   /**
   Returns the commissioned employee's commission percentage
   @return the commission percentage of the employee
   */
   public double getCommissionPercent()
   {
      return commissionPercentage;
   }
   
   /**
   Returns the commissioned employee's commission 
   @return the commission of the employee based on their weekly sales
   */
   private double getCommission()
   {
      return getCommissionPercent() * getWeeklySales();
   }
   
   
   /**
	Sets the commissioned employee's weekly sales
   @param sales the weekly sales of the employee
   */
   public void setWeeklySales(double sales)
   {
      if (sales < 0)
      {
         System.out.println("Error: cannot set an employee's weekly sales with a " +
                           "negative number");
         System.out.println(super.getName() + "'s weekly sales set to $250.00.\n");
         
         weeklySales = 250.00;
      }
      else
      {
         weeklySales = sales;
      }
   }
   
   /**
	Sets the commissioned employee's commission percentage
   @param percent the commission percentage earned on an employee's
   weekly sales
   */
   public void setCommissionPercent(double percent)
   {
      if (percent < 0)
      {
         System.out.println("Error: cannot set an employee's commission percentage " +
                           "with a negative number");
         System.out.println(super.getName() + "'s commission percentage set to 15%.\n");
         
         commissionPercentage = 0.15;
      }
      else
      {
         commissionPercentage = percent;
      }
   }
   
   /**
	Calculates and returns a commissioned employee's weekly
   pay based on their weekly salary plus commission (commission
   percentage * weekly sales) 
   @return the employee's weekly pay
   */
   public double computePay()
   {
      if (getCommission() <= 0)
      {
         return super.getWeeklySalary();
      }
      else
      {
         return (super.getWeeklySalary() + getCommission());
      }
   }
   
   /**
	Returns a nicely formatted String composed of all of the 
   commissioned employee's details
	@return the details of a commissioned employee
   */
   public String toString()
   {
      return (super.toString() + "Commission:\t\t" + rateFormatter.format(getCommission()) + 
              "\n");
   }
}