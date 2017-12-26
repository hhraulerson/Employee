

public class CompanyTester
{
   public static void main(String[] args)
   {
      CommissionedEmployee e1 = new CommissionedEmployee();
      
      CommissionedEmployee e2 = new CommissionedEmployee("Rachel Raulerson", 2000, 250, .10);
      CommissionedEmployee e3 = new CommissionedEmployee(null, 1000, 250, .50);
      HourlyEmployee e4 = new HourlyEmployee("murphy", -1, -1);
      
      System.out.println("Next ID: " + CommissionedEmployee.getNextID() + "\n");
      
      System.out.println(e1);
      System.out.println(e2);
      System.out.println(e3);
      System.out.println(e4);
      
      System.out.println(e1.computePay() + "\n");
      System.out.println(e2.computePay() + "\n");
      System.out.println(e3.computePay() + "\n");
      System.out.println(e4.computePay() + "\n");
      
      e1.setName("raulie");
      System.out.println(e1);
      
      e2.setName("rachel");
      System.out.println(e2);
      System.out.println("Employee 1 ID: " + e1.getEmployeeID());
      System.out.println("Employee 2 ID: " + e2.getEmployeeID());
      System.out.println("Employee 3 ID: " + e3.getEmployeeID());
      System.out.println("Employee 4 ID: " + e4.getEmployeeID());
      System.out.println("Employee 1 name: " + e1.getName());
      System.out.println("Employee 2 name: " + e2.getName());
      System.out.println("Employee 3 name: " + e3.getName());
      System.out.println("Employee 4 name: " + e4.getName());
   }
}