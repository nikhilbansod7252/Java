package day2;

public class If {
  public static void main(String[] args) {
	  String customerType = "Regular";
		int quantity = 2;
		int unitPrice = 10;
		double totalCost = 0;
		int deliveryCharges = 100;
		totalCost = unitPrice * quantity;
		if(customerType == "Regular") {
			totalCost -=(totalCost * 0.05); // a = a + 1// a+=1
			System.out.print("you got 5% of discount ");
			if(totalCost >= 20) {
				System.out.println("you have got gif voucher!!!!");
			}
		}
		else if(customerType == "GUest") {
			totalCost+=deliveryCharges;
			System.out.println(totalCost);
		}
		else
			System.out.println("Invalid Statement");
  }
}
