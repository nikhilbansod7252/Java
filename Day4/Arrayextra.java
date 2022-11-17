package Day4;


class Arrayextra {
	public static void displayNumbers(int[] arr) {
	       for( int a : arr) {
	    	   System.out.println(a);
	       }
		}
}
class Tester {
	//for static method no need to call method with help of class instance ie: object
//	public static void displayNumbers(int[] arr) {
//       for( int a : arr) {
//    	   System.out.println(a);
//       }
//	}
	
	public static void main(String[] args) {
		
		int a[] = {2,5,8,5};
		//Tester t = new Tester();
		//d.displayNumbers(a);

		Arrayextra d = new Arrayextra();
		d.displayNumbers(a);
		
	}
}