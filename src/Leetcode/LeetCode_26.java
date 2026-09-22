package Leetcode;
import java.util.Scanner;

public class LeetCode_26 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = i+1;
        int count = 0;
        while(i<arr.length){
            if(arr[i] == arr[j]){
                System.out.println("Duplicate");
                count++;
            }
            else if(arr[i] != arr[j]){
                i++;
                j++;
            }

        }
        System.out.println(count);
    }
}
