import java.util.Scanner;
class CountWord
{
public static void main(String args[])
{
String s=new String();
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
s=sc.nextLine();
int i,count=1;
for(i=0;i<s.length()-1;i++)
{
char c,d;
c=s.charAt(i);
d=s.charAt(i+1);
if (c==' '&&d!=' ')
count++;
}
 System.out.println("Total word" + count);
}
}
