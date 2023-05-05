package POO3;

public class Funcionario extends Principal{
	private String nome;
	private int idade; 
	private double valorHora; 
	private int qtdHoras;
	
	Principal p = new Principal();
	
	Funcionario(String nome, int idade, double valorHora, int qtdHoras){
		this.nome = nome;
		this.idade = idade;
		this.valorHora = valorHora;
		this.qtdHoras = qtdHoras;
	}
	
	// Setters
	void setNome(String nome) {
		this.nome = nome;
	}
	void setIdade(int idade) {
		this.idade = idade;
	}
	void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	
	// Getters
	String getNome() {
		return this.nome;
	}
	int getIdade() {
		return this.idade;
	}
	double getValorHora() {
		return this.valorHora;
	}
	int getQtdHoras() {
		return this.qtdHoras;
	}
	
	double getComissao() {
		return 0;
	}
	
	double calcularSalario(double valor, int qtd) {
		return 0.0;
	}
	
	double calcularComissao(double salario) {
		return 0.0;
	}
	
	
	
	
	
	
	
}
