 
interface area
{
final static float pi=3.14F;
float calculate(float x,float y);
}
class rectangale
{
public static calculate (float x,float y)
{
return x*y;
}
class circle
{
public float calculate(float x,float y)
{
return pi*x*X;
}
}
}
class DemoInter
{
public static void main(String args[])
{
rectangle rect=new rectangle();
circle cir=new circle();
area a;
a=rect;
System.out.println("Area Rectangle="+a.calculate(10,20));
a=cir;
System.out.println("Area Circle="+a.calculate(10,0));
}
} 
