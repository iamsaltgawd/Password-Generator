import java.util.Scanner;

public class Main {

    public static int minLen = 16;
    public static int maxLen = 50;
    public static int minNum = 1;
    public static int maxNum = 100;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter password length (ideally > 22): ");
        int passwdLen = input.nextInt();

        while (passwdLen < minLen || passwdLen > maxLen) {
            if (passwdLen < minLen) {
                System.out.println("Password length must be at least " + minLen + " characters.");
            }   else if (passwdLen > maxLen) {
                System.out.println("Password length must be at most " + maxLen + " characters.");
            }

            System.out.print("Enter password length (ideally > 22): ");
            passwdLen = input.nextInt();
        }

        System.out.print("How many passwords: ");
        int passwdNum = input.nextInt();

        if (passwdNum < minNum) {
            System.out.println("Invalid number. The amount was set to " + minNum + ".");
            passwdNum = 1;
        }   else if (passwdNum > maxNum) {
            System.out.println("The amount was set to " + maxNum + " (capped at 100)");
            passwdNum = maxNum;
        }

        System.out.println("Generating " + passwdNum + " passwords: ");

        for (int i = 0; i < passwdNum; i++) {
            String passwd = PasswdGen.generatePassword(passwdLen);
            System.out.println((i+1) + ": " + passwd);
        }

        input.close();
    }

}
