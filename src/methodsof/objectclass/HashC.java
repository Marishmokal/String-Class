package methodsof.objectclass;//hashcode method

public class HashC {
String name;
int rollNo;

HashC()
{
	super();
}
HashC(String name,int rollNo)
{
	this.name=name;
	this.rollNo=rollNo;
}
public int hashCode()
{
	return rollNo;
}
public static void main(String args[])
{
	HashC s=new HashC("ram",101);
	HashC s1=new HashC("ram",102);
	
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
}
}
