import java.util.Scanner;
class binary
{
int a[]=new int[10];
int key;
void getdata()
{
Scanner sc=new Scanner(System.in);
int i;
for(i=0;i<10;i++)
{
System.out.println("Enter the number");
a[i]=sc.nextInt();
}
System.out.println("enter to serach");
key=sc.nextInt();
} 
void search()
{
int i,j,mid,pos,flag;
i=0;
j=9;
flag=0;
pos=0;

while(i<=j&&flag==0)
{
mid=(i+j)/2;
if (a[mid]==key)
{ 
flag=1;
pos=mid+1;
}
if (a[mid]>key)
j=mid-1;
if(a[mid]<key)
j=mid+1;
}
if(flag==0)
System.out.println("not Found");
else
System.out.println("no.found" + pos);
}
}

class DemoBinary
{
public static void main(String args[])
{
binary aa=new binary();
aa.getdata();
aa.search();

}
}