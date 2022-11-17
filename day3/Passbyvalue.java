package day3;

class ClassA {
	public void changeValue(int value1, int value2) { //local variables val1,val2 //only values are copied to var1 and var2//not providing address
		value1 = value1 + value2;
		value2 = value1 - value2;
		System.out.println(value1 + " " + value2); //30 20
	}
}
public class Passbyvalue {
	public static void main(String[] args) {
		 ClassA demo = new ClassA();
	        int x = 20;
	        int y = 10;
	        System.out.println(x + " " + y); //20 10
	        demo.changeValue(x, y); //
	        System.out.println("After calling changeValue function");
	        System.out.println(x + " " + y); //20 10

	}

}
