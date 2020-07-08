/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class CountofSubsetsSum
{
    public static int sumpartition(int arr[],int sum){
        int n=arr.length;
          int t[][]=new int[n+1][sum+1];
            for(int i=0;i<=n;i++){
                for(int j=0;j<=sum;j++){
                    
                    
                    if(j==0)
                   t[i][j]=1;
        
                    else if(i==0)
                     t[i][j]=0;
          
                    else if(j>=arr[i-1]){
                        t[i][j]=(t[i-1][j-arr[i-1]]+t[i-1][j]);
                    }
                    else{
                        t[i][j]=t[i-1][j];
                    }
                }
            }
         
            
            return t[n][sum];
        
    }
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		int sum=in.nextInt();
	 int ans=sumpartition(arr,sum);
		    System.out.println(ans);
	
	    }
	}
}
