package ZohoPrep;

public class MismatchedSubstrings {

    public static void main(String[] args) {
        String s1 = "schoollifeisuosefull";
        String s2 = "schoollongofuiselike";

        printMismatchedSubstrings(s1, s2);
    }

    public static void printMismatchedSubstrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Strings must be of equal length.");
            return;
        }

        int n = s1.length();
        int start = -1;

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (start == -1) start = i;  // start of mismatch
            } else {
                if (start != -1) {
                    // end of mismatch, print substrings
                    System.out.println(s1.substring(start, i) + " , " + s2.substring(start, i));
                    start = -1;
                }
            }
        }

        // Handle if mismatch was till the end
        if (start != -1) {
            System.out.println(s1.substring(start, n) + " , " + s2.substring(start, n));
        }
    }
}
