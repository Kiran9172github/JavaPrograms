import java.util.Scanner;
class Pyramid12
{
public static void main(String args[])
{
int n,i,s,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Row");
n=sc.nextInt();
for (i=1;i<=n;i++)
{
for (s=1;s<=n-i;s++)
System.out.print("_");
for(j=1;j<=i;j++)
System.out.print("*");
System.out.println();
}
}
}