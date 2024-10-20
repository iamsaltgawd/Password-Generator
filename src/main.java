import java.util.Scanner;

public class Main {

    public static int minLen = 8;
    public static int minNum = 1;
    public static int maxNum = 100;

    public static void main(Strong[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter password length (ideally > 22): ");
        int passwdLen = scanner.nextInt();

        if (passwdLen < minLen) {
            System.out.println("Password length must be at least " + minLen + ".");
            System.out.print("Enter password length (ideally > 22): ");
            int passwdLen = scanner.nextInt();
        }

        System.out.print("How many passwords: ");
        int passwdNum = scanner.nextInt();

        if (passwdNum < minNum) {
            System.out.println("Invalid number. The amount was set to " + minNum + ".");
            passwdNum = 1;
        }   else if (passwdNum > maxNum) {
            System.out.println("The amount was set to " + maxNum + " (capped at 100)")
            }

        System.out.println("Generating " + passwdNum + " passwords: ");

        for (int i = 0; i < passwdNum; i++) {
            String passwd = passwdGen.generatePassword(passwdLen);
            System.out.println((i+1) + ": " + passwd);
        }

        scanner.close();
    }

}
