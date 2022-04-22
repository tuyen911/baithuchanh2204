
import java.util.Scanner;
public class offlineStudebt extends student {
    public offlineStudebt(double math, double physics, double chemistry, double average) {
        super();
    
    }
    public String vehicles;
    public void addVehicles(){
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Vehicles : ");
          vehicles = sc.nextLine();
    }
    } 
    public void displayVehicles(){
      System.out.println("Vehicles: " + vehicles);
    } 
    public void placeToStudy(){
      System.out.println("Study in the classroom");
    }
}

