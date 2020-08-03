// A Java program to find all symmetric pairs in a given array of pairs 
import java.util.*;
import java.lang.*;
import java.io.*;

class SymmetricPair { 

	// Print all pairs that have a symmetric counterpart 
	static void findSymPairs(int arr[][]) 
	{ 
		// Creates an empty hashMap hM 
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>(); 

		// Traverse through the given array 
		for (int i = 0; i < arr.length; i++) 
		{ 
			// First and second elements of current pair 
			int first = arr[i][0]; 
			int sec = arr[i][1]; 
			
			// Look for second element of this pair in hash 
			Integer val = hM.get(sec); 

			// If found and value in hash matches with first 
			// element of this pair, we found symmetry 
			if (val != null && val == first) 
			System.out.println("(" + sec + ", " + first + ")"); 
				
			else // Else put sec element of this pair in hash 
			hM.put(first, sec); 
		} 
	} 

	// Driver method 
	public static void main(String arg[]) 
	{ 
	    Scanner in=new Scanner(System.in);
	   System.out.println("Enter size of Array");
	    int n=in.nextInt();
	    int row=n/2;
	    int column=2;
	    int arr[][]=new int[row][column];
	    System.out.println("Enter elements");
	    for(int i=0;i<row;i++){
	        for(int j=0;j<column;j++){
	        arr[i][j]=in.nextInt();
	       }
	    }
	    
// 		int arr[][] = new int[5][2]; 
// 		arr[0][0] = 11; arr[0][1] = 20; 
// 		arr[1][0] = 30; arr[1][1] = 40; 
// 		arr[2][0] = 5;  arr[2][1] = 10; 
// 		arr[3][0] = 40; arr[3][1] = 30; 
// 		arr[4][0] = 10; arr[4][1] = 5; 
		findSymPairs(arr); 
	} 
} 
