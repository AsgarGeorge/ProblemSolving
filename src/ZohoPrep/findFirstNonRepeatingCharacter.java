package ZohoPrep;

public class findFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingCharacter("codeit@#*codeit@#"));
    }

    public static Character findFirstNonRepeatingCharacter(String str){
         int count[] = new int[256];

         //hashing
         for(int i = 0; i< str.length(); i++) {
             count[str.charAt(i)]++;
         }

         for(int i = 0 ;i < str.length(); i++){
             if(count[str.charAt(i)] == 1) return str.charAt(i);
         }
         return null;
    }
}
