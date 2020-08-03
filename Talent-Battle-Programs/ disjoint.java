// Java program to check if two sets are disjoint 

public class disjoint 
{ 
	// Returns true if set1[] and set2[] are 
	// disjoint, else false 
	boolean aredisjoint(int set1[], int set2[]) 
	{ 
		// Take every element of set1[] and 
		// search it in set2 
		for (int i = 0; i < set1.length; i++) 
		{ 
			for (int j = 0; j < set2.length; j++) 
			{ 
				if (set1[i] == set2[j]) 
					return false; 
			} 
		} 
		// If no element of set1 is present in set2 
		return true; 
	} 
	
	// Driver program to test above function 
	public static void main(String[] args) 
	{ 
		disjoint1 dis = new disjoint1(); 
		int set1[] = { 12, 34, 11, 9, 3 }; 
		int set2[] = { 7, 2, 1, 5 }; 

		boolean result = dis.aredisjoint(set1, set2); 
		if (result) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 

// second method

/* Java program to check if two sets are distinct or not */
import java.util.*; 

class Main 
{ 
	// This function prints all distinct elements 
	static boolean areDisjoint(int set1[], int set2[]) 
	{ 
		// Creates an empty hashset 
		HashSet<Integer> set = new HashSet<>(); 

		// Traverse the first set and store its elements in hash 
		for (int i=0; i<set1.length; i++) 
			set.add(set1[i]); 

		// Traverse the second set and check if any element of it 
		// is already in hash or not. 
		for (int i=0; i<set2.length; i++) 
			if (set.contains(set2[i])) 
				return false; 

		return true; 
	} 

	// Driver method to test above method 
	public static void main (String[] args) 
	{ 
		int set1[] = {10, 5, 3, 4, 6}; 
		int set2[] = {8, 7, 9, 3}; 
		if (areDisjoint(set1, set2)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 
