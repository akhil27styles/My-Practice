// Java  program to find all the triplets with the given sum

import java.io.*;
//method -1 O(n^3)

class Main
{

static void find_all_triplets(int arr[], int n, int sum)
{
for (int i = 0; i < n – 2; i++)
{
for (int j = i + 1; j < n – 1; j++)
{
for (int k = j + 1; k < n; k++)
{
if (arr[i] + arr[j] + arr[k] == sum)
{
System.out.println(arr[i]+ ” ” + arr[j] + ” ” + arr[k]);
}
}
}
}
}

public static void main (String[] args)
{
int arr[] = {0, -1, 2, -3, 1};
int n = arr.length;
find_all_triplets(arr, n, -2);
}
}


//method -2
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    public static void triplet(int a[],int n,int sum){
        for(int i=0;i<n-2;i++){
            HashSet<Integer> h=new HashSet<>();
            int curr_sum=sum-a[i];
            for(int j=i+1;j<n;j++){
                if(h.contains(curr_sum-a[j])){
                    System.out.printf("%d %d %d",a[i],a[j],curr_sum-a[j]);
                    System.out.println();
                }
                h.add(a[j]);
            }
        }
    }
	public static void main (String[] args) {
	    int a[]={0, -1, 2, -3, 1};
	    int sum=-2;
	    triplet(a,a.length,sum);
	        }
    
	}
	
	
