package Recursion_Basic;

public class Palindrome {
    static boolean pal(String name , int index){
        char start = name.charAt(index);
        int index1 = name.length()-1;
        char end = name.charAt(index1);
        if(start == end){
            return true;
        }
        else{
            return false;
        }


    }

    static void main() {
        pal("level" , 0);
    }
}
