public class removeBrackets
{
	public static void main(String[] args) {
	    String str="x-(p+[q])+(y-a)";
	    String ans="";
		  char ch[]=str.toCharArray();
		  for(int i=0;i<str.length();i++){
		     if(ch[i]=='(' ||ch[i]==')' || ch[i]=='{' ||ch[i]=='}'  || ch[i]=='[' ||ch[i]==']'){
		         ans+="";
		     }
		     
		     else{
		     ans=ans+ch[i];
		     }
		  }
		     
		  
		System.out.println(ans);
	}
}