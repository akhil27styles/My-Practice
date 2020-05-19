/*package whatever // do not write package name here */

import java.io.*; 
import java.util.*;
import java.lang.*;
class reverseWords { 
    public static void eachrev(String s){
        Stack<Character> a=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '){
                a.push(s.charAt(i));
            }
            else{
                while(a.empty()==false){
                    System.out.print(a.pop());
                }
                System.out.print(" ");
            }
            
        }
        
        while(a.empty()==false){
        
            System.out.print(a.pop());
        }
    }
	public static void main(String[] args) 
	{ 
	    Scanner in=new Scanner(System.in);
	    String str=in.next();
// 		String str = "akhil kumar singh"; 
    eachrev(str);
	} 
} 

//method 2
/*package whatever // do not write package name here */

import java.io.*; 
import java.util.*;
import java.lang.*;
class GFG { 
    public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
while(T > 0) {
String sent = sc.next();
String[] strArray = sent.split("\\.");
String result;
for (int i = 0; i < strArray.length; i++) {
result = "";
for (int j = strArray[i].length() - 1; j >= 0; j--) {
result = result + strArray[i].charAt(j);
}
System.out.print(result);
if(i != strArray.length - 1) {
System.out.print(".");
}
}
System.out.println();
T--;
}
sc.close();
}
}
