import java.util.Scanner;
class CheckNumber
{
public static void main(String args[])
{
Scanner sc =new Scanner (System.in);
int n,count=0,i;
System.out .println("Enter the Number");
n=sc.nextInt();
i=1;
while(i<=n)
{
if(n%i==0)
count=count+1;
i=i+1;
}
if(count==2)
System.out.println("prime number");
else
System.out.println("Not prime");
}
}