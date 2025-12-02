package Cognizant;

public class PyramidSum {
    public static void main(String[] args) {
        System.out.println(pyramidSum(6));
    }
    public static  int pyramidSum(int input) {
        int res = 1, n = 1;

        for (int i = 2; i <=  input; i++) {
            n += i * 2;
            res += n;
        }
        return res;
    }

}
