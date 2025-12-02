package ZohoPrep;

public class Sqrt {
        public static int sqrt(int n) {
            if (n < 2) {
                return n;
            }
            int low = 1, high = n;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mid == n / mid) {
                    return mid;
                } else if (mid < n / mid)  {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return high;
        }

        public static void main(String[] args) {
            int n = 81;
            System.out.println(sqrt(n));  // Output: 5
        }
    }


