import java.io.*;


class Demo
{
public static void main (String [] args)throws IOException
{
int a,b,sum;
BufferedReader br=new BufferedxReader(new InputStreamReader(System.in));
System.out.println("Enter first Number");
a= Integer.perseInt(br.readLine());
System.out.println("Enter Second Number");
b=Integer.parseInt(br.readLine());
sum=a+b;
System.out.println("Addition=" +sum);
}
}