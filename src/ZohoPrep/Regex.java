package ZohoPrep;

import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        String s = "chcabbac";
        String regex = "ca+yac";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            System.out.println("Matched substring: " + matcher.group());
        } else {
            System.out.println("No match found.");
        }
    }
}
