// Recursive Java program to 
// count total number of 
// handshakes when a person 
// can shake hand with only one. 

//Approach:
//handshake(n) = (n-1) + handshake(n-1)
             //= (n-1) + (n-2) + handshake(n-2)
             //= (n-1) + (n-2) + .... 1 + 0
             //= n * (n - 1)/2
--------------------------------------------------------------------
class MaxiNoOfHandShakes
{ 

// function to find all 
// possible handshakes 
static int handshake(int n) 
{ 
	return n * (n - 1) / 2; 
} 

// Driver code 
public static void main(String args[]) 
{ 
	int n = 9; 
	System.out.println(handshake(n)); 
} 
} 

// This code is contributed 
// by Arnab Kundu 
