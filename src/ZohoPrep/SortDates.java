package ZohoPrep;

import java.util.*;

//input

//3
//        01,02,2023
//        05,06,1998
//        07,07,2025


public class SortDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of dates
        int N = Integer.parseInt(scanner.nextLine());

        // List to store dates
        List<String> dateStrings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            dateStrings.add(scanner.nextLine());
        }

        // Sort using custom comparator
        Collections.sort(dateStrings, new Comparator<String>() {
            public int compare(String d1, String d2) {
                String[] parts1 = d1.split(",");
                String[] parts2 = d2.split(",");

                // Convert to integers
                int day1 = Integer.parseInt(parts1[0]);
                int month1 = Integer.parseInt(parts1[1]);
                int year1 = Integer.parseInt(parts1[2]);

                int day2 = Integer.parseInt(parts2[0]);
                int month2 = Integer.parseInt(parts2[1]);
                int year2 = Integer.parseInt(parts2[2]);

                // Compare years, then months, then days
                if (year1 != year2)
                    return Integer.compare(year1, year2);
                if (month1 != month2)
                    return Integer.compare(month1, month2);
                return Integer.compare(day1, day2);
            }
        });

        // Print sorted dates
        for (String date : dateStrings) {
            System.out.println(date);
        }

        scanner.close();
    }
}
