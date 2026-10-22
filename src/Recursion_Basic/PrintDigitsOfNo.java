package Recursion_Basic;

public class PrintDigitsOfNo {
    static void printDigits(int num){
        // n/10 == 0  n<10;
        if(num == 0){
            return;
        }
        int digit = num%10;
         num = num/10;
        printDigits(num);
        System.out.print(digit + " ");
    }
    static void main() {
        printDigits(138);
    }
}
