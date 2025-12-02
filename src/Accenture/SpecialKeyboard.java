package Accenture;

public class SpecialKeyboard {
    public static int minKeyPresses(String S) {
        int n = S.length();
        int[] dp = new int[n + 1];
        dp[0] = 0; // No key presses needed for empty string

        for (int i = 1; i <= n; i++) {
            // Press numeric key (0-9)
            dp[i] = dp[i - 1] + 1;

            // Check if we can press the '00' key
            if (i >= 2 && S.charAt(i - 1) == '0' && S.charAt(i - 2) == '0') {
                dp[i] = Math.min(dp[i], dp[i - 2] + 1);
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String S = "1000";
        System.out.println("Minimum key presses: " + minKeyPresses(S));
    }
}
