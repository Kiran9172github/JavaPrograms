import java.util.Scanner;
class Palindrone
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n,rev=0,z;
System.out.println("Enter The Number");
n=sc.nextInt();
z=n;
while(n>0)
{
rev=(rev*10)+n%10;
n=n/10;
}
if(rev==z)
System.out.println("Number is Palindrone");
else
System.out.println("Not Palindrone");
}
}
