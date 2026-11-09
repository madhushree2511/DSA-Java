import java.util.*;
public class print_numbers_in_reverse {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        while (n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit + " ");
            n/=10;
        }
    }
}
