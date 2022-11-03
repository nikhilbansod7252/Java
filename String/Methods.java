package String.Stringmethods;

public class Methods {

	public static void main(String[] args) {
//>>    length()
//		String name = "John";
//		System.out.println(name.length());

//>>    concat()
//		String name1 = "John";
//		String name2 = "Joe";
//		System.out.println(name1.concat(name2));
//		String name3 = name1.concat(name2);
//		System.out.println(name3);
		
//		String s = "Hello";
//		s.concat("world");
//		System.out.println(s); //as string objects are immutable means they cannot change
//		//so for this solution is explict assignment by creating new string obj
//		String s1 = s.concat("World");
//		System.out.println(s1);
		
//		String fname = "Jack";
//		String lname = "Black";
//		System.out.println(fname + " " + lname); //+ operator can also be used for string concatenation
		
		
//>>    equals()
//		String s1 = "Hello";
//		String s2 = "Hello";
//		System.out.println(s1.equals(s2));
	
//		String s3 = new String("Hello");
//		System.out.println(s1 == s3);
		
//>>    equalsIgnorecase()
//		String s4 = "HELLO";
//		System.out.println(s4.equalsIgnoreCase(s1));
		
		
//>>	toLowerCase(), toUpperCase()
//      System.out.println(s4.toLowerCase());
//      System.out.println(s1.toUpperCase());
        
//>>    substring() index starts from 1
//		String str = new String("Welcome to geekforgeek");
//		System.out.println(str.substring(0));
//		System.out.println(str.substring(10));
//		System.out.println(str.substring(8,10));
		
//>>    charAt() index starts from 0 to length - 1
//		String str = "Never regret";
//		System.out.println(str.charAt(6));

//>>    contains() 
//		String str = "Hello John good morning";
//		System.out.println(str.contains("good morning"));
        
//>>    replace()
		String s1="javatpoint is a very good website";
		System.out.println(s1.replace('a','e'));
		System.out.println(s1.replace("is","still"));

	}

}
