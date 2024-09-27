package Beecrowd;

import java.util.Scanner;

public class B1170 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        float x;

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x = scanner.nextFloat();
            days = 0;
            while (x > 1) {
                x /= 2;
                days++;
            }

            System.out.println(days + " dias");
        }
        scanner.close();
    }
}
