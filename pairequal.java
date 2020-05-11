/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class pairequal {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int k=in.nextInt();
		    int a[]=new int[n];
		    int count=0,sum=0;
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        for(int j=i;j<n;j++){
		        sum=a[i]+a[j];
		        if(sum==k&&i!=j){
		            count++;
		            sum=0;
		        }
		    }
		    }
		    System.out.println(count);
		    count=0;
		    
		}
	}
}