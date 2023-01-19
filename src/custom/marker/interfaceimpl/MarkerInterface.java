package custom.marker.interfaceimpl;
interface delatable
{
	
}
class Test11 implements delatable
{
	
}

public class MarkerInterface {
public static void main(String[] args) {
	Test11 t=new Test11();
	String s=new String();
	MarkerInterface m=new MarkerInterface();
	
	System.out.println(delete(t));
	System.out.println(delete(s));
	System.out.println(delete(m));
}
public static boolean delete(Object o)
{
	if(o instanceof delatable)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}

