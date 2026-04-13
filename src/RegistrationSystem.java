import java.util.Scanner;


public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        System.out.println("--- Registration ---");
        System.out.print("Enter First Name: ");
        String fName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lName = scanner.nextLine();

        System.out.print("Enter Username (must have underscore _ and be no more than five characters): ");
        String user = scanner.nextLine();

        System.out.print("Enter Password (8+ characters, capital letter, number, special character): ");
        String pass = scanner.nextLine();

        System.out.print("Enter Cell Phone (+27...): ");
        String cell = scanner.nextLine();

        String regStatus = login.registerUser(user, pass, cell);
        System.out.println(regStatus);

        // Only proceed if registration was successful
        if (regStatus.contains("successfully added")) {

            System.out.println("\n--- Login ---");

            boolean isSuccess = false;

            // Login
            while (!isSuccess) {
                System.out.print("Enter Username: ");
                String loginUser = scanner.nextLine();

                System.out.print("Enter Password: ");
                String loginPass = scanner.nextLine();

                isSuccess = login.loginUser(loginUser, loginPass);

                System.out.println(login.returnLoginStatus(isSuccess, fName, lName));
            }
        }
    }
}