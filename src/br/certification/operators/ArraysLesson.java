package br.certification.operators;

import java.util.Arrays;
import java.util.List;

public class ArraysLesson {
	public static void main(String[] args) {
		Integer a[] = {3,2,1};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.asList(a));
		
		List<Integer> convert= Arrays.asList(a);
		System.out.println("resultado: ");
		for(Integer c: convert) {
			System.out.println(c);
		}
		
		 String c[] = new String[]{"abc","def","fhi","jkl"};

		 List<String> list1 = Arrays.asList(c);
		 
		 for(String g: list1) {
				
	     }
		
		System.out.println( 10%2 );
		
	}
}
