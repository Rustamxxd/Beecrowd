import java.util.Scanner;

public class Bee1234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String sentence = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            boolean isUpper = true;

            for (char c : sentence.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (isUpper) {
                        result.append(Character.toUpperCase(c));
                    } else {
                        result.append(Character.toLowerCase(c));
                    }
                    isUpper = !isUpper;
                } else {
                    result.append(c);
                }
            }
            System.out.println(result.toString());
        }
        scanner.close();
    }
}