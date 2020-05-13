/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class maxmul {
 
    public static int maxProduct(int[] A) {
        if(A==null ||A.length==0){
            return 0;
        }
        int max=A[0],min=A[0],result=A[0];
        for(int i=1;i<A.length;i++){
            int temp=max;
            max=Math.max(Math.max(max*A[i],min*A[i]),A[i]);
            min=Math.min(Math.min(temp*A[i],min*A[i]),A[i]);
            if(max>result){
                result=max;
            }
        }
        return result;
    }


	public static void main (String[] args) {
	
	Scanner in =new Scanner(System.in);
     int t=in.nextInt();
      while(t-->0)
       {
      int n=in.nextInt();
      int a[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
        {
       a[i]=in.nextInt();
     }
     System.out.println(maxProduct(a));
       }
	}
}