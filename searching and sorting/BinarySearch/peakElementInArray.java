import java.util.*;
import java.lang.*;
import java.io.*;
class peakElementInArray
{
    public static int peak(int a[],int s,int l){
        while(s<=l){
            int mid=s+(l-s)/2;
            if(mid>0&&mid<a.length-1){  // 0th or n-1 ko chod ke  
            if(a[mid-1]<a[mid]&&a[mid]>a[mid+1]){
                return a[mid];
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
                return a[0];
            }
            else{
                return a[1];
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
	public static void main(String[] args) {
		int a[]={5,10,20,15,30,78,98,45};
		int s=0,l=a.length;
		int ans=peak(a,s,l);
		System.out.println(ans);
	}
}
