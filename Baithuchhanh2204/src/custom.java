
    import java.util.Scanner;
public class custom extends Person {
    protected String customerID;
    public void addCustomerID()
    {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Type customerID : ");
          customerID = sc.nextLine();
    }
    }
    public void displayCustomerID(){
      System.out.println("CustomerID: "+customerID);
    }
}

