//Remove Dupliactes from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
        if(nums[j]!=nums[i]){
            i++;
            nums[i]=nums[j];
        }
        }
        return i+1;
    }
}

//method-2 using linked hashset
//unsorted
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
	
	      	while(t-->0){
  LinkedHashSet<Integer>h=new LinkedHashSet<Integer>();
		    int n=in.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		        h.add(a[i]);
		    }
		    for(int c:h){
		        System.out.print(c+" ");
		    }
		    System.out.println();
		    
		}
	}
}