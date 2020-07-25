public class ReplaceZeroWithOne
{
    public static int replace (int n){
   if(n==0){
       return 0;
   }
   
    int d=n%10;
    if(d==0){
        d=1;
    }
    return replace(n/10)*10+d;
    }
    public static int convert(int n){
        if(n==0){
            return 1;
        }
        else{
            return replace(n);
        }
    }
 
	public static void main(String[] args) {
    int n=8050;
    System.out.println(convert(n));
	}
}
