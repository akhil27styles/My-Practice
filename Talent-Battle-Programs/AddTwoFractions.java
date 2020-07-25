
public class AddTwoFractions

{
	public static void main(String[] args) {
	    int a=2,b=2,c=2,d=2;
	    int x=(a*d)+(b*c);
	    int y=b*c;
	    int gcd=0;
	    for(int i=1;i<=x&&i<=y;i++){
	        if(x%i==0&&y%i==0){
	            gcd=i;
	        }
	    }
	    System.out.println("The lcm of "+a+"/"+b+" and "+c+"/"+d+"is= "+x/gcd+"/"+y/gcd);

	}
}
