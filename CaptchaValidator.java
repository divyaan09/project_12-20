import java.util.Random;
import java.util.Scanner;

public class CaptchaValidator {
    // Method to generate random CAPTCHA
    public static String generateCaptcha(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            captcha.append(characters.charAt(index));
        }

        return captcha.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int captchaLength = 5;

        String captcha = generateCaptcha(captchaLength);
        System.out.println("🔐 CAPTCHA: " + captcha);
        System.out.print("Enter the CAPTCHA: ");
        String userInput = scanner.nextLine();

        if (captcha.equals(userInput)) {
            System.out.println("✅ CAPTCHA Verified Successfully!");
        } else {
            System.out.println("❌ Incorrect CAPTCHA. Try again.");
        }

        scanner.close();
    }
}
