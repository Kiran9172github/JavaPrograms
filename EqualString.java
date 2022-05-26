import java.util.Scanner;
class EqualString
{
public static void main(String args[])
{
String str1=new String();
String str2=new String();
Scanner sc =new Scanner(System.in);
System.out.println("Enter String1");
str1=sc.nextLine();
System.out.println("Enter String2");
str2=sc.nextLine();
if (str1.equals(str2))
System.out.println("Equal String");
else
System.out.println("Not Equal String");
}

} 