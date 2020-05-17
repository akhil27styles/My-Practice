/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class posaltoneg {
	public static void main (String[] args) {
		//code
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	while(t-->0){
	    int n=in.nextInt();
	    int a[]=new int[n];
	    int k=1,j=0;
	    for(int i=0;i<n;i++){
	        int x=in.nextInt();
	        if(x<0){
	            a[k]=x;
	            k+=2;
	        }
	        if(x>0){
	            a[j]=x;
	            j+=2;
	        }
	    }
	    for(int i=0;i<n;i++){
	        System.out.print(a[i]+" ");
	    }
	    System.out.println();
	}
	}
}