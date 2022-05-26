import java.util.Scanner;
class Calculater
{
public static void main (String []args)
{
int a,b,ch;
Scanner sc=new Scanner (System.in);
System.out.println("enter first number");
a=sc.nextInt();
System.out.println("enter Second number");
b=sc.nextInt();
System.out.println("your answrer");
ch=sc.nextInt();
if (ch==1)
System.out.println("addition"+(a+b));
else if(ch==2)
System.out.println("substration"+(a-b));
else if (ch==3)
System.out.println("multiplication"+(a*b));
else if (ch==4)
System.out.println("Division"+(a/b));
else 
System.out.println("Invalid");
}
} 
