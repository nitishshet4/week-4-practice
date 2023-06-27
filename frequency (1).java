/* import java.util.Scanner;

public class Stringvalid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();

        autoVal(username, password, email, mobileNumber);

        scanner.close();
    }

public static void autoVal(String username, String password, String email, String mobileNumber) {
    boolean hasUppercase = false;
    boolean hasLowercase = false;
    boolean hasDigit = false;
    boolean hasSpecialChar = false;

    char[] passwordChars = password.toCharArray();
    for (int i = 0; i < passwordChars.length; i++) {
        char c = passwordChars[i];
        if (Character.isUpperCase(c)) {
            hasUppercase = true;
        } else if (Character.isLowerCase(c)) {
            hasLowercase = true;
        } else if (Character.isDigit(c)) {
            hasDigit = true;
        } else if ("@#$%^&*()_+=!/-[]{}|;:'\"<>,.?".indexOf(c) != -1) {
            hasSpecialChar = true;
        }
    }

    if (username.length() < 5 || username.length() > 15) {
        System.out.println("Username should be between 5 and 15 characters.");
    } else if (password.length() < 5 || password.length() > 15) {
        System.out.println("Password should be between 8 and 15 characters.");
    } else if (!hasUppercase) {
        System.out.println("Password should contain at least one capital letter.");
    } else if (!hasLowercase) {
        System.out.println("Password should contain at least one small letter.");
    } else if (!hasDigit) {
        System.out.println("Password should contain at least one number.");
    } else if (!hasSpecialChar) {
        System.out.println("Password should contain at least one special character.");
    } else if (email.indexOf("@") == -1 || email.indexOf(".") == -1) {
        System.out.println("Email should contain '@' and '.' symbols.");
    } else if (mobileNumber.length() != 10) {
        System.out.println("Mobile number should have exactly 10 digits.");
    } else {
        System.out.println("Valid data.");
    }
}   */