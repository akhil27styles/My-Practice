class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        for(int i=N;i>=0;i--){
            if(isprime(i)&&(N%i==0)){
                return (long)i;
            }
        }
        return 1;
    }
    static boolean isprime(int n){
        if(n==0||n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
