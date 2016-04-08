package gerenciaFuncionariosNova;

public class Teste {
	public static void main(String[] args){
		//criando e aplicando metodos sobre funcionario
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		data.ano = 2010;
		data.dia = 4;
		data.mes = 8;
		f1.dataDeEntrada = data;
		f1.nome = "Julia";
		//f1.data = "22-03-2016";
		f1.salario = 150000.0;
		f1.rg = "8394832743290";
		f1.departamento = "DTI";
		//System.out.println("Nome do funcionário: " + f1.nome + "\nSalário: " + f1.salario);
		f1.recebeAumento(1000);
		//System.out.println("Salario após aumento: " + f1.salario);
		//System.out.println("Salario anual: " + f1.calculaGanhoAnual()); //multiplica salario atual, ganhou 1000 de aumento
		f1.mostra();
		f1.mostraData();
		
		/*
		//comparando dois funcionarios alocados
		Funcionario f2 = new Funcionario();    
		f1.nome = "Danilo";
		f1.salario = 100;

		Funcionario f3 = new Funcionario();    
		f2.nome = "Danilo";
		f2.salario = 100;

		if (f2 == f3) {
		  System.out.println("iguais");
		} else {
		  System.out.println("diferentes");    
		}
		//comparando duas REFERENCIAS para o MESMO funcionario
		Funcionario f4 = new Funcionario();
			f4.nome = "Hugo";
			f4.salario = 100;

		Funcionario f5 = f4;
		
		if (f4 == f5) {
			  System.out.println("iguais");
			} else {
			  System.out.println("diferentes");    
			}
		*/
	}
}
