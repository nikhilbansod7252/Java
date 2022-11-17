package day3;
class Student {
	public int rollno;
	public String name;
	public float fee;
	 Student(int rollno, String name, float fee) {
		this.rollno = rollno; //this keyword is a reference variable which refers to the current onject
		//It is because when the constructor is called, this inside the constructor is replaced by the object obj that has called the constructor.
		//like this s1.rollno = 22;
		this.name = name;
		this.fee = fee;
	}
	 void display() {
		 System.out.println(rollno+ " " + name + " "+ fee);
	 }
}
public class Thiskeywordandembiguity {

	public static void main(String[] args) {
	 Student s1 = new Student(111,"ankit",5000f);
	 s1.display(); 
	}
}
