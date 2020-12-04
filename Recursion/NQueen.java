/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;
import java.util.*;
class NQueen {
    static boolean isSafe (int a[][],int x,int y,int n){
    for(int row=0;row<x;row++){
        if(a[row][y]==1){
            return false;
        }
    }
    int row=x;
    int col=y;
    while(row>=0&&col>=0){
        if(a[row][col]==1){
            return false;
        }
        row--;
        col--;
    }
    row=x;
    col=y;
    while(row>=0&&col<n){
        if(a[row][col]==1){
            return false;
        }
        row--;
        col++;
    }
    
       return true; 
    }
   static boolean nQueen(int arr[][],int x,int n){
       if(x>=n){
           return true; //backtracking
       }
       for(int col=0;col<n;col++){
           if(isSafe(arr,x,col,n)){
               arr[x][col]=1;
           if(nQueen(arr,x+1,n)){
               return true;
           }
           arr[x][col]=0;//backtracking
           }
           
       }
       return false;
   }
   
	public static void main (String[] args) {
	     
        int n=4;
        int solve[][]=new int[n][n];
        for (int[] row : solve) {
            Arrays.fill(row, 0); 
        }
        
        if(nQueen(solve,0,n)){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(solve[i][j]+" ");
            }
            System.out.println();
        }
        }
                         
	}
}