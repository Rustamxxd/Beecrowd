import java.util.Scanner;

public class Bee1551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String sentence = scanner.nextLine();
            classifySentence(sentence);
        }

        scanner.close();
    }

    public static void classifySentence(String sentence) {
        boolean[] letters = new boolean[26];
        int distinctCount = 0;

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!letters[index]) {
                    letters[index] = true;
                    distinctCount++;
                }
            } else if (c >= 'A' && c <= 'Z') {
                int index = c - 'A';
                if (!letters[index]) {
                    letters[index] = true;
                    distinctCount++;
                }
            }
        }

        if (distinctCount == 26) {
            System.out.println("frase completa");
        } else if (distinctCount >= 13) {
            System.out.println("frase quase completa");
        } else {
            System.out.println("frase mal elaborada");
        }
    }
}