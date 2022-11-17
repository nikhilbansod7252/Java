package day3;

//parameterless constructor
class Customer1 {
public int age;
public String name;
  Customer1(){
    age = 24;
    System.out.println("constructor called");      
  }
}
public class Constructor1 {
public static void main(String[] args) {
  Customer1 c1 = new Customer1();
  System.out.println(c1.age);
  System.out.println(c1.name);
  Customer1 c2 = new Customer1();
}   
}

