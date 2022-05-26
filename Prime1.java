import java.util.Scanner;
class Prime1 

{
int n,i,count;
Void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.to check:");
n=sc.nextInt();
}
Void putdata()
{
int i;count=0;
for (i=1;i<=n;i++)
{
if (n%i==0)
count=count+1;
}
if (count==2)
System.out.println("prime");
else 
System.out.println("Not Prime");
}
public static void main(String []args)
{
Prime1 aa=new Prime1();
aa.getdata();
aa.putdata();
}
}




 

 