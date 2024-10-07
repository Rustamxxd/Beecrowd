import java.util.Scanner;

public class Bee1234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String sentence = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            boolean isUpper = true;  // To track the case of the next letter

            for (char c : sentence.toCharArray()) {
                if (Character.isLetter(c)) {
                    // Adjust the case based on isUpper
                    if (isUpper) {
                        result.append(Character.toUpperCase(c));
                    } else {
                        result.append(Character.toLowerCase(c));
                    }
                    // Toggle the case for the next letter
                    isUpper = !isUpper;
                } else {
                    // Append spaces as they are
                    result.append(c);
                }
            }

            System.out.println(result.toString());
        }
        scanner.close();
    }
}