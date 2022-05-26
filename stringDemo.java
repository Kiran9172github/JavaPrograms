import java.util.Scanner;
class stringDemo
{
public static void main(String args[])
{
String name=new String();
String address=new String();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your name");
name=sc.nextLine();
System.out.println("Enter Address");
address=sc.nextLine();
System.out.println("your name  "  +name+ "  address"  +address);
}
}