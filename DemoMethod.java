class A
{
void massage()
{
System.out .println("base calss ");
}
}
class B extends A
{
void massage()
{
System.out.println("Derived class");
}
}
class DemoMethod
{ 
public static void main(String args[])
{
B aa=new B();
aa.massage();
}
}
