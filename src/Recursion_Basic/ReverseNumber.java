package Recursion_Basic;
import java.util.Scanner;
public class ReverseNumber {
    static void reverseNum(int n , int i){
        if(i>n){
            return;
        }
        System.out.print(i + " ");
        reverseNum(n,i+1);
    }

    static void main() {
        System.out.println("Enter no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNum(n,0);
    }
}
