/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class longsubsec {

    public static int lg(int a[],int n){
    
        HashSet<Integer> h=new HashSet<>();
        int ans=0;
        for(int i=0;i<n;i++){
            h.add(a[i]);  // putting all the elements in hash
        }
        for(int i=0;i<n;i++){
            if(!h.contains(a[i]-1)){  //if it is not a starting number of the sequence
                int j=a[i];
                while(h.contains(j)) //if contains j then count 
                j++;
                if(ans<j-a[i])    // long subequence
                ans=j-a[i];
            }
        }
        return ans;
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
     

         System.out.println(lg(a,n));
       }
	}
}