/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class cyclically {
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
     int temp=a[n-1];
     for(int i=0;i<n;i++){
        int y=a[i];
         a[i]=temp;
         temp=y;
     }
      for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
       }
	}
}