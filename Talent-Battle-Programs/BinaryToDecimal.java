import java.lang.*;
public class BinaryToDecimal
{
	public static void main(String[] args) {
	    int n=111111;
	    int s=0,i=0;
	    while(n!=0){
	        int r=n%10;
	        s=s+(int)Math.pow(2,i)*r;
	        n/=10;
	        i++;
	    }
		System.out.println(s);
	}
}
