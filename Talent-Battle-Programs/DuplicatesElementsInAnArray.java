import java.util.*;
import java.lang.*;
import java.io.*;
public class DuplicatesElementsInAnArray
{
public static void main(String[] args) {
    int arr[]={1,2,2,3,4,4,4,4,5,5,6,7,7,7};
    int size=arr.length;
    LinkedHashSet<Integer>h=new LinkedHashSet<>();
    for(int i = 0; i < size; i++) 
        { 
            if(arr[Math.abs(arr[i])] > 0) 
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
            else
                h.add(Math.abs(arr[i])); 
        } 
         for(int c:h){
        System.out.print(c+" ");
           }
    
}
}
