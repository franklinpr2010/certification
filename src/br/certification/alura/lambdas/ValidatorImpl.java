package br.certification.alura.lambdas;

public class ValidatorImpl  {

	public static void main(String[] args) {
		
	}
	
	Validador<String> validadorCEP = valor -> {
		return valor.matches("[0-9]{5}-[0-9]{3}");
	};

}
