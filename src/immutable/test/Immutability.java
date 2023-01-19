package immutable.test;
final class Collage
{
	private final String cName;
	private final int cId;
	private final String city;
	private final Student s;
	
	
	public Collage(String cName, int cId, String city, Student s) {
		super();
		this.cName = cName;
		this.cId = cId;
		this.city = city;
		Student s1=new Student();
		s1.setId(s.getId());
		s1.setName(s.getName());
		this.s=s1;
	}


	public String getcName() {
		return cName;
	}


	public int getcId() {
		return cId;
	}


	public String getCity() {
		return city;
	}


	public Student getS() {
		Student s2=new Student();
		s2.setId(s.getId());
		s2.setName(s.getName());
		return s2;
	}


	@Override
	public String toString() {
		return "Collage [cName=" + cName + ", cId=" + cId + ", city=" + city + ", s=" + s + "]";
	}
	
	
	
}
class Student
{
	int id;
	String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class Immutability {
	public static void main(String[] args) {
Student s=new Student(10,"ram");
Collage c=new Collage("K j collage", 111,"pune", s);
  s.setName("Marish");
  System.out.println(c);
}
}