import java.util.Scanner;

public class parttimeemployee extends employee{
    public parttimeemployee(int id, String name, int age, String address) {
        super(id, name, age, address);
      
    }
    public int numberOfDayWork;
    public void addNumberOfDayWork()
    {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Number of day working");
        numberOfDayWork = sc.nextInt();
      }
    }
    public int Salary()
    {
      return numberOfDayWork*50000;
    }
    public void typeOfEmployee()
    {
      System.out.println("Type of employee: Part-time employee");
    }
  }
    

