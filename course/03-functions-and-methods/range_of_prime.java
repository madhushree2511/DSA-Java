public class range_of_prime {

    public static boolean isPrime(int a){
        if(a==2){
            return true;
        }
        for(int i=2;i<=a-1;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void prime(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i + "");
            }
        }
     }
        
    public static void main(String args[]){
        prime(20);
    }
}
