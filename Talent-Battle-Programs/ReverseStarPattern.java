public class ReverseStarPattern
{
	public static void main(String[] args) {
   int n=6;
   int k=0;
   for(int i=n;i>=1;i--,k=0){
       for(int j=1;j<=n-i;j++){
       System.out.print("  ");
        }
  while(k!=2*i-1){
      System.out.print("* ");
      k++;
  }
   System.out.println();
   }
	}
}
