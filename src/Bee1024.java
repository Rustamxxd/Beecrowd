import java.util.Scanner;

public class Bee1024 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            String encrypted = encrypt(input);
            System.out.println(encrypted);
        }

        scanner.close();
    }

    public static String encrypt(String input) {
        StringBuilder step1 = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                step1.append((char) (c + 3));
            } else {
                step1.append(c);
            }
        }
        step1.reverse();
        int halfLength = step1.length() / 2;
        for (int i = halfLength; i < step1.length(); i++) {
            step1.setCharAt(i, (char) (step1.charAt(i) - 1));
        }
        return step1.toString();
    }
}