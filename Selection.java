import java.util.Scanner;
class Selection1
{
int a[]=new int[10];
int i;
void getdata()
{
Scanner sc=new Scanner (System.in);
int i;
for(i=0;i<10;i++)
{
System.out.println("Enter no");
a[i]=sc.nextInt();
}
}
void putdata()
{
for(i=0;i<10;i++)
System.out.println(a[i]);
}
void sort()
{
int i,j,t;
for (i=0;i<9;i++)
for(j =i+1;j<10;j++)
{
if (a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
}
class SelectionDemo
{
public static void main(String args[])
{
Selection aa=new Selection();
aa.getdata();
System.out.println("unsorted Array");
aa.putdata();
System.out.println("sorted Array");
aa.sort();
aa.putdata();
}
}

