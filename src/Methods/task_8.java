package Methods;

public class task_8 {
    public static String repeatString(String input, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(input);
        }
        return result.toString();
    }
    public static void main(String[] args) {
    String text = "Hi";
    int repeat = 3;
    String repeatText = repeatString(text, repeat);
    System.out.println(repeatText);

    }
}
