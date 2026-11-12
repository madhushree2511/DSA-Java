import java.util.*;

public class call_by_value {
    public static void change(int a){
        a=10;
    }

    public static void main(String args[]){
        int a =15;
        change(a);
        System.out.println("The value of a is :" + a);
    }
}
