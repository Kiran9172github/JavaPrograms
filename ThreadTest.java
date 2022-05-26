class ThreadTest
{
public static void main(String args[])
{
new A().start();
new B().start();
new C().start();

}
}
class A extends Thread
{
public void run()
{
int i;
for(i=1;i<=5;i++);
{
System.out.println("i="+i);

}
}
}
class B extends Thread
{
public void run()

{
int j;
for(j=0;j<=5;j++)
{
System.out.println("j="+j);
}
}
}
class C extends  Thread
{
public void run()
{



int k;
for(k=1;k<=5;k++)
{
System.out.println("k="+k);
}
}
}