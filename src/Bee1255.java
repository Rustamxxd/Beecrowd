import java.util.Scanner;

public class Bee1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine().toLowerCase();
            int[] frequency = new int[26];

            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    frequency[c - 'a']++;
                }
            }

            int maxFrequency = 0;
            for (int freq : frequency) {
                if (freq > maxFrequency) {
                    maxFrequency = freq;
                }
            }

            for (int j = 0; j < 26; j++) {
                if (frequency[j] == maxFrequency) {
                    System.out.print((char) (j + 'a'));
                }
            }
            System.out.println();
        }
    }
}