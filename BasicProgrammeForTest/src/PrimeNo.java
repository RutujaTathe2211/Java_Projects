public class PrimeNo {
    public static boolean isprime(int n){
        if(n==0||n==1){
            return false;
        }
        else if(n==2)
        {
            return true;
        }
        else {
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println( isprime(13));
        System.out.println( isprime(49));
        System.out.println( isprime(17));

    }
}
