class Prime100
 {
public  static void main(String args[])
{
int i,number,j;
for (i=1;i<=100;i++)
{
number=0;
for(j=1;j<=i;j++)
{
if 
(i%j==0)
number++;

}
if (number==2)
System.out .println(i);
}
}
} 
