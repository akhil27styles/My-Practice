
import java.util.*;
import java.io.*;
import java.lang.*;
class FloorofanelementinaSortedArray
{
    public static int binary(int a[],int s,int l,int e){
        int res=0;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(e==a[mid]){
                return a[mid];
            }
            if(a[mid]<e){
                res=a[mid];
                s=mid+1;
            }
            if(a[mid]>e){
               l=mid-1;
            }
        }
        return res;
    }
	public static void main(String[] args) {
	int a[]={1,2,3,4,6};
	int s=0,l=a.length,ele=5;
	int ans=binary(a,s,l,ele);
	System.out.println(ans);
	}
	
}
