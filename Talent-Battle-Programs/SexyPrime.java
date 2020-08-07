/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SexyPrime {
 static boolean [] prime= new boolean[10000001]; 
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int k=10000001;
		Arrays.fill(prime, true); 
		 for(int i=2;i<k;i++) 
           {
        if (prime[i]==true) 
        {
            for(int j=i+i;j<k;j+=i) 
            {
               prime[j]=false;
            }
        }
    }
    
	
		int t=in.nextInt();
		while(t-->0){
		int s=in.nextInt();
		int e=in.nextInt();
	   int p=0;
	   for (int i=s; i+6<=e; i++) 
        {
            if (prime[i]&&prime[i+6]) 
            {
                	System.out.print(i+" "+(i+6)+" ");
                p=1;
            }
        }
        if(p==0){
      System.out.print("-1");
        }
                
		System.out.println();
		}
		
	}
}