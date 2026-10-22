package Recursion_Basic;

public class ClimbingStairs {
    static int climbingStairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int ans = climbingStairs(n-1) + climbingStairs(n-2);
        return ans;
    }

    static void main() {
        System.out.println(climbingStairs(3));
    }
}
