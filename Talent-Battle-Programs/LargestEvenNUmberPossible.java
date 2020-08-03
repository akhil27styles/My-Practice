import java.util.*;
import java.lang.*;
import java.io.*;

class LargestEvenNUmberPossible {
    public static void swap(char ch[],int i,int j){
        char te=ch[i];
        ch[i]=ch[j];
        ch[j]=te;
    }
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    String s=in.next();
		     char ch[]=s.toCharArray();
		     Arrays.sort(ch);
		     StringBuilder sb=new StringBuilder(new String(ch));
		     s=String.valueOf(sb.reverse());
		     if( (s.charAt(s.length()-1)-'0') % 2==0)
		     System.out.println(s);
		     else{
		         boolean even=false;
		         int i;
		      for(i=s.length()-1;i>=0;i--){
		         if((s.charAt(i)-'0')%2==0)
		         {
		             even=true;
		             break;
		         }
		     }  
		     if(!even)
		     System.out.println(s);
		     else{
		       ch=s.toCharArray();
		       swap(ch,i,ch.length-1);
		         Arrays.sort(ch,i,ch.length-1);
		         int l=i,j=ch.length-2;
		         while(i<j){
		             swap(ch,i,j);
		             i++;
		             j--;
		         }
		         String st=new String(ch);
		         System.out.println(st);
		     }
		     }
		}
	}
}