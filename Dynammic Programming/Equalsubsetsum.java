/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class Equalsubsetsum
{
    public static boolean sumpartition(int arr[],int n){
        long s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
        }
        int sum=(int)s;
        if(sum%2!=0){
         return false;
        }
          boolean t[][]=new boolean[n+1][sum/2+1];
            for(int i=0;i<=n;i++){
                for(int j=0;j<=sum/2;j++){
                    
                    
                    if(j==0)
                   t[i][j]=true;
        
                    else if(i==0)
                     t[i][j]=false;
          
                    else if(j>=arr[i-1]){
                        t[i][j]=(t[i-1][j-arr[i-1]]||t[i-1][j]);
                    }
                    else{
                        t[i][j]=t[i-1][j];
                    }
                }
            }
            return t[n][sum/2];
        
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
		if(sumpartition(arr,n)==true){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	    }
	}
}
