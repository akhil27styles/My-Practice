/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class mininSort {
    public static int getmin(int a[]){
        int n=a.length;
        if(a[0]<a[n-1]){
            return a[0];
        }
        int l=0;
        int r=n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(a[mid]<a[mid-1]&&mid!=0){
                return a[mid];
            }
          else  if(a[mid+1]<a[mid]&&mid!=n-1){
                return a[mid+1];
            }
            else{
                if(a[mid]>a[r]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            
        }
        return -1;
    }
	public static void main (String[] args) {
		//code
		Scanner in =new Scanner(System.in);
     int t=in.nextInt();
      while(t-->0)
       {
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
       a[i]=in.nextInt();
     }
     System.out.println(getmin(a));
       }
	}
}