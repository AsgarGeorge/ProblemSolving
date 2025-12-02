package ZohoPrep;

public class Pattern1 {
    public static void main(String[] args) {
        printPatter(5);
        printPatter(6);
    }
    public static void printPatter(int n){
        for(int i = 0 ; i < n; i++){
            int add = 0;
            for(int j = 0 ; j < i + 1;j++){

                System.out.print(i + 1 + add + " ");
                add = add + n - j - 1;
            }
            System.out.println();
        }
    }
}
