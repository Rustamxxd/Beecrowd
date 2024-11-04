import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bee1254 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String originalTag = in.nextLine().trim();
            String tagNumber = in.nextLine().trim();
            String documentText = in.nextLine();

            String regexPattern = "(?i)(<\\s*" + Pattern.quote(originalTag) + "\\s*>)";
            Pattern pattern = Pattern.compile(regexPattern);
            Matcher matcher = pattern.matcher(documentText);

            String convertedText = matcher.replaceAll("<" + tagNumber + ">");
            System.out.println(convertedText);
        }
    }
}