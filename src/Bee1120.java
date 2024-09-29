import java.util.Scanner;
import java.math.BigInteger;

public class Bee1120 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0 0")) break;

            String[] parts = input.split(" ");
            char faultyDigit = parts[0].charAt(0);
            String originalValue = parts[1];

            String representedValue = originalValue.replace(String.valueOf(faultyDigit), "");
            if (representedValue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(new BigInteger(representedValue));
            }
        }
        scanner.close();
    }
}