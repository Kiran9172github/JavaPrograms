import java.util.Scanner;
class Armstrong1
{
public static void main(String args[])
{
int n,z,count=0,digit,i,pro,sum=0;
Scanner sc =new Scanner (System.in);
System.out.println("Enter  the number");
n=sc.nextInt();
z=n;
while(z>0)
{
count=count+1;
z=z/10;
}
z=n;
while(z>0)
{
digit=z%10;pro=1;
for(i=1;i<=count;i++)
pro=pro*digit;
sum=sum+pro;
z=z/10;
}
if(sum==n)
System.out.println("ArmStrong");
else
System.out.println("Not ArmStorng");
}
}