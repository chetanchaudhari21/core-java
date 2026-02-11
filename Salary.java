import java.util.Scanner;    
public class Salary {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your salary:");  
      int salary = sc.nextInt();
      int yearsalary= salary*12;
      System.out.println("Yearly salary: "+yearsalary);
    }

}

