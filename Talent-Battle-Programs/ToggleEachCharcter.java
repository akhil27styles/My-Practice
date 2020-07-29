public class ToggleEachCharcter
{
	public static void main(String[] args) {
	    String str="aKh   Il KuMaR     SiNgH";
	    String ans="";
		  char ch[]=str.toCharArray();
		  for(int i=0;i<str.length();i++){
		      if(ch[i]>='A'&&ch[i]<='Z'){
		          ans+=(char)((int)ch[i]+32);
		      }
		      else if(ch[i]>='a'&&ch[i]<='z'){
		          ans+=(char)((int)ch[i]-32);
		      }
		      else if(ch[i]==' '){
		          ans+=' ';
		      }
		  }
		System.out.println(ans);
	}
}