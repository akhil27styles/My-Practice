import java.util.*;
import java.lang.*;
import java.io.*;
class Range
   {
	public static void main (String[] args)
   {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=in.nextInt();
       }
       int max=a[0];
       int min=a[0];
         for(int i=1;i<n;i++){
          max=Math.max(a[i],max);
          min=Math.min(a[i],min);
       }
       System.out.println(max-min);
       

    }
 }
     