import java.util.Scanner;
class DemoVowel
{
public static void main(String args[])
{
String a=new String();

Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
a=sc.nextLine();
int i,vol=0,con=0;


for (i=0;i<a.length();i++)
{
char c=a.charAt(i);
if(c!=' ' ) 
{
if(c=='A'||c=='E'||c=='i'||c=='o'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
vol ++;
else
con ++;
}
}
System.out.println("vowel="+vol+"Count"+con);
}
}