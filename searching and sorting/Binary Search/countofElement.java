/*package whatever //do not write package name here */

import java.io.*;

class countofElement{
    
	public static void main (String[] args) {
	    int a[]={1,2,3,4,4,4,4,9};
		int s=0;
		int l=a.length;
		int ele=4;
	int f=first(a,s,l,ele);
	int k=last(a,s,l,ele);
	System.out.println("count :"+ (k-f+1));
	}
	public static int first(int a[],int s,int l,int ele){
      int res=-1;
	    while(s<=l){
	        int mid=s+(l-s)/2;
	        if(a[mid]==ele){
	            res=mid;
	            l=mid-1;
	        }
	        else if(a[mid]>ele){
              l=mid-1; 
	        }
	        else{
              s=mid+1;
	        }
	    }
	    return res;
	}
	
	
	
		public static int last(int a[],int s,int l,int ele){
        int res=-1;
	    while(s<=l){
	        int mid=s+(l-s)/2;
	        if(a[mid]==ele){
	            res=mid;
	            s=mid+1;
	        }
	        else if(a[mid]<ele){
              s=mid+1; 
	        }
	        else{
              l=mid-1;
	        }
	    }
	    return res;
	}
}