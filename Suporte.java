package POO3;

class Suporte extends Funcionario{
	
	private final double comissao = 0;
	private final double bonus = 2;
	
	Suporte(String nome, int idade, double valorHora, int qtdHoras){
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
