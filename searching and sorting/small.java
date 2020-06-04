
// Given a number n. The task is to find the smallest number whose factorial contains at least n trailing zeroes.

// Examples:
// Input : n = 1
// Output : 5
// 1!, 2!, 3!, 4! does not contain trailing zero.
// 5! = 120, which contains one trailing zero.

// Input:
// The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer n.

// Output:
// For each test case in a new line print the required output.

// Constraints:
// 1 <= T <= 100
// 1 <= n <= 100

// Example:
// Input:
// 2
// 1
// 6
// Output:
// 5
// 25

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class small {
    
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	       int n=in.nextInt();
	       int k=0,c=0,f=0;
	       for(int i=5;i<=500;i+=5){
            k=i;
            while(k%5==0){
                c++;
               k=k/5;
                
            }
            if(c>=n){
               System.out.println(i);
                   // f=1;
                    break;
                }
        }
	    }
	}
}