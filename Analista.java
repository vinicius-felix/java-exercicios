package POO3;

class Analista extends Funcionario{
	
	private final double comissao = 10;
	private final double bonus = 3;
	
	Analista(String nome, int idade, double valorHora, int qtdHoras){
		super(nome, idade, valorHora, qtdHoras);
	}
	
	double getComissao() {
		return this.comissao;
	}
	double getBonus() {
		return this.bonus;
	}
	
	@Override
	double calcularSalario(double valorHora, int qtdHoras) {
		return valorHora * qtdHoras * bonus;
	}
	
	@Override
	double calcularComissao(double salario) {
		return salario * (getComissao() / 100) + salario;
	}
	
}
