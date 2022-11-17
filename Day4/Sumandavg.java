package Day4;

public class Sumandavg {

	public static void main(String[] args) {
		int[] ages = {22,34,55};
		int sum = 0;
		double avg = 0;
		for(int a : ages) {
			sum += a;
		}
		System.out.println(sum);
		int length = ages.length;
		 avg = sum / length;
		System.out.println(avg);

	}

}
