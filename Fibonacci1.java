import java.util.Scanner;
class Fibonacci1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); b 
int x=0,y=1,z=0,n;
System.out.println("Enter the number");
n=sc.nextInt();
while (z<=n)
{
System.out.println(z);
x=y;
y=z;z=x+y;
}
}
}