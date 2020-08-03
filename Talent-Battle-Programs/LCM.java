public class LCM
{
	public static void main(String[] args) {
	    int n1=6,n2=7;
	    int mult;
	    mult=(n1>n2)?n1:n2;
	    while(true){
	        if(mult%n1==0&&mult%n2==0){
	            System.out.println(mult);
	             break;
	        }
	     	mult++;  
	    }
	}
}