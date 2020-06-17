/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.IOException;

class post {
    public static void postfix(String arr,int n){
       Stack<Integer> stack = new Stack<Integer>();
    int i =0;
    for(i = 0; i<n; i++){
      char c = arr.charAt(i);
      if(Character.isDigit(c)){
        stack.push(c-'0');
      }
      else{

        int x = stack.pop();
        int y = stack.pop();

        switch(c){

          case '+':
            stack.push( y + x );
            break;

          case '-':
              stack.push( y - x);
              break;

          case '*':
              stack.push( y * x);
              break;

          case '/':
              stack.push( y/x);
              break;
        }

      }
    }
    System.out.println(stack.pop());
    }
	public static void main (String[] args)throws IOException {
		//code
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String s=br.readLine();
		    int n = s.length();
		    postfix(s,n);
		   
		}
	}
}