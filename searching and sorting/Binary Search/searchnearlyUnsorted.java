import java.util.*;
import java.io.*;
import java.lang.*;
class searchnearlyUnsorted
{
    public static int binary(int a[],int s,int l,int e){
        while(s<=l){
            int mid=s+(l-s)/2;
            if(e==a[mid]){
                return mid;
            }
            if(mid-1>=s&&a[mid-1]==e){
                return mid-1;
            }
             if(mid+1<=l&&a[mid+1]==e){
                return mid+1;
            }
            else if(e>a[mid]){
                 s=mid+2;
            }
            else if(e<a[mid]){
                 l=mid-2;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	int a[]={5,10,30,20,40};
	int s=0,l=a.length,ele=20;
	int ans=binary(a,s,l,ele);
	System.out.println(ans);
	}
	
}
