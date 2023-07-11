package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	 int id;
	 String name;
	 float price;
	 
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Demo5 {

	public static void main(String[] args) {
		ArrayList<Product> prod = new ArrayList<Product>();
		prod.add(new Product(100,"vivo",50000));
		prod.add(new Product(100,"oppo",30000));
		prod.add(new Product(100,"MI",40000));
		prod.add(new Product(100,"iphone",90000));
		
		for (Product product:prod) {
			if(product.price<40000) {
				System.out.println(product.id+" :"+product.name+":"+product.price);
			}
		}
		System.out.println("=================");
		List myproducts = prod.stream()
				.filter(p-> p.price<50000)
				.map(p->p.price)
				.limit(3)
				.collect(Collectors.toList());

		System.out.println(myproducts);

	}

}
