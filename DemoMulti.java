import java.util.Scanner;
class A
{
int a;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
a=sc.nextInt();
}
}
class B extends A
{
int b;
void getdata()
{
Scanner sc=new Scanner(System.in);
b=sc.nextInt();
}
}
class C extends B 
{
void add()
{
System.out.println("Addition="+(a+b));
}
}
class DemoMulti
{
public static void main(String args[])
{
C aa=new C();
aa.input();
aa.getdata();
aa.add();
}
} 