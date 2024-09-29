import java.util.Scanner;

public class Bee1237 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(longestCommonSubstring(str1, str2));
        }
    }

    public static int longestCommonSubstring(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int maxLength = 0;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                }
            }
        }
        return maxLength;
    }
}