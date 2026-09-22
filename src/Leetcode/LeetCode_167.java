package Leetcode;
import java.util.Scanner;
public class LeetCode_167 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int i=0;
        while(i<arr.length){
            int j = arr.length-1;
            int sum= arr[i] + arr[j];
            if(target==sum){
                System.out.println("True");
            }
            else if(target<sum) {
                i++;
            }
            else if(target>sum){
                j--;
            }
        }






    }

}
