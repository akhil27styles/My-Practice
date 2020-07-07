/*package whatever //do not write package name here */

import java.io.*;

class KNAPSACK {
    public static int knapsack(int w[],int v[],int Wg,int n ){
        if(n==0||Wg==0)
            return 0;
        else if(w[n-1]<=Wg){
            return Math.max(v[n-1]+knapsack(w,v,Wg-w[n-1],n-1),knapsack(w,v,Wg,n-1));
        }
        else if(w[n-1]>Wg){
            return knapsack(w,v,Wg,n-1);
        }
        return 0;
    }
	public static void main (String[] args) {
	    int v[]={60,100,120};
	    int w[]={10,20,30}; 
	    int Wg=50;
	    int n=v.length;
	    int ans=knapsack(w,v,Wg,n);
	    System.out.println(ans);
	}
}