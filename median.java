/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class median {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s[] = br.readLine().trim().split("\\s+");
		    int r = Integer.parseInt(s[0]);
		    int c = Integer.parseInt(s[1]);
		    int a[][] = new int[r][c];
		    int p =0;
		     String str[] = br.readLine().trim().split("\\s+");
		    for(int i =0;i<r;i++)
		    {
		        
		       
		        for(int j =0;j<c;j++)
		        a[i][j] = Integer.parseInt(str[p++]);
		        
		    }
		    int b[] = new int[r*c];
		    int i1 =0;
		    for(int i =0;i<r;i++)
		    {
		        
		        for(int j =0;j<c;j++)
		         b[i1++] = a[i][j]; 
		        
		    }
		    Arrays.sort(b);
		    System.out.println(b[(r*c -1)/2]);
		    
		    
		}
	}
}