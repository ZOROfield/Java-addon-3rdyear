package addonDay3;

public class Shoppingcart {
	void add_to_cart(String category,int price){
		System.out.println("your Category:"+category);
		System.out.println("Item price:"+price);
	}
	void add_to_cart(String name,int price,int quantity) {
		int total=price*quantity;
		System.out.println("Total Amount:"+total);
	}

	public static void main(String[] args) {
		Shoppingcart in=new Shoppingcart();
		in. add_to_cart("shirt",250);
		in. add_to_cart("shirt",350);
	}

}
