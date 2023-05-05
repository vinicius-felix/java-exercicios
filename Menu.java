package POO3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	Scanner s = new Scanner(System.in);
	ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	int exibirMenu() {
		
		int op;
		
		System.out.println("--------------------------");
		System.out.println("1 - Cadastrar Funcionário");
		System.out.println("2 - Remover Funcionario");
		System.out.println("3 - Exibir Cadastrados");
		System.out.println("4 - Limpar Todos os Registros");
		System.out.println("0 - Encerrar");
		System.out.print("Opção: ");
		op = s.nextInt();
		
		switch (op) {
			case 1: 
				cadastrarFuncionario();
				break;
				
			case 2:
				removerFuncionario();
				break;	
				
			case 3:
				exibirFuncionarios();
				break;
				
			case 4:
				removerTodosFuncionarios();			
				break;
				
			case 0:
				System.out.println("Encerrado!");
				break;
			
			default:
				System.out.println("Opção inválida");
				break;
		}
		return op;
	}
	
	void cadastrarFuncionario() {
		int idade, qtdHora, cargo;
		String nome;
		double valorHora;
		Funcionario [] cargos = new Funcionario[4];
		
		System.out.println("--------------------------");
		System.out.print("Informe o nome: ");
		nome = s.next();
		
		System.out.print("Informe a idade: ");
		idade = s.nextInt();
		
		System.out.println("Informe o cargo: ");
		System.out.println("1 - Gerente");
		System.out.println("2 - Programador");
		System.out.println("3 - Analista");
		System.out.println("4 - Suporte");
		System.out.print("Opção: ");
		cargo = s.nextInt();
		
		System.out.print("Informe a qtd de horas: ");
		qtdHora = s.nextInt();
		
		System.out.print("Informe o valor da hora: ");
		valorHora = s.nextDouble();
		
		cargos[0] = new Gerente(nome, idade, valorHora, qtdHora); 
		cargos[1] = new Programador(nome, idade, valorHora, qtdHora);
		cargos[2] = new Analista(nome, idade, valorHora, qtdHora);
		cargos[3] = new Suporte(nome, idade, valorHora, qtdHora);	
		
		funcionarios.add(cargos[cargo-1]);
	}
	
	void removerFuncionario() {
		System.out.print("Informe o ID do funcionario: ");
		int id = s.nextInt();
		
		if(id < 0 || id > funcionarios.size()-1) {
			System.out.println("Id inválido!");
		} else {
			funcionarios.remove(id);
			System.out.printf("\n\nFuncionario %d removido!\n", id);
		}
	}
	
	void removerTodosFuncionarios() {
		int remover;
		System.out.println("Confirma remover todos os registro?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("Opção: ");
		remover = s.nextInt();
		
		if(remover == 1) {
			funcionarios.clear();
			System.out.println("\nTodos os registros foram removidos!");
		}
	}
	
	void exibirFuncionarios() {
		System.out.println("\n\n--------------------------");
		System.out.printf("%d cadastrados\n", funcionarios.size());
		
		for(int i = 0; i < funcionarios.size(); i++) {
			System.out.printf("\nId: %d", i);
			System.out.printf("\nFuncionário: %s", funcionarios.get(i).getNome());
			System.out.printf("\nCargo: %s", funcionarios.get(i).getClass().getSimpleName());
			System.out.printf("\nIdade: %d", funcionarios.get(i).getIdade());
			System.out.printf("\nQtd de horas: %d", funcionarios.get(i).getQtdHoras());
			System.out.printf("\nValor da hora: R$ %.2f", funcionarios.get(i).getValorHora());
			System.out.printf("\nSalario: R$ %.2f", funcionarios.get(i).calcularSalario(funcionarios.get(i).getValorHora(), funcionarios.get(i).getQtdHoras()));
			System.out.printf("\nComissão: %.2f%%",funcionarios.get(i).getComissao());
			System.out.printf("\nSalario total: R$ %.2f", funcionarios.get(i).calcularComissao(funcionarios.get(i).calcularSalario(funcionarios.get(i).getValorHora(), funcionarios.get(i).getQtdHoras())));
			System.out.printf("\n---------------------------\n");
		}
		System.out.println();
	}
	
	void executar() {
		int op;
		
		do {
			op = exibirMenu();
		} while(op != 0);
	}
}
