import java.util.*;
import java.lang.*;
import java.io.*;
class miss
   {
	public static void main (String[] args)
   {
       Scanner in=new Scanner(System.in);
    int to=0,sum=0;
    
    int  n=in.nextInt();
    int a[]=new int[n-1];
    for(int i=0;i<n-1;i++)
    {
        a[i]=in.nextInt();
    }
    for(int i=1;i<=n;i++){
        to+=i;
    }
    for(int i=0;i<n-1;i++){
        sum+=a[i];
    }
    System.out.println(to-sum);
    

}
}