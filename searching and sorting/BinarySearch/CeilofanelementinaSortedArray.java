import java.util.*;
import java.lang.*;
import java.io.*;
class CeilofanelementinaSortedArray
{
    public static int binary(int a[],int s,int l,int e){
        int res=0;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(e==a[mid]){
                return a[mid];
            }
            if(a[mid]<e){
                s=mid+1;
            }
            if(a[mid]>e){
            res=a[mid];
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
