import java.util.*;
import java.lang.*;
import java.io.*;
class SearchElementInMatrix
{
    public static int[] search(int a[][],int n,int m,int e){
        int i=0;
        int j=m-1;
        int l[]=new int[2];
         l[0]=-1;
         l[1]=-1;
    while(i>=0&&i<n&&j>=0&&j<m){
        if(a[i][j]==e){
            int ans[]=new int[2];
            ans[0]=i;
            ans[1]=j;
            return ans;
            
        }
        else if(a[i][j]>e){
            j--;
        }
        else if(a[i][j]<e){
            i++;
        }
    }
    return l;
    }
	public static void main(String[] args) {
		int a[][]={{10,20,30,40},
	        	{15, 25, 35, 45},
	        	{27, 29,37,48},
	        	{32,33,39,50} };
	        	int row=a.length;
	        	int col=a[0].length;
	        	int e=26;
           int [] k=search(a,row,col,e);
           System.out.println("row= "+k[0]+" column= "+k[1]);
	
	}
}
