/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class numofRever {
public static int rever(String s){

 if (s.length()%2 != 0) {
        return -1; 
 }
       Stack <Character> stack=new Stack <>();
		    for(char c:s.toCharArray()){
		        if(c=='}'&&!stack.empty()){
		            if(stack.peek()=='{'){
		            stack.pop();
		        }
		        else{
		            stack.push(c);
		        }
		        }
		        else{
		            stack.push(c);
		        }
		    }
		        int res=stack.size();
		        int n=0;
		        while(!stack.empty()&&stack.peek()=='{'){
		            stack.pop();
		            n++;
		        }
		       return (res/2+n%2);   
}
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		while(t-->0){
		    String s=in.next();
		    
		    System.out.println(rever(s));
		}	
	}
}