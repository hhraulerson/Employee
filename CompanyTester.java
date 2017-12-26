/**
Program that creates a CompanyTester class to test the Company
and all Employee classes.  

@author Hiram Raulerson
@version 1.1
 
E-mail Address: hhr3@students.uwf.edu.
 
Last Changed: October 11, 2015.
 
COP5007	Project #: 3
File Name: CompanyTester.java
*/

public class CompanyTester
{
   public static void main(String[] args)
   {
      CommissionedEmployee e1 = new CommissionedEmployee();
      CommissionedEmployee e2 = new CommissionedEmployee("David Hancock", -1, -1, -1);
      CommissionedEmployee e3 = new CommissionedEmployee("Herbie Hancock", 2000, 250, .10);
      CommissionedEmployee e4 = new CommissionedEmployee("John Hancock", 300, 25, 1);
      CommissionedEmployee e5 = new CommissionedEmployee("Alan Hancock", 40, 900, .75);
      SalariedEmployee e6 = new SalariedEmployee();
      SalariedEmployee e7 = new SalariedEmployee("Jim Smith", -1);
      SalariedEmployee e8 = new SalariedEmployee("John Smith", 2900);
      SalariedEmployee e9 = new SalariedEmployee("James Smith", 4568);
      HourlyEmployee e10 = new HourlyEmployee();
      HourlyEmployee e11 = new HourlyEmployee("Murphy", -1, -1);
      HourlyEmployee e12 = new HourlyEmployee("Howard Brady", 30.80, 20);
      HourlyEmployee e13 = new HourlyEmployee("Frank Harrison", 22.33, 20);
      HourlyEmployee e14 = new HourlyEmployee("Seymour Butts", 89.00, 20);
      
      Company c = new Company("");
      System.out.println("\nCompany Name: " + c.getCompanyName());
      c.setCompanyName("Starbucks");
      
      c.addEmployee(e1);
      c.addEmployee(e2);
      c.addEmployee(e3);
      c.addEmployee(e4);
      c.addEmployee(e5);
      c.addEmployee(e6);
      c.addEmployee(e7);
      c.addEmployee(e8);
      c.addEmployee(e9);
      c.addEmployee(e10);
      c.addEmployee(e11);
      c.addEmployee(e12);
      c.addEmployee(e13);
      c.addEmployee(e14);
            
      System.out.println("\nSearching for employee with ID = 1000.\n");
      System.out.println("Employee Details: \n");
      System.out.println(c.getEmployee(1000));
      
      System.out.println("\nSearching for employee with ID = 2.\n");
      System.out.println("Employee Details: \n");

      System.out.println(c.getEmployee(2));
      
      System.out.println("\nSearching for employee with ID = 1006.");
      System.out.println("\nEmployee Details: \n");
      System.out.println(c.getEmployee(1006));
      
      System.out.println("\nCompany Name: " + c.getCompanyName());
      System.out.println("\nCompany Size: " + c.getTotalNumberOfEmployees());
      System.out.printf("\nTotal Payroll for Company: $%.2f",  c.getTotalPayroll());
      System.out.println("\n");
      
      System.out.println(c);
   }
}