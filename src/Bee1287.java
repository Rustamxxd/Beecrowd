import java.util.Scanner;

public class Bee1287 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            input = input.replace('O', '0')
                    .replace('o', '0')
                    .replace('l', '1')
                    .replaceAll("[,\\s]", "");

            if (input.isEmpty() || !input.matches("\\d+")) {
                System.out.println("error");
                continue;
            }

            try {
                long number = Long.parseLong(input);
                if (number > 2147483647) {
                    System.out.println("Error");
                } else {
                    System.out.println(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error");
            }
        }

        scanner.close();
    }
}
