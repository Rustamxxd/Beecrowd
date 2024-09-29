import java.util.Scanner;

public class Bee1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String encoded = sc.nextLine();
            int shift = sc.nextInt();
            sc.nextLine();

            StringBuilder decoded = new StringBuilder();

            for (char c : encoded.toCharArray()) {
                char original = (char) (c - shift);
                if (original < 'A') {
                    original += 26;
                }
                decoded.append(original);
            }

            System.out.println(decoded.toString());
        }
    }
}