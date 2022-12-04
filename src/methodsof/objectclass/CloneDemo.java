package methodsof.objectclass;//Deep cloning
class Marish
{
	int i;
	Marish()
	{
		super();
	}
	Marish(int i)
	{
		this.i=i;
	}
	
}
public class CloneDemo implements Cloneable
{
Marish m;
int j;
CloneDemo(Marish m,int j)
{
	this.m=m;
	this.j=j;
}
public static void main(String args[])throws CloneNotSupportedException
{
	Marish m=new Marish(9);
	CloneDemo c=new CloneDemo(m,4);
	System.out.println(c.m.i+" "+c.j);
	CloneDemo c1=(CloneDemo)c.clone();
	
	c1.m.i=30;
	c1.j=15;
	System.out.println(c1.m.i+" "+c1.j);
//	System.out.println(c.equals(c1));
}
protected Object cloneDemo()
{
	Marish m1=new Marish(m.i);
	CloneDemo c2=new CloneDemo(m1,j);
	return c2;
}
}
