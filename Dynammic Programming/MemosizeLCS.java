import java.util.Arrays;
public class MemosizeLCS
{
    public static int LCS(char []X,char []Y,int n,int m,int t[][]){
        
        if(n==0||m==0){
            return 0;
        }
        if(t[m][n]!=-1){
            return t[m][n];
        }
        if(X[n-1]==Y[m-1]){
            return t[m][n]= 1+LCS(X,Y,n-1,m-1,t);
        }
    
            return t[m][n]=Math.max(LCS(X,Y,n,m-1,t),LCS(X,Y,n-1,m,t));
    }
	public static void main(String[] args) {
		String x="abcdgh";
		String y="abedfhr";
		int n=x.length();
		int m=y.length();
		char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
        int [][]t = new int [1001][1001];  //constraints 
        for (int[] row : t) 
            Arrays.fill(row, -1); 
		int le=LCS(X,Y,n,m,t);
		System.out.println(le);
	}
}
