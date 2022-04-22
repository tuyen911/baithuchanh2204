

import java.util.Scanner;
public class student extends Person{
    private float van , su , dia ;
    public void nhap(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("nhap diem mon van: ");
            van=sc.nextFloat();
            System.out.print("nhap diem mon su: ");
            su=sc.nextFloat();
            System.out.print("nhap diem mon dia: ");
            dia=sc.nextFloat();
        }
        
    }
    public void in(){
        System.out.print("diem mon toan: "+van);
        System.out.print("diem mon ly: "+su);
        System.out.print("diem mon hoa: "+dia);
      
    }
}


