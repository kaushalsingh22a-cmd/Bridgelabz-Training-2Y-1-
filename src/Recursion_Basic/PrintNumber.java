package Recursion_Basic;

public class PrintNumber {
    static void print(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        print(n- 1);
    }

    static void main() {
        print(5);
    }
}