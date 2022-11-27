package br.certification.alura.lambdas;


public class Usuario {
	private String nome;
	private Double preco;
	private boolean moderador;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public Usuario(String nome, Double preco, boolean moderador) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.setModerador(moderador);
	}
	
	public Usuario(String nome) {
		super();
		this.nome = nome;	}
	
	public void tornaModerador() {
		this.setModerador(true);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		
		return this.getNome() + " " + this.getPreco();
	}

	public boolean isModerador() {
		return moderador;
	}

	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
	
	
}
