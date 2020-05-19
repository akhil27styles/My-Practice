/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class anagram {
 public static boolean anagram (char [] s1,char [] s2) {
        if(s1.length!=s2.length){ return false;}
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
      
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    String s1=in.next();
		    String s2=in.next();
		    
		    if (anagram(s1.toCharArray(),s2.toCharArray()))
		    {
		       System.out.println("YES");
		    }
		    else{
		         System.out.println("NO");
		    }
		    }
		
	}
}