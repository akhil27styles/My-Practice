import java.util.*;
import java.lang.*;
import java.io.*;
class  
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int temp=-1;
	        int n=sc.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++)
	            arr[i]=sc.nextInt();
	            
	        for(int i=0;i<n;i++)
	        {   int flag=0;
	            for(int j=i+1;j<n;j++)
	            {
	                if(arr[i]==arr[j])
	                {
	                    flag=1;
	                    temp=i+1;
	                    break;
	                }
	            }
	            if(flag==1)
	            break;
	        }
	        System.out.println(temp);
	    }
	 }
}