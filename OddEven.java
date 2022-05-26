import java.util.Scanner;
class OddEven
{
public static void main(String []args)
{
int a;
Scanner sc =new Scanner(System.in);
System.out.println("Enter First Number");
a=sc.nextInt();
if (a%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
}
