package methodsof.objectclass;//Equals method

public class EqualsDemo {
String name;
int rollNo;

EqualsDemo()
{
	super();
}
EqualsDemo(String name,int rollNo)
{
	this.name=name;
	this.rollNo=rollNo;
}
public boolean equals(Object obj) {//content equality overridden
	if(this==obj)
		return true;
	if(obj instanceof EqualsDemo) {
		EqualsDemo s=(EqualsDemo)obj;{
			if(rollNo==s.rollNo && name.equals(s.name)) {
				return true;
			}
			return false;
		}
	}
	return false;
}
public static void main(String args[])
{
	EqualsDemo s=new EqualsDemo("Krishna",101);
	EqualsDemo s1=new EqualsDemo("Krishna",101);
	System.out.println(s.equals(s1));//reference equality by object class mehtod
}
}
