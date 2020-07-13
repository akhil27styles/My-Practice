public class RecursiveLCS
{
    public static int LCS(char []X,char []Y,int n,int m){
        if(n==0||m==0){
            return 0;
        }
        if(X[n-1]==Y[m-1]){
            return 1+LCS(X,Y,n-1,m-1);
        }
    
            return Math.max(LCS(X,Y,n,m-1),LCS(X,Y,n-1,m));
    }
	public static void main(String[] args) {
		String x="abcdgh";
		String y="abedfhr";
		int n=x.length();
		int m=y.length();
		char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
		int le=LCS(X,Y,n,m);
		System.out.println(le);
	}
}
