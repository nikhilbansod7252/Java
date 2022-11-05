package String.Stringmethods;

public class Methods {

	public static void main(String[] args) {
//>>    length() returns number of characters in string
//		String name = "John";
//		System.out.println(name.length());

//>>    concat()
//		String name1 = "John";
//		String name2 = "Joe";
//		System.out.println(name1.concat(name2));
//		String name3 = name1.concat(name2);
//		System.out.println(name3);
		
//		immutable
//		String s = "Hello";
//		s.concat("world");
//		System.out.println(s); //as string objects are immutable means they cannot change
//		//so for this solution is explict assignment by creating new string obj
//		String s1 = s.concat("World");
//		System.out.println(s1);
		
//		String fname = "Jack";
//		String lname = "Black";
//		System.out.println(fname + lname); //+ operator can also be used for string concatenation
		//when we use + op with Strings it acts as concationation
		
//		String a = "10"; //what ever inside the double quotes considered as String
//		int b = 20;
//		System.out.println(a + b);
		
//>>    equals() check containt of string
//		String s1 = "Hello";
//		String s2 = "Hello";
//		System.out.println(s1.equals(s2));		
//		String s3 = new String("Hello");
//		System.out.println(s1 == s2);
		// == op checks obj reference
//		String s1 = new String("Hello");
//		String s2 = new String("Hello");
//	    System.out.println(s1.equals(s2));
//	    System.out.println(s1 == s2);
		
//>>    equalsIgnorecase() no matters hows the case
//		String s4 = "HELLO";
//		System.out.println(s4.equalsIgnoreCase(s1));
		
		
//>>	toLowerCase(), toUpperCase()
//      System.out.println(s4.toLowerCase());
//      System.out.println(s1.toUpperCase());
        
//>>    substring(beginIndex,startIndex) index starts from 1, returns substing from beginIndex to endIndex if end index is not mentioned then returns from begin index to end of string
//		String str = new String("Welcome to geekforgeek");
//		System.out.println(str.substring(0));
//		System.out.println(str.substring(10));
//		System.out.println(str.substring(8,10));
		
//>>    charAt() index starts from 0 to length - 1, returns a char value at given index
//		String str = "Never regret";
//		System.out.println(str.charAt(6));

//>>    contains() checks char sequence is present in the string or not 
//		String str = "Hello John good morning";
//		System.out.println(str.contains("good morning"));
        
//>>    replace(char old, char new) replaces new char with old 
//		String s1="javatpoint is a very good website";
//		System.out.println(s1.replace('a','e'));
//		System.out.println(s1.replace("is","still"));
	
	}

}
