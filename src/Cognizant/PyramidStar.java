package Cognizant;

public class PyramidStar {
    public static void main(String[] args) {
        printStar(5);
    }
    public static void printStar(int num){

        for(int i = 0; i < num; i++){
            for(int j = 0; j < i; j++) System.out.print(" ");
            for(int k = 0; k < 2*(num-i)-1; k++) System.out.print("*");
            System.out.println();
        }
    }
}
