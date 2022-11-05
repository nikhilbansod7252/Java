package String.Stringexercise1;

public class Tester {
	
	public static String removeWhiteSpace(String str) { 
	    String s = str.replaceAll("\\s","");	
		return s;
	}
    public static void main(String[] args) {
    	String str = "Hello  How are you  ";
    	str = removeWhiteSpace(str);
    	System.out.println(str);
    }
}
 






