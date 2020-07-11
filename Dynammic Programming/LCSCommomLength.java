import java.util.*;
import java.lang.*;
import java.io.*;
class LCSCommomLength
{
   public static int  longestCommonSubsequence(String x, String y) {
        int m=x.length();
        int n=y.length();
        int count=0,ans=0;
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
         ans=Math.max(ans,t[i][j]);
        }
    else{
             t[i][j]=0;
    }
        }
    }
    return ans;
    }
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        int m=in.nextInt();
	         int n=in.nextInt();
		String x=in.next();
		String y=in.next();
		int le=longestCommonSubsequence(x,y);
		System.out.println(le);
	    }
	}
}

--------------------------------
Input
1
5
5
abcde
abfce

-------------------------------
output
2