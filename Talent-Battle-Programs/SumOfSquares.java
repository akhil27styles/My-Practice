/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class SumOfSquares {
    public static void SquareSum(int a[],int n){
        int sum=0;
    for(int i=0;i<n;i++){
        int s=(int)Math.sqrt(a[i]);
        if(s*s==a[i]){
            sum+=a[i];
        }
    }
     
     System.out.println(sum);   
    }
	public static void main (String[] args) {
	    int a[]={1, 2, 3, 4, 5, 9};
	    SquareSum(a,a.length);
	        }
    
	}
	
	
