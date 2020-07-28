
public class primeFactor
{
    public static void prime(int n){
        String s="";
        while(n%2==0){
          s=s+2+",";
          n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i=i+2){
            while(n%i==0){
                s=s+i+",";
                n/=i;
            }
        }
        if(n>2){
            s=s+n+",";
        }
        System.out.println(s.replaceAll(",$",""));
        
    }
	public static void main(String[] args) {
	    int n=99;
	prime(n);
	}
}
