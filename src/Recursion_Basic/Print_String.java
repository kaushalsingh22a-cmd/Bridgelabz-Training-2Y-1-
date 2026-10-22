package Recursion_Basic;

public class Print_String {

    static void print(String name, int index){
        if(index == name.length()){
            return;
        }
        print(name, index+1);
        System.out.print(name.charAt(index));
    }

    static void main() {

        print("Shivam Thakur",0);
    }

}
