/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class negendposstart {
    
    //Move negative at start and positive at end
    // public static void rearrange(int a[],int n){
    //     int j=0;
    //     for(int i=0;i<n;i++){
    //         if(a[i]<0){
    //             if(i!=j){
    //                 int temp=a[i];
    //                 a[i]=a[j];
    //                 a[j]=temp;
    //             }
    //             j++;
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         System.out.print(a[i]+" ");
    //     }
        
    // }
     //Move negative at end and positive at start
    public static void rearrange(int a[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                if(i!=j){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                j++;
            }
        }
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	while(t-->0){
	    int n=in.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=in.nextInt();
	    }
	    rearrange(a,n);
	}
	}
}