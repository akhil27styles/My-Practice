import java.io.*;
import java.util.*;

public class LeftRightRotate {
    public static void print(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
private static void leftRotate(int[] inputArray, int n) 
    {     
        int temp;
         
        for (int i = 0; i < n; i++)
        {
            temp = inputArray[0];
             
            for (int j = 0; j < inputArray.length-1; j++) 
            {
                inputArray[j] = inputArray[j+1];
            }
             
            inputArray[inputArray.length - 1] = temp;
        }
         print(inputArray,inputArray.length);
    }
    private static void rightRotate(int[] inputArray, int n)
    {
         
        int temp;
         
        for (int i = 1; i <= n; i++) 
        { 
            temp = inputArray[inputArray.length-1]; 
             
            for (int j = inputArray.length-1; j > 0; j--) 
            {
                inputArray[j] = inputArray[j-1];
            }
             
            inputArray[0] = temp;
        }
         print(inputArray,inputArray.length);
    }
    
     

    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        if(r<0){
        leftRotate(a,Math.abs(r));
            
        }
        else if(r>0){
       rightRotate(a,r);
        }   
    }
}