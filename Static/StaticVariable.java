package Static;

class Employee {
	int empId;
	int salary;
	static String ceo;
	
	public void display() {
	System.out.println(empId + " " + salary + " " + ceo);	
}
}
public class StaticVariable {

	public static void main(String[] args) {
       Employee navin = new Employee();
       navin.empId = 3;
       navin.salary = 20000;
       navin.ceo = "Joe";
       
       Employee avin = new Employee();
       avin.empId = 4;
       avin.salary = 40000;
       avin.ceo = "Joe";
       
       Employee.ceo = "kj";
       
       navin.display();
       avin.display();
       
	}

}
