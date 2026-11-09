import java.util.*;
public class Continue_statement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i;
       while(true){
        System.out.println("Enter the number:");
        i=sc.nextInt();
            if(i%10==0){
                continue;
            }
            System.out.println("the number is:" +i);
        }
       
    }
}
