import java.util.*;
class mobile{
static String seq(String a[],String in){
String o="";
int n=in.length();
for(int i=0;i<n;i++){
if(in.charAt(i)==' '){
o=o+"0";
}
else{
int pos=in.charAt(i)-'A';
o=o+a[pos];
}
}
return o;
}
public static void main(String[] args) 
    { 
        // storing the sequence in array 
        String str[] = {"2","22","222", 
                        "3","33","333", 
                        "4","44","444", 
                        "5","55","555", 
                        "6","66","666", 
                        "7","77","777","7777", 
                        "8","88","888", 
                        "9","99","999","9999"
                    }; 
  
        String input = "AKHIL"; 
        System.out.println(seq(str, input)); 
    } 
} 