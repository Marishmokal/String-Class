package methodsof.objectclass;

public class ToString {
String name;
int rollNo;

ToString()
{
	super();
}
ToString(String name,int rollNo)
{
	this.name=name;
	this.rollNo=rollNo;
}
public String toString()//toString overridden
{
	return rollNo+" ";
}
public static void main(String args[])
{
	ToString t=new ToString("ram",101);
	ToString t1=new ToString("ram",201);
	
	System.out.println(t.toString());//toString method by object class
	System.out.println(t1.toString());
}
}
