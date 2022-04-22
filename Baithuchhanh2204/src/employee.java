

import java.util.Scanner;
public class employee extends Person {
  public employee(int id, String name, int age, String address) {
        super();
       
    }
protected String position;
  public void addPosition()
  {
  try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Type position");
      position = sc.nextLine();
    }
  }
  public void displayPosition()
  {
    System.out.println("Position: "+ position);
  }
}
    

