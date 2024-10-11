package Methods;

public class task_4 {
    public static int countVowels(String input) {
        input = input.toLowerCase();

        int count = 0;
        for (char c : input.toCharArray()) {

            if ("aeiouаеёиоуыэюя".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    String text = "Hello world";
    int vowelCount = countVowels(text);
    System.out.println("Гласных: " + vowelCount);
    }
}
