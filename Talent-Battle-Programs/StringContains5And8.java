import java.util.*;
import java.lang.*;
import java.io.*;
public class StringContains5And8
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    String s="";
	    int a[]=new int[n];
	    int pos1=0,pos2=0;
	    int sum=0;
	    for(int i=0;i<n;i++){
	       a[i]=in.nextInt();
	       s=s+a[i];
	    }
	    for(int i=0;i<n;i++){
	        if(s.charAt(i)=='5'){
	            pos1=i;
	        }
	        if(s.charAt(i)=='8'){
	            pos2=i;
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(i>=pos1&&i<=pos2){
	            continue;
	        }
	        sum+=a[i];
	    }
	    String m=s.substring(pos1,pos2+1);
	     System.out.println(m);
        int k=Integer.parseInt(m);
		System.out.println(k+sum);
	}
}
