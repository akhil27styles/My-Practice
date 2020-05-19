/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;
class rep { 
      
  
    static String removeSpace(String str) 
    { 
        str = str.replaceAll("\\s",""); 
        return str; 
    } 
     public static void main(String args[]) 
    { 
        Scanner in=new Scanner(System.in);
        String str =in.next();
        char ch[]=str.toCharArray();
        String l="";
       for(char s:ch){
        l=l+s; 
         }
        
        System.out.println(removeSpace(l)); 
    } 
} 
  