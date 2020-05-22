/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class minnumflips {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    String s=in.next();
		    int l=s.length();
		    int count0=0;
		    int count1=0;
		    for(int i=0;i<l;i++){
		         if(i%2==0){   // 0 present
	            if(s.charAt(i)=='1')
	              count0++;
	             else count1++;  
	        }
	        else{
	            if(s.charAt(i)=='1')
	             count1++;
	             else count0++;
	        }
		       
		    }
		    int ans=count0<count1?count0:count1;
		    System.out.println(ans);
		}
	}
}

