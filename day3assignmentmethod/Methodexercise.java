package day3assignmentmethod;

class Calculator {

	public double findAverage(int number1, int number2, int number3) {
		double avg = (double)(number1+number2+number3)/3;
		double roundOff = Math.round(avg * 100.0) / 100.0;
		return roundOff;
		
	}
}

class Methodexercise {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		// Invoke the method findAverage of the Calculator class and display the average
		calculator.findAverage(12, 8, 15);
		System.out.println(calculator.findAverage(12,8,15));
	}
}