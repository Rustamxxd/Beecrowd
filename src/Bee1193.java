import java.util.Scanner;

public class Bee1193 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine().trim();
            String[] parts = input.split(" ");
            int number;
            String base = parts[1];

            if (base.equals("bin")) {
                number = Integer.parseInt(parts[0],2);
            } else if (base.equals("dec")) {
                number = Integer.parseInt(parts[0]);
            } else {
                number = Integer.parseInt(parts[0],16);
            }

            System.out.println("Test Case " + i + ":");
            System.out.println(number);
            System.out.println(Integer.toHexString(number));
            System.out.println(Integer.toBinaryString(number));
            System.out.println();
        }
        scanner.close();
    }
}