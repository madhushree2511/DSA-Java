import java.util.*;
public class isPrime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        boolean prime=true;
        for (i=2;i<=n-1;i++){
            if(n%i==0){
                prime=false;
            }
        }
        if(prime==true){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
    } 
}
