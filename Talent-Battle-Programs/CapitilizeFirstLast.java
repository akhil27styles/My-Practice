public class CapitilizeFirstLast
{
	public static void main(String[] args) {
	    String str="akhil";
	    System.out.println((char)((int)str.charAt(0)-32)+str.substring(1,str.length()-1)+(char)((int)str.charAt(str.length()-1)-32));
	    
	}
}