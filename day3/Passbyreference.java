package day3;

class Customer { 
	public long contactNumber;
	
	public void updateContact(Customer c) { //arguments are (clasName  anyName)
	     c.contactNumber = 9786758497L; //n one do like this no one pass obj like this in above line
	} //this method best insted of passing object
}
public class Passbyreference {
	public static void main(String[] args) {
		Customer customerOne = new Customer(); 
		
		customerOne.contactNumber = 7656434567L;
		
		System.out.println(customerOne.contactNumber); //7656434567
		
		customerOne.updateContact(customerOne); //fun call
		
		System.out.println("After calling updateContact method"); 
		System.out.println(customerOne.contactNumber); 
	}
}
