import java.util.Scanner;

class Login {

    private String storedUsername;
    private String storedPassword;
    private String storedCellPhone;

    //  Username check
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    //  Password complete check
    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&      // capital letter
                password.matches(".*[0-9].*") &&      // number
                password.matches(".*[^a-zA-Z0-9].*"); // special character
    }



public class RegistrationSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        System.out.println("*** Registration ***");

        // User input
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        System.out.print("Enter Cell Phone (+27...): ");
        String phone = scanner.nextLine();

        // Register
        String result = login.registerUser(username, password, phone);
        System.out.println(result);


        scanner.close();
    }
}