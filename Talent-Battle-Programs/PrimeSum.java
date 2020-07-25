public class PrimeSum
{
    public static int prime(int n){
        int flag=0;
        for(int i=2;i<=n/2;i++){
            flag=0;
            if(n%i==0){
                flag=1; //prime nhi hai
                break;
            }
        }
        return flag;
        
    }
	public static void main(String[] args) {
	int n=34;
	for(int i=2;i<=n/2;i++){
	    if(prime(i)==0&&prime(n-i)==0){
	            System.out.println(n+"=" + (n-i) +"+"+i);
	    }
	}
	}
}
