package Recursion_Basic;

public class Fibo {
    static int First(int n){
        if(n==0 || n==1){
            return 1;
        }
        int b = First(n-1);
        int c = First(n-2);

       return b + c;
    }

    static void main() {
        System.out.println(First(5));
    }
}
