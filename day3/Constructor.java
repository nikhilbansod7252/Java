package day3;
class ClassName {
	public String customerID;
	ClassName() {
		
	//this is constructor which is called when obj is created
	System.out.println("this is constructor");
	}
}
public class Constructor {
	public static void main(String[] args) {
      ClassName c1 = new ClassName(); //this parameterless constructor as no value in ClassName(.....) whenever new is created one constructer is called only have to create by developer
      System.out.println(c1.customerID);
	}
}
