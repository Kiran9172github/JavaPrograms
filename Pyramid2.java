import java .util.Scanner;
class  Pyramid2
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n,i,j;
System.out.println("Enter your choice");
n=sc.nextInt();
for(;n>=1;n--)
{ 
for (j=1;j<=n;j++)
{
System.out.print(n);
}
System.out.println();
}
}
}


