import java.util.*;
import java.lang.*;
import java.io.*;
public class CountDistinctElements
{
    //method -1 Sorting o(nlogn)
    // public static void distinct(int a[],int n){
    //     Arrays.sort(a);
    //     int res=0;
    //     for(int i=0;i<n;i++){
    //     while(i<n-1&&a[i]==a[i+1]){
    //         i++;
    //     }
    //     res++;
    //     }
    //     System.out.println(res);
    // }
    public static void distinct(int a[],int n){
    HashSet<Integer>h=new HashSet<>();
    for(int i=0;i<n;i++){
        h.add(a[i]);
    }
    System.out.println(h.size());
        
    }
	public static void main(String[] args) {
	    int a[]={1,2,2,3,3,3,4,4,4,8,9,10,11,11};
      distinct(a,a.length);
	}
}
