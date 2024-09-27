import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String number = input[0];
            String format = input[1];

            System.out.println("Case " + i + ":");
            
            switch (format) {
                case "bin":
                    int decimalFromBin = Integer.parseInt(number, 2);
                    System.out.println(decimalFromBin + " dec");
                    System.out.println(Integer.toHexString(decimalFromBin)+ " hex");
                    break;
                case "dec":
                    int decimal = Integer.parseInt(number);
                    System.out.println(Integer.toHexString(decimal) + " hex");
                    System.out.println(Integer.toBinaryString(decimal)+ " bin");
                    break;
                case "hex":
                    int decimalFromHex = Integer.parseInt(number, 16);
                    System.out.println(decimalFromHex + " dec");
                    System.out.println(Integer.toBinaryString(decimalFromHex)+ " bin");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
