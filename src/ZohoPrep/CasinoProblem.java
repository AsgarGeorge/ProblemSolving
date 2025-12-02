package ZohoPrep;
import java.util.Random;
public class CasinoProblem {
    public static void main(String[] args) {
            Random random = new Random();

            int count = 0;

            while(true){

                int result = generateValue(random);
                System.out.println("Generated Value: " + result);
                System.out.println(count++);
            }

        }

        public static int generateValue(Random random) {
            int r = random.nextInt(100);  // 0–99

            // 0% chance for 0 → we simply never return 0
            System.out.println("Value of r = " + r);

            // 1–4 with 80%
            if (r < 80) {
                return 1 + random.nextInt(4);  // 1 to 4
            }

            // 5 with 15%
            if (r < 95) {
                return 5;
            }

            // 6–9 with 5%
            return 6 + random.nextInt(4);  // 6 to 9
        }
    }


