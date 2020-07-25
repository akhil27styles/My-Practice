public class ThreeOccurs
{
   public static int three(int n){
        int count=0;
      while(n!=0){
          if(n%10==3){
              count++;
          }
          n/=10;
      }
        return count;
    }
	public static void main(String[] args) {
    int n=100;
    int count=0;
    for(int i=2;i<=n;i++ ){
        count+=three(i);
    }
	System.out.println(count);
	
	}
}
