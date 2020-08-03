/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseAStringWithoutAffectSpecial {
    public static void reverse(char str[]){
       int r=str.length-1,l=0;
    while(l<r){
        if(!Character.isAlphabetic(str[l])){
            l++;
        }
        else if(!Character.isAlphabetic(str[r])){
            r--;
        }
        else{
            char temp=str[l];
            str[l]=str[r];
            str[r]=temp;
            l++;
            r--;
        }
    } 
        
    }
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    String str=in.next();
		   char ch[]=str.toCharArray(); 
		   reverse(ch);
		   String ans=new String(ch);
		   System.out.println(ans);
		   
		}
		
	}
}