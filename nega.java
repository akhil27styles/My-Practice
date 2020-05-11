import java.util.*;
import java.lang.*;
import java.io.*;
class nega
   {
	public static void main (String[] args)
   {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int a[]=new int[n];
        for(int i=0;i<n;i++){
      a[i]=in.nextInt();
       }
       int key=0,j=0;
        for(int i=1;i<n;i++){
            key=a[i];
            if(key>0){
                continue;
            }
                j=i-1;
                while(j>=0&&a[j]>0){
                    a[j+1]=a[j];
                    j=j-1;
                }
                a[j+1]=key;
            
        }
       
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
 }
     