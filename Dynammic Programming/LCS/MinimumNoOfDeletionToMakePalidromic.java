import java.util.Arrays;
public class MinimumNoOfDeletionToMakePalidromic
{
   public static int  longestCommonSubsequence(String x, String y) {
        int m=x.length();
        int n=y.length();
        char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
         int [][]t = new int [m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++)
            if(i==0||j==0){
                t[i][j]=0;
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
        if(X[i-1]==Y[j-1]){
        t[i][j]= 1+t[i-1][j-1];
        }
    else{
            t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
    }
        }
    }
    return t[m][n];
    }
    public static String reverse(String x){
        int i=x.length()-1;
        int j=0;
        char s[]=x.toCharArray();
        while(j<i){
       char temp=s[j];
        s[j]=s[i];
        s[i]=temp;
            i--;
            j++;
        }
        String str=new String(s);
        return str;
    }
	public static void main(String[] args) {
		String x="agbcba";
		String y=reverse(x);
		int le=longestCommonSubsequence(x,y);
		int ans=x.length()-le;
		System.out.println(ans);
	}
}
