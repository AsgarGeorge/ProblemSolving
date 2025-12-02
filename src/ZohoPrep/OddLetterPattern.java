package ZohoPrep;

public class OddLetterPattern {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int n = word.length();
        int mid = n / 2;  // For PROGRAM -> 7 letters -> mid = 3 (G)

        // Start from i = 1 to skip the top "P     P" row
        for (int i = 1; i < n; i++) {
            // Mirror the index to create the hourglass: 1,2,3,2,1,0
            int j = (i <= mid) ? i : (n - 1 - i);

            // Leading spaces
            for (int s = 0; s < j; s++) {
                System.out.print(" ");
            }

            char ch = word.charAt(j);

            if (j == mid) {
                // Middle G printed once
                System.out.println(ch);
            } else {
                int middleSpaces = (mid - j) * 2 - 1;
                System.out.print(ch);
                for (int s = 0; s < middleSpaces; s++) {
                    System.out.print(" ");
                }
                System.out.println(ch);
            }
        }
    }
}

