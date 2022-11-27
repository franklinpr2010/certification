package br.certification.strings;

public class StringsExercise {
	public static void main(String[] args) {
		String a = "  hello aa  ";
		//Remove espaço da direita e esquerda
		System.out.println(a.strip());
		//Remove espaço da direita e esquerda
		System.out.println(a.trim());
		
		//Ele retorna uma string, com todos os espaços em branco à esquerda removidos.
		System.out.println(a.stripLeading());
	}
}
