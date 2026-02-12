import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of units consumed:");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 1.5;   
        } 
        else if (units <= 200) {
           bill = units * 2  ; 
        } 
        else if (units <= 300) {
           bill = units * 3;  
        } 
        else {
            bill = units * 5;  
        }

        System.out.println("Total Electricity Bill: ₹" + bill);

        
    }
}
 

