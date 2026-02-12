import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined username and password
        String correctUser = "admin";
        String correctPass = "1234";

        System.out.println("Enter Username:");
        String username = sc.nextLine();

        System.out.println("Enter Password:");
        String password = sc.nextLine();

        if (username.equals(correctUser) && password.equals(correctPass)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password!");
        }

        
    }
}
