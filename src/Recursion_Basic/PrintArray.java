package Recursion_Basic;

public class PrintArray {
    static void PrintArr(int arr[] , int index){
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        PrintArr(arr , index+1);
    }

    static void main() {
       int arr[] = {2,4,5,6,7,8};
       PrintArr(arr,0);
    }
}
