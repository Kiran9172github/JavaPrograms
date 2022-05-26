import java.util.Scanner;
class linear
{
int a[]=new int[10];
int key;
void getdata()
{
Scanner sc =new Scanner(System.in);
int i;
for(i=0;i<10;i++)
{
System.out.println("enter no");
a[i]=sc.nextInt();
}
System.out.println("Enter no to Search");
key=sc.nextInt();
}
void search()
{
int i,flag=0,pos;
for(i=0;i<10 && flag==0;i++)
{
if(a[i]==key)
{
flag=1;
pos=i+1;
}
}
if (flag== !)
System.out.println("no is found"+pos);
else
System.out.println("not found");
}
}
class LinearDemo
{
public static void main(String args[])
{
linear aa = new linear();
aa.getdata();
aa.search();
}
}

