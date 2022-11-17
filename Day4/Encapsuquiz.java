package Day4;


class Test {
	private String mobileName;
	private int price;
	private int stock;

	public void purchaseMobile() {
		stock = stock - 1;//-1
	}

	public String getMobileName() {
		return mobileName;//1
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;//1
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}

public class Encapsuquiz {
	public static void main(String[] args) {
		Test mobile = new Test();
		mobile.setMobileName("Moto");//1
		mobile.setPrice(200);
		mobile.purchaseMobile();
		System.out.println(mobile.getStock());
	}
}