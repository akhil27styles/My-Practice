public class PrimeNumberRange
{
	public static void main(String[] args) {
	 int num1=10;
	 int num2=50;
	 int flag;
	 for(int i=num1+1;i<num2;i++){
	     flag=0;
	     for(int j=2;j<=i/2;j++){
	         if(i%j==0){
	             flag=1;
	             break;
	         }
	     }
	     if(flag==0){
	     System.out.print(i+" ");
	     }
	 }
	}
}
