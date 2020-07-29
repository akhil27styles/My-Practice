
import java.util.*;
import java.lang.*;
import java.io.*;
public class UniqueCharacter
{
    //Using IndexOf() method)
  public static String unique (String s)
  {
    String str = new String ();
    int len = s.length ();
    for (int i = 0; i < len; i++)
      {
	// character at i'th index of s 
	char c = s.charAt (i);

	// if c is present in str, it returns 
	// the index of c, else it returns -1 
	if (str.indexOf (c) < 0)
	  {
	    str += c;
	  }
      }

    return str;
  }
  // method-2 using HashSet o(n)
 public static String hashunique (String s)
  {
	    HashSet<Character> h=new HashSet<Character>();
	    String str="aman";
	    String ans="";
	    char ch[]=str.toCharArray();
	    for(int i=0;i<str.length();i++){
	     h.add(ch[i]);
	    }
	    for(char c:h){
        	ans+=c;
	    }
	    return ans;
  }
public static void main(String[] args) {
    String str="aman";
    System.out.println(unique(str));
}
}
