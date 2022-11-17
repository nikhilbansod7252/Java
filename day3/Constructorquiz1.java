package day3;

class Testo {
	   
	   public String message;
	   
	   public Testo(String name){
	   message = name;
	   }
	   public void printMessage(){
	      System.out.println(message);
	   }
	   
}
	   public class Constructorquiz1 {   
		   
	   public static void main(String args[]) {
	      Testo tester = new Testo("Nikhil");
	      System.out.println(tester.message);
	      tester.printMessage();
	   }
	   }