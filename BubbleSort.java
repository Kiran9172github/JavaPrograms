import java.util.Scanner;
class Bubble
{
int a[]=new int[10];
int i;
void getdata()
{
Scanner sc=new Scanner (System.in);
for(i=0;i<10;i++)
{
System.out.print("enter  no");
a[i]=sc.nextInt();
}
}
void putdata()
{
int i;
for (i=0;i<10;i++)
System.out.println(a[i]);
}
void sort()
{
int i,j,t;
for(i=0;i<10;i++)
for(j=0;j<9-1;j++)
{
if (a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=1;
}
}
}
}
class BubbleSort
{
public static void main(String args[])
{
Bubble aa=new Bubble();
aa.getdata();
System.out.println("unsortted Array");
aa.putdata();
System.out.println("Sorted Array Is");
aa.sort();
aa.putdata();
}
}
