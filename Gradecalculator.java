import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");
        
        double sub1 = sc.nextDouble();
        double sub2 = sc.nextDouble();
        double sub3 = sc.nextDouble();
        double sub4 = sc.nextDouble();
        double sub5 = sc.nextDouble();

        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = total / 5;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } 
        else if (percentage >= 80) {
            System.out.println("Grade: A");
        } 
        else if (percentage >= 70) {
            System.out.println("Grade: B");
        } 
        else if (percentage >= 60) {
            System.out.println("Grade: C");
        } 
        else if (percentage >= 50) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: F (Fail)");
        }

    }
}

