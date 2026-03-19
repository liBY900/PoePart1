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

    // is phone number valid
    public boolean checkCellPhoneNumber(String phone) {
        return phone.matches("^\\+27\\d{9}$");
    }

    //  Register user
    public String registerUser(String username, String password, String phone) {

        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber(phone)) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }

        // Storing all details if they are correct
        storedUsername = username;
        storedPassword = password;
        storedCellPhone = phone;

        return "Registration successful!";
    }

    //  Login check
    public boolean loginUser(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    //  Login message
    public String returnLoginStatus(boolean success, String firstName, String lastName) {
        if (success) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
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

        //  allows login if registration was successful
        if (result.equals("Registration successful!")) {

            System.out.println("\n----- Login -----");

            System.out.print("Enter Username: ");
            String loginUser = scanner.nextLine();

            System.out.print("Enter Password: ");
            String loginPass = scanner.nextLine();

            boolean success = login.loginUser(loginUser, loginPass);

            String message = login.returnLoginStatus(success, firstName, lastName);
            System.out.println(message);
        }

        scanner.close();
    }
}