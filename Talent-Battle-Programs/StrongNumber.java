/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class StrongNumber {
    public static int fact(int n){
        int a=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            a=a*i;
        }
        return a;
    }
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int num=n;
		    int sum=0;
		    while(n!=0){
		        int a=n%10;
		       sum=sum+fact(a);
		        n=n/10;
		    }
		    if(sum==num){
		        System.out.println("Strong");
		    }
		    else{
		         System.out.println("Not Strong");
		    }
		}
	}
}