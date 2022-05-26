import java.util.Scanner;
class Demons
{
public static void main(String [] args)
{
int len,br,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Length");
len=sc.nextInt();
System.out.println("Enter Breadth:");
br=sc.nextInt();
area=len*br;
System.out.println("Area of Rectangle="+area);
}
}
