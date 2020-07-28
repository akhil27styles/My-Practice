import java.lang.*;
public class Decimaltobinary
{
	public static void main(String[] args) {
	    int n=5;
	    int s=0,i=0;
	    int b[]=new int[32];
	    while(n!=0){
	        b[i]=n%2;
	        n/=2;
	        i++;
	    }
	   for(int j=i-1;j>=0;j--){
		System.out.print(b[j]);
	    }
	}
}
