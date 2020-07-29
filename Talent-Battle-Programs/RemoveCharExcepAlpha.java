import java.util.*;
public class RemoveCharExcepAlpha
{
public static void main(String args[])
{
String str;
int i, j;
Scanner sc = new Scanner(System.in);
System.out.print(“\nEnter the string : “);
str = sc.nextLine();
for (i = 0; i < str.length(); i++)
{
if (str.charAt(i) < ‘A’ || str.charAt(i) > ‘Z’ && str.charAt(i) < ‘a’ || str.charAt(i) > ‘z’)
{
str = str.substring(0, i) + str.substring(i + 1);
i–;
}
}
System.out.print(str);
}
}