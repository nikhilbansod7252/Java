package day3;

class ClassB {
	
	ClassB() {
	  System.out.println("default constructor");	
	}
	ClassB(int x) {
	  this();
	  System.out.println(x);	
	}
	
}
public class Thiskeywordtoinvokecurrentclassconstructor {

	public static void main(String[] args) {
		
     ClassB a = new ClassB(10);
	}

}
