/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    int i=n-1;
		    for(i=n-1;i>0;i--){
		        if(a[i]>a[i-1]){
		            break;
		        }
		    }
		    if(i==0){
		        System.out.println("not possible");
		    }
		    else{
		        int x=a[i-1],min=i;
		        for(int j=i+1;j<n;j++){
		            if(a[j]>x&&a[j]<a[min]){
		                min=j;
		            }
		            
		        }
		        swap(a,i-1,min);
		        Arrays.sort(a,i,n);
		        for(i=0;i<n;i++){
		            System.out.print(a[i]+" ");
		        }
		    }
		   System.out.println(); 
		}
	}
}
