import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    static String LOWER = "abcdefghijklmnopqrstuvwxyz";
    static String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String NUMBERS = "0123456789";
    static String SYMBOLS = "!@#$%^&*";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Password Generator ===");

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        String allChars = LOWER + UPPER + NUMBERS + SYMBOLS;

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password += allChars.charAt(index);
        }

        System.out.println("Generated Password: " + password);
    }
}