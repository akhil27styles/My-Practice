/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
import java.util.*;
class reverse { 
    public static String reverse(String str)
    {
        if(str == null || str.isEmpty())
        { return str;
            }
        char[] characters = str.toCharArray();
        int i = 0; 
        int j = characters.length - 1; 
        while (i < j) 
        {
            swap(characters, i, j);
            i++;
            j--;
            }
            return new String(characters);
            }
           private static void swap(char[] str, int i, int j)
           {
               char temp = str[i];
               str[i] = str[j];
               str[j] = temp;
               }
public static void main(String args[]) 
    {
        
  Scanner in=new Scanner(System.in);
        String str =in.next();
        System.out.println(reverse(str));
}
}