import java.util.*;

public class Parameters_and_Arguments{
    public static int calculate(int num1, int num2 ){
        int sum = num1 + num2;
        return sum;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=calculate(a,b);
        System.out.println("The sum is :" + sum);
    }
}
