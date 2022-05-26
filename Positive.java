import java.util.Scanner;
class Positive
{
public static void main(String []args)
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
a=sc.nextInt();
if(a>0)
System.out.println("positive number");
else if(a<0)
System.out.println("Negetive number");
else
System.out.println("equal");
}
}  