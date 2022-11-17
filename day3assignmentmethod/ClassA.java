package day3assignmentmethod;
class Customer {
	String customerName;
	long contactNumber;
	String address;
	public Customer(String customerName,long contactNumber,String address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public void displayCustomerDetails() {
		System.out.println("customerName: " + customerName);
		System.out.println("contactNumber: " +contactNumber);
		System.out.println("address: "+ address);
		
	}
}
public class ClassA {

	public static void main(String[] args) {
		Customer c1 = new Customer("jacob",7824734L,"Nagpur");
		System.out.println("Display Customer");
		c1.displayCustomerDetails(); 
		

	}

}
