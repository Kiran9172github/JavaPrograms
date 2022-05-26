import java.util.Scanner;
class Exbs
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer();
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
sb.append(sc.nextLine());
sb.setCharAt(3,'u');
System.out.println(sb);
sb.insert(5,"saheb");
System.out.println(sb);
sb.setLength(20);
System.out.println(sb);
}
}