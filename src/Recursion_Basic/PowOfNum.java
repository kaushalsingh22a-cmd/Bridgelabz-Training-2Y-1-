package Recursion_Basic;

public class PowOfNum {
    static int power(int a, int b){
        if(b==0){
            return 1;
        }
        return a*power(a,b-1);
    }

    static void main() {
        System.out.println(power(3,5));
    }
}
