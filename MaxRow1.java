/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;



// 1 ST approach
class MaxRow1 {
	public static void main (String[] args) {
		//code
		Scanner in =new Scanner(System.in);
     int t=in.nextInt();
      while(t-->0)
       {
      int n=in.nextInt();
       int m=in.nextInt();
      int A[][]=new int[n][m];
      int max=0,count=0,pk=0,pos=0;
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
          A[i][j]=in.nextInt();
      }
	}
	for(int i=0;i<n;i++){
	     for(int j=0;j<m;j++){
	       if(A[i][j]==1){
	           count++;
	           pos=i;
	       }  
	}
       if(max<count){
          max=count;
          pk=pos;
             }
             count=0;
	}
	System.out.println(pk);
       }
       
       }
}




//Approach 2
only for sorted array
  int row = 0;
    int i = 0, j = m - 1;
    while(i < n && j >= 0){
        if(A[i][j] == 1){
            row = i;
            j--;
        }
        else i++;
    }

	System.out.println(row);