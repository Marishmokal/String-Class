package immutable.test;

public class Immutable {
public static void main(String[] args) {
	Engine eng=new Engine(100,"Hundai");
	Car c=new Car(5880,"Red",eng);
	eng.setName("Mahindra");
	System.out.println(c);
}
}
final class Car
{
	private final int no;
	private final String colour;
	private final Engine eng;
	
	public Car(int no, String colour, Engine eng) {
		super();
		this.no = no;
		this.colour = colour;
		Engine eng1 = new Engine();
		eng1.setSpeed(eng.getSpeed());
		eng1.setName(eng.getName());
		this.eng=eng1;
	}
	public int getNo()
	{
		return no;
	}
	public String getColour()
	{
		return colour;
	}
	public Engine getEngine()
	{
		Engine eng2=new Engine();
		eng2.setName(eng.getName());
		eng2.setSpeed(eng.getSpeed());
		return eng2;
	}
	@Override
	public String toString() {
		return "car["+no+"  no"+colour+"  colour"+eng+"  Engine"+"]";
	}
}
class Engine
{
	int speed;
	String name;
	Engine()
	{
		
	}
	Engine(int speed,String name)
	{
		this.speed=speed;
		this.name=name;
	}
	public int getSpeed()
	{
		return speed;
	}
	public String getName()
	{
		return name;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	@Override
	public String toString() {
		return "Engine["+name+"name"+speed+"speed"+"]";
	}
	
}