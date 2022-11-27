package br.certification.operators.oo.inheritancelesson;

public class ObjectInitializationOrder {
	
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println("=====================");
		p = new Child();
	}

}


//Os primeiros que são executados são os blocos estaticos do pai e depois das filhas, executar sempre
//para saber a ordem de inicialização

class Parent {
	static {
		System.out.println("Static init block parent");
	}
	
	{
		System.out.println("Init block parent");
	}
	
	public Parent() {
		System.out.println("Parent constructor");
	}
	
}

class Child extends Parent {
	static {
		System.out.println("Static init block child");
	}
	
	{
		System.out.println("Init block child");
	}
	
	public Child() {
		System.out.println("child constructor");
	}
}
