package br.certification.operators.oo.staticlesson;
import static java.util.Arrays.*;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		User user1 = new User();
		System.out.println("user1.getId() = " + user1.getId());
		System.out.println("user1.getCounter() = " + user1.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		User user2 = new User();
		System.out.println("user2.getId() = " + user2.getId());
		System.out.println("user2.getCounter() = " + user2.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		System.out.println("user1.getCounter() = " + user1.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		User user3 = new User();
		

		System.out.println("user1.getCounter() = " + user1.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		
	
		System.out.println("user2.getId() = " + user2.getId());
		System.out.println("user2.getCounter() = " + user2.getCounter());
		
		User user4 = new Employee();
		
		System.out.println("user2.getId() = " + user4.getId());
		System.out.println("user2.getCounter() = " + user4.getCounter());
		
		
		user3.doAnyStaticAction();
		
		User.doAnyStaticAction();
		Employee.doAnyStaticAction();
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		int[] arr = {1, 2, 3};
		Arrays.sort(arr);
		sort(arr);
	}

}
