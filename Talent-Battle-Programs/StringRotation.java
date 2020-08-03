import java.util.*;
import java.lang.*;
import java.io.*;
class StringRotation{
public static boolean even_odd(int n){
        int sum=0;
        while(n!=0){
            int s=n%10;
            sum+=s*s;
            n/=10;
        }
        if(sum%2==0){
            return true;
        }
        return false;
    }
    public static String rotate(String s,int d){
         String ans = s.substring(d) + s.substring(0, d);
         return ans;
    }
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String s=in.next();
	    int n=in.nextInt();
	    int d=0;
	    if(even_odd(n)==true){
	        d=1;
	    }
	    else{
	        d=2;
	    }
	    String res="";
	   if(d==2){
	    res=rotate(s,d);
	   }
	   if(d==1){
	     res=rotate(s,s.length()-d);
	   }
	   System.out.println(res);
	}
}
