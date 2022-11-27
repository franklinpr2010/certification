package br.certification.operators.oo.interfacelesson;

/**
 * Quando quiser que tenha metodos padrões
 * @author frank
 *
 */
interface IAceleracao{
	   default void acelerar(){
	      System.out.println("Aceleração Constante");
	   }

	   default void desacelerar(){
	      System.out.println("Desaceleração Constante");
	   }
}


/**
 * Implementa o aceleração com os dois metodos default que vão ser executados caso não tenha sido declarada na classe filha da abstrata
 * @author frank
 *
 */
abstract class DefaultInterfaces implements IAceleracao {
	//Motor motor = new Motor();
	//IAceleracao acelerador = new AceleracaoMotorComum();
}

class Maverick extends DefaultInterfaces {
	   public Maverick(){
	   }

	   @Override
	   public void acelerar() {
	         System.out.println("Aceleração Super Rápida");
	   }

	   @Override
	   public void desacelerar() {
	         System.out.println("Desaceleração Lenta");
	   }
	}

	class Gol extends DefaultInterfaces {
		
	}

	class Fiesta extends DefaultInterfaces {
		
	}