//package day3;
//
////we cant create customer class inside Classobj1 class
//class Customer { 
////this class is not with any access specifier so that means their is default access specifier ie default
////below are instance variables
//public String customerId;
//public String customerName;
//public int customerAge;
//
////public void displayCustomerDet(){
////System.out.println("customerId "+ customerId); //within class we are accessing instance var so no need to use ant . operator
////}
//public int product(int a,int b){
////a,b are formal parameters//local variables
//return a*b; //method returning value thats why return type is int in method decleration
//}
//
//}
//
//public class Classobj1 {
//  public static void main(String[] args){
//      Customer c1 = new Customer(); //obj creation of customer class
//
//      // System.out.println(c1.customerId); //default value of instance var ie; Obj/String is null
//      // System.out.println(c1.customerName); //same
//      // System.out.println(c1.customerAge); //0
//
//      // c1.customerId = "nikhil27";
//      // System.out.println(c1.customerId); //nikhil27
//      // c1.customerAge = 22;
//      // System.out.println(c1.customerAge); //22
//      //c1.displayCustomerDet();
//      c1.product(10,20); //actual parameters//method call//parameterised method//call by value//value is return in this but not print so we use sop as shown in below
//      System.out.println(c1.product(10,20));
//
//      // Customer c2 = new Customer(); //2nd obj created
//      // c2.customerName = "Banti";
//      // System.out.println(c2.customerName);
//
//
//  }
//}
