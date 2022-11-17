
package Day4;


class Employee {

	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;

   public void setEmployeeId(String employeeId){
   this.employeeId = employeeId;
   }
   public String getEmployeeId(){
   return this.employeeId;
   
   }
   
   public void setEmployeeName(String employeeName){
   this.employeeName = employeeName;
   }
   public String getEmployeeName(){
   return this.employeeName;
   }
   
    public void setSalary(int salary){
   this.salary = salary;
   }
   public int getSalary(){
   return this.salary;
   }
    public void setJobLevel(int jobLevel){
   this.jobLevel = jobLevel;
   }
   public int getJobLevel(){
   return this.jobLevel;
   }
   
	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
	
}

public class Encapsuexercise {

	public static void main(String args[]) {

		Employee employee = new Employee();
		employee.setEmployeeId("C101");
		employee.setEmployeeName("Steve");
		employee.setSalary(650);
		employee.setJobLevel(4);

		employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Salary: " + employee.getSalary());

	}
}
