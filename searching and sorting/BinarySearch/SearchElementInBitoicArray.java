import java.util.*;
import java.lang.*;
import java.io.*;
class SearchElementInBitoicArray
{
    public static int peak(int a[],int s,int l){
        while(s<=l){
            int mid=s+(l-s)/2;
            if(mid>0&&mid<a.length-1){  // 0th or n-1 ko chod ke  
            if(a[mid-1]<a[mid]&&a[mid]>a[mid+1]){
                return mid;
            }
            if(a[mid-1]>a[mid]){
                l=mid-1;
            }
            else{
                s=mid+1;
            }
            }
            else if(mid==0){  // jab 0th position par peak ho agar pehle wali if condition mai nhi nikle
            if(a[0]>a[1]){
                return 0;
            }
            else{
                return 1;
            }
            }
            else if(mid==a.length-1){    // jab last wala peak ho ya usse pehle wala
            if(a[a.length-1]>a[a.length-2]){
                return a[a.length-1];
            }
            else{
                return a[a.length-2];
            }
          }
        }
        return -1;
    }
    public static int BsLeft(int a[],int s,int l,int e){ //Array in Ascending order
        while(s<=l){
            int mid=s+(l-s)/2;
            if(a[mid]==e){
                return mid;
            }
            else if(a[mid]<e){
              s=mid+1;  
            }
            else{
                l=mid-1;
            }
        }
        return -1;
    }
       public static int BsRight(int a[],int s,int l,int e){  // Array in Descending order
        while(s<=l){
            int mid=s+(l-s)/2;
            if(a[mid]==e){
                return mid;
            }
            else if(a[mid]>e){
              s=mid+1;  
            }
            else{
                l=mid-1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int a[]={1, 3, 4, 6, 9, 14, 11, 7, 2};
		int e=14;
		int s=0,l=a.length;
		int index=peak(a,s,l);
	
// 		System.out.println(index);
// 		}
		int left=BsLeft(a,0,index-1,e);
		int right=BsRight(a,index,l-1,e);
		if(left==-1&&right!=-1){
		    System.out.println(right);
		}
			if(left!=-1&&right==-1){
		      System.out.println(left);
	     	}
	     	else if(left==-1&&right==-1){
	     	    System.out.println(-1);
	     	}
	}
}
