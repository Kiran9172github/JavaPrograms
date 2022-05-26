import java.util.Scanner;
class DemoCompare
{
public static void main(String args[])
{
String s1=new String(); 
String s2=new String();
Scanner sc=new Scanner(System.in);
System.out.println("enter the String1");
s1=sc.nextLine();
System.out.println("Enter the String2");
s2=sc.nextLine();
if (s1.compareTo(s2)==0)
System.out.println("Equal String");
else
System.out.println("Not equal String");
}
}
