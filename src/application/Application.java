package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Application {
	public static void main(String []args) {
		
		List <Product> list = new ArrayList<>();
		list.add(new Product("Computer",1750.65));
		list.add(new Product("Tv",2450.65));
		list.add(new Product("Tablet",900.00));
		list.add(new Product("Iphone",4500.0));
		
		
		list.forEach(System.out::println);
		
		Predicate<Product> pred = p -> p.getPrice() <= 2002.0;
		
		
		//list.removeIf(new ProductPredicate());
		//list.removeIf(p ->(p.getPrice() >= 2000.0));
		 
		System.out.println("----------------------------");
		
		list.forEach(System.out::println);
		
		
	}
}
