import java.util.Scanner;
class insert
{
int a[]=new int[10];
void getdata()
{ 
int i;
Scanner sc=new Scanner (System.in);
for(i=0;i<10;i++)
{
System.out.println("Enter number");
a[i]=sc.nextInt();

}
}
void putdata()
{
int i;
for(i=0;i<10;i++)
System.out.println(a[i]);

}
void sort()
{
int i,val,j;
for(i=1;i<10;i++)
val=a[i];
j=i-1;
while(val < a[i]);
{
a[j+1]=a[j];
j--;
if(j==-1)
}
}
a[j+1]=val;
}


class InsertionDemo
{
public static void main(String args[])

{
insert aa=new insert();
aa.getdata();
System.out.println("unsorted array");
aa.putdata();
aa.sort();
System.out.println("Sorrted array");
aa.putdata();
}
}

