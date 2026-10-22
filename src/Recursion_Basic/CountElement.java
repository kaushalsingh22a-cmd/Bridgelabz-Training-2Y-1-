package Recursion_Basic;

public class CountElement {
    static void countEle(int arr[], int target, int i, int count){
        if(i>=arr.length){
            System.out.print(count);
            return;
        }
        if(arr[i] == target){
            count++;
        }
        countEle(arr,target,i+1,count);

    }

    static void main() {
        int arr[]= {10,10,20,12,10,182};
        countEle(arr,20,0 , 0);
    }
}
