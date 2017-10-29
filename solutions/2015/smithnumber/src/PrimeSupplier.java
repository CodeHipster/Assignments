public class PrimeSupplier {
    private int cursor = 1;

    public int next(){
        while(!isPrime(++cursor));
        return cursor;
    }

    public int getCursor(){
        return cursor;
    }

    //checks whether an int is prime or not.
    public boolean isPrime(int n){
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
