import java.util.*;
import java.lang.*;
import java.io.*;
public class PrintUniqueElements
{
	public static void main(String[] args) {
	    int arr[]={1,2,2,3,4,4,5,5,6,7,7,7};
		int size=arr.length;
		int l=0;
		for (int i = 0; i < size; i++)  
        { 
            for (int j = 0; j < size; j++)  
            { 
                if (arr[i] == arr[j])  
                    l++; 
            }
            if(l==1){
                System.out.print(arr[i]+" ");
            }
            l=0;
        } 
	}
}

//2-method
import java.util.*; 
  
class GFG { 
  
    static void firstNonRepeating(int arr[], int n) 
    { 
        // Insert all array elements in hash 
        // table 
        Map<Integer, Integer> m = new HashMap<>(); 
        for (int i = 0; i < n; i++) { 
            if (m.containsKey(arr[i])) { 
                m.put(arr[i], m.get(arr[i]) + 1); 
            } 
            else { 
                m.put(arr[i], 1); 
            } 
        } 
  
        // Traverse through map only and 
        // using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<Integer, Integer> x : m.entrySet()) 
            if (x.getValue() == 1) 
                System.out.print(x.getKey() + " "); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 9, 4, 9, 6, 7, 4 }; 
        int n = arr.length; 
        firstNonRepeating(arr, n); 
    } 
} 