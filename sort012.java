import java.util.*;
import java.lang.*;
import java.io.*;
class sort012
   {
	public static void main (String[] args)
   {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int a[]=new int[n];
       int z=0,o=0,t=0;
       for(int i=0;i<n;i++){
           a[i]=in.nextInt();
       }
       for(int i=0;i<n;i++){
           if(a[i]==0){
               z++;
           }
           if(a[i]==1){
            o++;
            }
           if(a[i]==2){
           t++;
          }
       }
       int zero=z;
       int one=z+o;
       int two;
       for(int i=0;i<n;i++){
           if(i<zero){
               a[i]=0;
           }
           if(i>=zero&&i<one){
               a[i]=1;
           }
           if(i>=one&&i<n){
               a[i]=2;
           }
       }
       for(int i=0;i<n;i++){
           
       System.out.print(a[i]+" ");
       }

    }
 }
     cmd