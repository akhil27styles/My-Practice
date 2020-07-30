/*package whatever //do not write package name here */

import java.io.*;

class typeofArray {
	public static void main (String[] args) {
	    int a[]={1,2,3,4};
	    int even=0,odd=0;
	    for(int i=0;i<a.length;i++){
	        if(a[i]%2==1){
	            odd++;
	        }
	        else if(a[i]%2==0){
	            even++;
	        }
	    }
	        if(odd==a.length){
	            System.out.println("odd list");
	        }
	        else if(even==a.length){
	            System.out.println("even list");
	        }
	        else{
	            System.out.println("mixed");
	        }
	       
	    
	}
}