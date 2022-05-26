class student
{
int roll;
String name;
static String  Cname = "XYZ collage";
student (int x,String y)
{
roll=x;
name=y;
}
void display()
{
System.out.println("Roll="+roll+"Name="+name+"collage name"+Cname);
class Static1
{
public static void main (String []args)
{
student aa=new  student(101,"ram");
student bb=new student(102,"shyam");
aa.display();
bb.display();
}
}
}
}