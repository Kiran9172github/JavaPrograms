import java.util.*;
class Vectormethods
{
public static void main(String args[])
{
Vector list=new Vector();
list.addElement("Vedika");
list.addElement("kiran");
list.addElement("Sakshi");
System.out.println(list);
list.insertElementAt("payal",2);
System.out.println("new Vector"+list);
System.out.println(list.size());
list.removeElement("Vedika");
System.out.println("updated"+list);
list.removeElementAt(1);
System.out.println("up"+list);
}
}

