/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;
class Eachchcount {

 static void countstr(String s){
    int count[]=new int[256];
    for(int i=0;i<s.length();i++){
        count[s.charAt(i)]++;
    }
    char ch[]=new char[s.length()];
    for(int i=0;i<s.length();i++){
        ch[i]=s.charAt(i);
         int  find=0;
        for(int j=0;j<s.length();j++){
          
            if(ch[i]==ch[j]){
                find++;
            }
            
        }
        if(find==1){
                System.out.println("Char "+s.charAt(i)+" occurence are:"+ count[s.charAt(i)]);
            }
            
    }
}
// class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	while(t-->0){
	    String str=in.next();
	    countstr(str);
	}
	}
}