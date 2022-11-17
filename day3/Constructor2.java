package day3;

class Customer2 {
    //instance var
    public String customerID; //default value of instance var String is null
    public long contactNumber;
    public int age; //default value of instance var int is 0
  Customer2(String cID, long contact){
     customerID = cID;
     contactNumber = contact;
  }
}
public class Constructor2 {
    public static void main(String[] args) {
      Customer2 c1 = new Customer2("C012",4392409234L); 
      System.out.println(c1.customerID); //C012
      System.out.println(c1.contactNumber); //4392409234
      System.out.println(c1.age); //0
    }
}
