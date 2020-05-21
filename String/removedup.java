/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class removedup {
   

	public static void main (String[] args) {
		//code
Scanner in =new Scanner(System.in);
int t=in.nextInt();

while(t-->0)
{
       String str=in.next();
    LinkedHashSet<Character> l=new LinkedHashSet<Character>();

        for(int i=0;i<str.length();i++){
            l.add(str.charAt(i));
        }
        

  for(char ch:l){
  System.out.print(ch);      
  }
   System.out.println();
}
}
}