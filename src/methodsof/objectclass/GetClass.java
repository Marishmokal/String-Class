package methodsof.objectclass;

public class GetClass {
String name;
int rollNo;

GetClass()
{
	super();
}
GetClass(String name,int rollNo)
{
	this.name=name;
	this.rollNo=rollNo;
}
public static void main(String args[])
{
	GetClass g=new GetClass("ram",101);
	GetClass f=new GetClass("sham",102);
	
	System.out.println(g.getClass().getName());
	System.out.println(f.getClass().getName());
}
}
