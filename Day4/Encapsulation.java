package Day4;

class Demo {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
	  
	Demo d = new Demo();
	d.setName("Kapil");
	System.out.println(d.getName());
	}

}
