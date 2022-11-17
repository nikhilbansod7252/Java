package day3;

//Multiple construnctor
class Customer3 {
  public String customerID;
  public String customerName;
  public long customerNumber;
  Customer3(String cID, String cName, long contact) {
     System.out.println("paramerized constructor");
     customerID = cID;
     customerName = cName;
     customerNumber = contact;
  }
  Customer3() {
      System.out.println("parameterless constructor");
  }

}
public class Constructormultiple {
  public static void main(String[] args) {
      Customer3 c1 = new Customer3("C012","Nikhil",8984292348L);
      System.out.println(c1.customerID);
      Customer3 c2 = new Customer3();
  }
}
