import java.util.Scanner;
class fre
{
int a[]=new int[10];
int key;
void getdata()
{
Scanner sc=new Scanner(System.in);
int i;
for (i=0;i<10;i++)
{
System.out.println("Enter no");
a[i]=sc.nextInt();
}
System.out.println("Enter number to find");
key=sc.nextInt();
}
void Count()
{
int i;
 int Count;
Count=0;
for(i=0;i<10;i++)
{
if (a[i]==key)
Count=Count+1;
}
System.out.println("Frequency"+Count);
}
}
class DemoFrequent
{
public static void main(String []args)
{
fre aa= new fre();
aa.getdata();
aa.Count();
}
}