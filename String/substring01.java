import java.util.*;
import java.lang.*;
import java.util.*;
class substring01{
 static int max(String str,int n)
{
int count0=0,count1=0;
int cnt=0;
for(int i=0;i<n;i++){
if(str.charAt(i)=='0')
{
count0++;
}
else{
count1++;
}
if(count0==count1){
cnt++;
}
}
if(count0!=count1){
return -1;
}
return cnt;
}
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int t=in.nextInt();
String s=in.next();
int l=s.length();
System.out.println(max(s,l));
}
}
