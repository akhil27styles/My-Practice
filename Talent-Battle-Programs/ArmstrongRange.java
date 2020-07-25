public class ArmstrongRange
{
    public static boolean Armstrong(int n){
        int num=n;
        int k=n;
        int i=0;
        double a=0;
        while(k!=0){
            i++;
            k=k/10;
        }
        while(n!=0){
            a=a+Math.pow(n%10,i);
            n/=10;
        }
        return a==num;
    }
	public static void main(String[] args) {
	 int num1=1;
	 int num2=1000;
	 int flag;
	 for(int i=num1;i<num2;i++){
	   if(Armstrong(i)){
	       System.out.print(i+" ");
	   }
	 }
	}
}
