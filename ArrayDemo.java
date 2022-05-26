import java.util.Scanner;
class ArrayDemo
{
public static void main(String args[])
{
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
for(int i =0;i<10;i++)
{
System.out.println("Enter number");
a[i]=sc.nextInt();
}
for(i=0;i<10;i++)
System.out.println(a[i]);
}
}