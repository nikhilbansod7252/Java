package day3;

class Person
{
	public String name; //instsance variables
	public int age;
	
	public void run()
	{
		System.out.println("run");
	}
}

public class Classobj2 {
 public static void main(String[] args) {
	Person p1 = new Person();
	p1.run();
	p1.name = "luffy";
	System.out.println(p1.name);
	Person p2  = new Person();
	p2.age = 22;
	System.out.println(p2.age);
}
}
