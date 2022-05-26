import java.util.Scanner;
 class SwitchDemo
{
public static void main(String []args)
{
int a ,b,ch;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number first");
a=sc.nextInt();
System.out.println("Enter the number Second");
b=sc.nextInt();
System.out.println(" 1->addition 2->substraction 3-> mltiplication 4- > division  Default"); 
ch=sc.nextInt();
switch (ch)
{
case 1:
System.out.println("Addition"+(a+b));
break;
case 2:
System.out.println("subtraction"+(a-b));
break;
case 3:
System.out.println("multiplication"+(a*b));
break;

case 4:
System.out.println("Division"+(a/b));
break;
default:
System.out.println("Invalid choice");
}
}
}

