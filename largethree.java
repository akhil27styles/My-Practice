/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;
class largethree
   {
	public static void main (String[] args)
   {
       Scanner in=new Scanner(System.in);

    int t=in.nextInt();
    while(t-->0){
    int  n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }
    Arrays.sort(a);
    for(int i=n-1;i>n-4;i--) //idhar akhil tum --i karna or i ko > karna bhool jate ho
      {
     System.out.print(a[i]+" ");
      }
  }
 }
 }