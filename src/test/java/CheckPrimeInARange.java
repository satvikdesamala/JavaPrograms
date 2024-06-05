public class CheckPrimeInARange {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        checkPrimeRange(start, end);
    }

    public static void checkPrimeRange(int start, int end){
        for(int i = start; i <=end; i++){
            isPrime(i);
        }
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
