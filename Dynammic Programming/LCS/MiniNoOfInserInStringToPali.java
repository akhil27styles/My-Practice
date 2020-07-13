import java.util.Arrays;
public class MiniNoOfInserInStringToPali
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
    public static String reverse(String s){
     char str[]=s.toCharArray();
     int i=s.length()-1;
     int j=0;
     
     while(i>j){
         char temp=str[j];
         str[j]=str[i];
         str[i]=temp;
         i--;
         j++;
         
     }
     String ans=new String(str);
     return ans;
        
    }
	public static void main(String[] args) {
		String x="acbcdba";
		String y=reverse(x);
		int le=longestCommonSubsequence(x,y);
		System.out.println(x.length()-le);
		
	}
}
