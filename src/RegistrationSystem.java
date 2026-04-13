import java.util.Scanner;


public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        // Getting user information
        System.out.println("--- Registration ---");
        System.out.println("Enter First Name: ");
        String fName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String lName = scanner.nextLine();

        System.out.println("Enter Username (must have underscore _ and be no more than five characters): ");
        String user = scanner.nextLine();

        System.out.println("Enter Password (8+ characters, capital letter, number, special character): ");
        String pass = scanner.nextLine();

        System.out.println("Enter Cell Phone (+27...): ");
        String cell = scanner.nextLine();

        String regStatus = login.registerUser(user, pass, cell);
        System.out.println(regStatus);

        // Only proceed if registration was successful
        if (regStatus.contains("successfully added")) {

            System.out.println("\n--- Login ---");

            boolean Success = false;

            // Login
            while (!Success) {
                System.out.print("Enter Username: ");
                String loginUser = scanner.nextLine();

                System.out.print("Enter Password: ");
                String loginPass = scanner.nextLine();

                Success = login.loginUser(loginUser, loginPass);

                System.out.println(login.returnLoginStatus(Success, fName, lName));
            }
        }
    }
}