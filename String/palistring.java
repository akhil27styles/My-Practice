/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class palistring {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		String s=in.next();
		   int l=s.length();
        String result="";
        for(int i=l-1;i>=0;i--){
      result=result+s.charAt(i);
        }
 if(result.equals(s)){
     System.out.println("Yes");
    }
   else{
    System.out.println("No");
    }
		}
	} 
}