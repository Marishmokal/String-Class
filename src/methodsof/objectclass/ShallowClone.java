package methodsof.objectclass;//shallow cloaning

class Cat
{
	int j;
	Cat(int j)
	{
		this.j=j;
	}
	
}
class Dog implements Cloneable
{
	Cat c;
	int i;
	Dog(Cat c,int i)
	{
		this.c=c;
		this.i=i;
	}
protected Object Clone() throws CloneNotSupportedException
{
	return super.clone();
}
}
class ShallowClone
{
	public static void main(String args[])throws CloneNotSupportedException
	{
		Cat c=new Cat(20);
		Dog d1=new Dog(c,10);
		System.out.println(d1.i+"  "+d1.c.j);
		Dog d2=(Dog)d1.Clone();
		d2.i=888;
		d2.c.j=999;
		System.out.println(d1.i+" "+d1.c.j);
}
}