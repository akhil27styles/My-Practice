/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Subarray0 {
	public static void main (String[] args) {
	Scanner in =new Scanner(System.in);
     int t=in.nextInt();
      while(t-->0)
       {
      int n=in.nextInt();
      int a[]=new int[n];
      int sum=0;
      boolean yes=false;
      for(int i=0;i<n;i++)
        {
      a[i]=in.nextInt();
      if(a[i]==0){
          yes=true; 
          }
     }
  
     for(int i=0;i<n;i++){
          sum=a[i];
          for(int j=i+1;j<n;j++){
         
            sum+=a[j];
             if(sum==0){
             yes=true;
             break;
         }
           }
       
          }
          if(yes){
              System.out.println("Yes");
          }
          else{
              System.out.println("No");
          }
       }
	}
}