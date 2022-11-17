package Day4;

class Display {
	public int[] arr;
	
	public void displayNumbers(int[] arr) {
		for( int i = 0; i < arr.length ; i++)
           System.out.println(arr[i]);
	}
}
public class Arrayfor1 {

	public static void main(String[] args) {
//		int[][] arr = {{1,2,3},{2,4,5},{4,4,5}};
////		for( int i = 0; i < arr.length; i++) {
////			for( int j = 0; j < 3; j++) {
////				System.out.print(arr[i][j]);
////			}
////			System.out.println();
////		}
//		//System.out.println(arr.length);
//		System.out.println(arr[1][0]);
		
		int[] arr = new int[] {2,3,5,4,3};
		
		Display d = new Display();
		d.displayNumbers(arr);
		
	}
}
