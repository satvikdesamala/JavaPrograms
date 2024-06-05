public class PrimeCheck {
    public static void main(String[] args){
        isPrime(11);
    }

    public static void isPrime(int n){
        boolean prime = true;
        for(int i=2; i<=n/2;i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(n + " is a prime");
        }else{
            System.out.println(n + " is not a prime");
        }
    }
}
