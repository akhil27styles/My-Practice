/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
import java.util.*;

class duplicatestring {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
        String str =in.next();
		
		char[] inp = str.toCharArray();
		ArrayList<Character> a=new ArrayList<>();
  System.out.println("Duplicate Characters are:");
  for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
    if (inp[i] == inp[j]) {
        if(a.contains(inp[i])){
            break;
        }
        
     System.out.print(inp[j]+" ");
     a.add(inp[i]);
 
	}
  }
 }
}
}