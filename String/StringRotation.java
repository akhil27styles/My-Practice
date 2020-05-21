

import java.io.*;
import java.util.*;
import java.lang.*;
class StringRotation 
{ 

	static boolean areRotations(String str1, String str2) 
	{ 
		
		return (str1.length() == str2.length()) && 
			((str1 + str1).indexOf(str2) != -1); 
	} 
	
	// Driver method 
	public static void main (String[] args) 
	{ 
	    Scanner in=new Scanner(System.in);
		String str1 = in.next(); 
		String str2 = in.next();
		

			System.out.println(areRotations(str1, str2)); 
		
	} 
} 

