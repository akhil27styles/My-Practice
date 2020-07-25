
public class primeNumber
{
	public static void main(String[] args) {
	  int a=17;
	  int sum=0;
	  int flag=0;
	  for(int i=2;i<=a/2;i++){
	      
	  if(a%i==0){
	     flag=1;
	      break;
	  }
	  }
	  if(a==1){
	      System.out.println("not prime not composite");
	  }
	  else{
      if(flag==0){
          System.out.println("prime");
      }
      else{
          System.out.println("not prime");
      }
	  }
	}
}
