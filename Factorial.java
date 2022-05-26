import  java.util.Scanner;
class Factorial
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
int n,f ac=1;
System.out.println("Enter the Number");
n=sc.nextInt();
while(n>0)
{
fac=fac*n;
n=n-1;
}
System.out.println("Factorial="+fac);
}

}