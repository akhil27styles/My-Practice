/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class triplesum {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0){
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[m];
		    for(int i=0;i<m;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr); //sorting
		    int flag =0;
		    for(int i=0;i<m-1;i++){
		        int j  = i+1;
		        int l = m-1;
		        while(j<l){
		            if(arr[i]+arr[j]+arr[l]==k){
		                flag =1;
		                break;
		            }
		            else if(arr[i]+arr[j]+arr[l]>k){
		                l--;
		            }
		            else{
		                j++;
		            }
		        }
		        
		    }
		    if(flag==0){
		        System.out.println(0);
		    }
		    else{
		        System.out.println(1);
		    }
		}
	}
}