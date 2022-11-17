package day1;

public class Operators {
 public static void main(String[] args) {
	int numOne = 10;
	int numTwo = 45;
	//boolean isTrue = true;
//	System.out.println(numOne++ +" "+ ++numOne); //10 12
//	System.out.println(numTwo-- + " " + --numTwo); //45 43
//	System.out.println(!isTrue + " " + ~numOne); //false -13

	int min = ( numOne > numTwo ) ? numOne : numTwo;
	//  <condition> ? <value if condition is true> : < value if condition is false> 
	System.out.println(min);
	
	
}
}
