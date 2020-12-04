/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
import java.util.*;
class RatInAMaze {
    static boolean isSafe (int a[][],int x,int y,int n){
        if(x<n&&y<n&&a[x][y]==1){
            return true;
        }
        return false;
    }
    static boolean ratInMaze(int arr[][],int x,int y,int n,int solve[][]){
        if((x==(n-1))&&(y==(n-1))){
            solve[x][y]=1;
            return true;
        }
        if(isSafe(arr,x,y,n)){
            solve[x][y]=1;
            if(ratInMaze(arr,x+1,y,n,solve)){
                return true;
            }
            if(ratInMaze(arr,x,y+1,n,solve)){
                return true;
            }
            solve[x][y]=0;//back
            return false;
            
        }
        return false;
    }
	public static void main (String[] args) {
	     
	   int arr[][] =     { { 1, 0, 0, 0 }, 
                         { 1, 1, 0, 1 }, 
                         { 0, 1, 0, 0 }, 
                         { 1, 1, 1, 1 } };
        int n=arr.length;
        int solve[][]=new int[n][n];
        for (int[] row : solve) {
            Arrays.fill(row, 0); 
        }
        if(ratInMaze(arr,0,0,n,solve)){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(solve[i][j]+" ");
            }
            System.out.println();
        }
        }
                         
	}
}