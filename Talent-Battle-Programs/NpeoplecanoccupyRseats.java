public class NpeoplecanoccupyRseats
{
    static int fact(int n){
        int a=1;
        for(int i=1;i<=n;i++){
            a=a*i;
        }
        return a;
    }
	public static void main(String[] args) {
	int n=5,r=3; //P(n,r) = n! / (n - r)!
	int a=fact(n);
	int b=fact(n-r);
	System.out.println(a/b);
	
	
	}
}
