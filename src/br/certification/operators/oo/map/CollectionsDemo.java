package br.certification.operators.oo.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import br.certification.operators.oo.entity.Product;


public class CollectionsDemo {
	
	public static void main(String[] args) {
		Set<Integer> set = 
				Collections.newSetFromMap(
						new ConcurrentHashMap<Integer, Boolean>());
	}
	
	public static List<Product> getProductsByCartId(int cartId) {
		List<Product> products = getProductsFromDbByCartId(cartId);
		
		// potentially can cause NullPointerException in the program in case it will be null
//		return products; 
		
		// creates a lot of empty objects in case this method is called too often
//		return products == null ? new ArrayList<>() : products;
		
		return products == null ? Collections.emptyList() : products;
	}

	private static List<Product> getProductsFromDbByCartId(int cartId) {
		return null;
	}

}
