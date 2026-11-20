public class binomial_coefficient {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    // binomial coefficient formula = n!/r!*(n-r)!

    public static int binCoff(int n, int r){
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nmr_fact=fact(n-r);

        int bincoff=n_fact/(r_fact*nmr_fact);
        return bincoff;

    }

    public static void main (String args[]){
        System.out.println(binCoff(5,2));
    }
}
