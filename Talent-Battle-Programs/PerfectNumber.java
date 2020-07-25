
public class PerfectNumber
{
	public static void main(String[] args) {
	  int a=6;
	  int sum=0;
	  for(int i=1;i<a;i++){
	      if(a%i==0){
	      sum+=i;
	          System.out.print(i+", ");
	      }
	  }
	  System.out.println();
	  if(sum==a){
	      System.out.println("It is also a perfect number");
	  }
	  

	}
}
