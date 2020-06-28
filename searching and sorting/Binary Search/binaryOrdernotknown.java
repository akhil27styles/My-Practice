/*package whatever //do not write package name here */

import java.io.*;

class binaryOrdernotknown {
    
	public static void main (String[] args) {
	//	int a[]={34,19,14,10,8,5,3};
	    int a[]={3,5,8,10,14,19,34};
		int s=0;
		int l=a.length;
		int ele=14;
	int ans=binarySearch(a,s,l,ele);
	System.out.println("position :"+ans);
	}
	public static int binarySearch(int a[],int s,int l,int ele){
	    boolean Ascending=false,Descending=false;
	   if(a[0]>a[1]){
	       Descending=true;
	   }
	   else if(a[1]>a[0]){
	       Ascending=true;
	   }
	    while(s<=l){
	        int mid=s+(l-s)/2;
	        if(a[mid]==ele){
	            return mid;
	        }
	        else if(a[mid]>ele){
	            if(Ascending){ l=mid-1;}
	            if(Descending){ s=mid+1; }
	        }
	        else{
	            if(Ascending){ s=mid-1;}
	            if(Descending){ l=mid+1; }
	        }
	    }
	    return -1;
	}
}