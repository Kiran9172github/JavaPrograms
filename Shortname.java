import java.util.Scanner;
class Shortname
{
public static void name(String args[])
{
String str1=new String();
Scanner sc =new Scanner(System.in);
System.out.println("Enter Name");
str1=sc.nextLine();
int i,j;
char c,d;
i=str1.length()-1;
while(str1.charAt(i)!=' ')
i--;
j=0;
while(j<i)
{
if(j==0)
System.out.println(str1.charAt(j)+".");
else
{
c=str1.charAt(j);
d=str1.charAt(j+1);
if (c==' '&&d!=' ')
System.out.print(d+".");
}
j++;
}
System.out.println(str1.substring(i));
}
}
