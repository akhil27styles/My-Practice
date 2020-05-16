/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class subset {
    static boolean isSubset(int arr1[], int arr2[], int n, 
                                                 int m) 
    { 
        HashSet<Integer> hset= new HashSet<>(); 
        
        for(int i = 0; i < n; i++) 
        { 
            if(!hset.contains(arr1[i])) 
                hset.add(arr1[i]); 
        } 
              
       
        for(int i = 0; i < m; i++) 
        { 
            if(!hset.contains(arr2[i])) 
                return false; 
        } 
        return true; 
    }  
	public static void main (String[] args) {
		Scanner in =new Scanner(System.in);
     int t=in.nextInt();
      while(t-->0)
       {
      int n=in.nextInt();
      int m=in.nextInt();
      int count=0,k=0;
     int a[]=new int[n];
     int b[]=new int[m];
      for(int i=0;i<n;i++){
        a[i]=in.nextInt();
      }
       for(int i=0;i<m;i++){
         b[i]=in.nextInt();
      }
      
     
       if(isSubset(a,b,n,m)){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       
       }
           
       }
	}
}