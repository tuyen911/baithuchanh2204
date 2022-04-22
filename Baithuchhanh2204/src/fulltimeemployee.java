import java.util.Scanner;
public class fulltimeemployee extends employee {
    
  public fulltimeemployee(int id, String name, int age, String address) {
        super(id, name, age, address);
        
    }
public int overtimeHours;
  public static int basicSalary = 2000000;
  public void addOvertimeHours()
  {
  try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Overtime Hours");
      overtimeHours = sc.nextInt();
    }
  }
  public int Salary()
  {
    return overtimeHours*20000 + basicSalary;
  }
  public void typeOfEmployee()
  {
    System.out.println("Type of employee: Full-time employee");
  }
}
    

