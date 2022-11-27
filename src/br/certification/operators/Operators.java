package br.certification.operators;

public class Operators {
    public static void main(String[] args) {
    	//Links
    	//http://www.mecaweb.com.br/eletronica/content/e_hexadecimal_decimal
    	//Calculadora passo a passo
    	//https://www.prepostseo.com/tool/br/hex-to-decimal
    	//Toda a calculadora
    	//https://www.prepostseo.com/tool/	
    	//Operadores bit a bit
        System.out.println( 0x55 & 0x0f );
        System.out.println( 0x02 | 0x01 );
        System.out.println( 0x03 ^ 0x01 );
		System.out.println(true & true);
		System.out.println(0x55);
		
		//Representação de binary java
		System.out.println("binary = " +  0b1010100);
		
		System.out.println("5 in bynary = " +  Integer.toBinaryString(5));
		
		
		System.out.println("4 & 5 = " + (4 & 5) );
		
		//Operadores >>, <<, >>>
		//00001001 << 1 = 00010010
		//00001001 << 2 = 00100100
		//00001001 << 3 = 01001000
		//00001001 << 4 = 10010000
		//00001001 << 5 = 00100000
		//00001001 << 6 = 01000000
		//00001001 << 7 = 10000000
		//00001001 << 8 = 00000000

		//00001001 >> 1 = 00000100
		//00001001 >> 2 = 00000010
		//00001001 >> 3 = 00000001
		//00001001 >> 4 = 00000000

		//00001001 >>> 1 = 00000100
		//00001001 >>> 2 = 00000010
		//00001001 >>> 3 = 00000001
		//00001001 >>> 4 = 00000000
	}
}
