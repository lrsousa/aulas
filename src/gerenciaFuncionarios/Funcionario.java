package gerenciaFuncionarios;

public class Funcionario {
		String nome;
		String departamento;
		String data;
		String rg;
		double salario;
		boolean estaNaEmpresa;
		
		//bonificação salarial
		void bonifica(double valorAumento){
			this.salario = this.salario + valorAumento;
		}
		
		//demissão 
		void demite(){
			this.estaNaEmpresa = false;
		}
		
		//imprime todos os atributos
		void mostra(){
			System.out.println("Nome: "+ this.nome);
			System.out.println("RG: " + this.rg);
			System.out.println("Salario: " + this.salario);
			System.out.println("Departamento: " + this.departamento);
			System.out.println("Data: " + this.data);
			System.out.println("Status na empresa: " + this.estaNaEmpresa);
		}
}
