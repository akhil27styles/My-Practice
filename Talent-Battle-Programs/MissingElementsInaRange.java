import java.util.Arrays;
import java.util.HashSet;

public class MissingElementsInaRange
{
static void print_missing_elements(int ar[], int start, int end)
{
HashSet<Integer> hs = new HashSet<>();

for (int i = 0; i < ar.length; i++)
hs.add(ar[i]);

for (int i = start; i <= end; i++)
{
if (!hs.contains(i))
{
System.out.print(i + ” “);
}
}
}

public static void main(String[] args)
{
int arr[] = { 1, 2, 3, 8, 9 };
int start = 1, end = 5;
System.out.print(“Missing elements : ” );
print_missing_elements(arr, start, end);
}
}

	Output
// Enter the number of elements : 5
// Input the array elements : 1 2 3 8 9
// Enter the start and end value : 1 5
// Missing numbers : 4 5


// Time complexity: O(n + (high-low+1)).