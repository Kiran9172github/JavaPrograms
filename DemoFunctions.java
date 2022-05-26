import java.util.Scanner ;
class DemoFunctions
{
public static void main(String args[])
{
String s=new String();
int len;
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
s=sc.nextLine();
len=s.length();
for(i=0;i<len;i++)
System.out.println(s.charAt(i));
}
} 