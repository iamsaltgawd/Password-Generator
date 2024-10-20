import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswdGen {

    public static String generatePassword(int len) {

            // 88 character alphabet
        String characters =
            "!\"#$%&'()*+,-./23456789:;<=>?@ABCDEFGHJKLMNO"
            + "PRSTUVWXYZ[\\]^_abcdefghijkmnopqrstuvwxyz{|}~";

        StringBuilder passwd = new StringBuilder();
        List<Character> allChars = new ArrayList<>();

        for (char c : characters.toCharArray()) {
            allChars.add(c);
        }

        Random random = new Random();

        char firstChar;

        do {
            firstChar = allChars.get(random.nextInt(allChars.size()));
        }   while (!Character.isLetter(firstChar));
        passwd.append(firstChar);

        while (passwd.length() < len) {
            char nextChar = allChars.get(random.nextInt(allChars.size()));
            boolean valid = false;

            while (!valid) {
                nextChar = allChars.get(random.nextInt(allChars.size()));

                if (passwd.indexOf(String.valueOf(nextChar)) == -1 &&
                    (passwd.length() == 0 ||
                    Math.abs(passwd.charAt(passwd.length() -1) - nextChar) != 1)) {
                        valid = true;
                    }
            }
            passwd.append(nextChar);
        }
        return passwd.toString();
    }
}
