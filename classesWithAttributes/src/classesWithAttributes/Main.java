package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name="Laptop";
		product.setid(1);
		product.description="Asus Laptop";
		product.stockAmount = 3;
		product.price = 5000;
		product.renk = "Beyaz";
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	}

}
