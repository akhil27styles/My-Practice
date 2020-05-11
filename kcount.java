import java.util.*;
import java.lang.*;
import java.io.*;
class kcount
   {
	public static void main (String[] args)
   {
       Scanner in=new Scanner(System.in);
       int k=in.nextInt();
       int n=in.nextInt();
       int a[]=new int[n];
       int count=0;
       for(int i=0;i<n;i++){
           a[i]=in.nextInt();
       }
       for(int i=0;i<n;i++){
           if(a[i]==k){
               count++;
           }
           
       }
       System.out.println(count);
       

    }
 }
     