/*package whatever //do not write package name here */
 //Given a string str containing alphanumeric characters, calculate sum of all numbers present in the string.
   Input:
// 4
// 1abc23
// geeks4geeks
// 1abc2x30yz67
// 123abc

// Output:
// 24
// 4
// 100
// 123
import java.util.*;
import java.lang.*;
import java.io.*;

class  alphanumeric{
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		String s=in.next();
		char ch[]=s.toCharArray();
		int sum=0,k=0;
		for(int i=0;i<s.length();i++){
		    if(Character.isDigit(ch[i])){
		        k=k*10+Character.getNumericValue(ch[i]);
		    }
		    else{
		        sum=sum+k;
		        k=0;
		    }
		}
		sum=sum+k;
		System.out.println(sum);
		}
	}
}