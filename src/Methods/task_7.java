package Methods;

public class task_7 {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
    String text = "Hello world";
    String reversedText = reverseString(text);
    System.out.println("Твой перевернутый текст: " + reversedText);
    }
}
