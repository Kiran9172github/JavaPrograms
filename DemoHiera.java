import java.util.Scanner;
class A
{
 int a,b;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter Second Number");
b=sc.nextInt();
}
}
class B extends A
{
void add()
{
System.out.println("Addition="+(a+b));

}
class C extends A
{
void subtract
{
System.out.println("subtract="+(a-b));
}
}
class DemoHiera
{
B aa=new B();
C aa=new C();
aa.input();
aa.add();
bb.input();
bb.subtract();
}
}

                                                b





