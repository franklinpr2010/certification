package br.certification.operators;

import java.util.Arrays;

public class ExpressionTypeReferenceExample {

	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;

		float f = 1.0F;
		double d = 1.0;

		char c = 1;

		int intExpressionType = b + b;
		int intExpressionType2 = s + s;
		int intExpressionType3 = b + i + c;
		
		//Não pode converter long para int diretamente
		int a = (int)l;
		
		long t = i;

		long longExpressionType = i + l;

		float floatExpressionType = l + f;

		double doubleExpressionType = f + d;

		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.3333333333333335

		System.out.println("Hello " + 1); // Hello 1
		System.out.println("Hello " + null); // Hello null
		
		//References
		Integer a1 = 1;
		Integer b1 = 1;
		boolean c1 = a1 == b1;
		//true
		System.out.println(c1);
		
		Integer a2 = new Integer(1);
		Integer b2 = new Integer(1);
		//false
		boolean c2 = a2 == b2;
		System.out.println(c2);
		//false
		boolean c3 = a2.equals(b2);
		System.out.println(c3);
		
		//quando é um array ou object o metodo equals é diferente, ele usa ==
		int d3[] = {1,2,3};
		int d4[] = {1,2,3};		
		boolean d5 = d3.equals(d4);
		System.out.println(d5);
		
		//Aqui compara referencia
		System.out.println(Arrays.equals(d3, d4));

	}

}