package br.certification.operators.loop;

public class WhileLoopDemo {

	public static void main(String[] args) {
		whileCommon();
		doWhile();
	}
	
	public static void whileCommon() {
		System.out.println("=========== while loop");
		int counter = 0;
		while (counter < 5) {
			System.out.println("counter: " + counter++);
		}

		// Infinite loop
//		while (true) {
//			
//		}
	}
	
	
	public static void doWhile() {
		System.out.println("=========== do-while loop");
		int counter = 0;
		do {
			System.out.println("counter: " + counter++);
		} while (counter < 5);
		
		do {
			System.out.println("counter is five already: " + counter);
		} while (counter < 5);
	}
	
	public static void forNew() {
		System.out.println("=========== foreach loop");
		int[] arr = {1, 2, 3};
		int sum = 0;
		for (int number : arr) {
			sum += number;
			System.out.println("Number: " + number);
		}
		System.out.println("Sum: " + sum);

		for (int i : arr) {
			
		}
	}
	
	public static void forCommon() {
        System.out.println("=========== for loop");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("counter: " + i);
			
		}
		int g = 0;
		for (; g < 5;) {
			System.out.println("counter: " + g);
			 g++;
			
		}

		// Infinite loop
		//		for (;;) {
		//
		//		}
		
		
		System.out.println("=========== for loop | comma usage example");
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("counters: i = " + i + ", j = " + j);
		}
	}
	
	
}
