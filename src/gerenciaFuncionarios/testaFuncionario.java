package gerenciaFuncionarios;

public class testaFuncionario {
	public static void main(String[] args){
		Funcionario f1 = new Funcionario();
		f1.nome = "olavio";
		f1.salario = 1000.0;
		f1.bonifica(300);
		f1.data = "12-04-2016";
		f1.rg = "310372107392";
		f1.departamento = "Informatica";
		f1.estaNaEmpresa = true;
		//System.out.println("Salario atual: " + f1.salario);
		
		f1.mostra();
		f1.demite();
		f1.mostra();
		
		//comparara funcionarios estanciando dois new e referenciando uma variavel  pra cada
		Funcionario func1 = new Funcionario();
		func1.nome = "COP";
		func1.salario = 100;
		
		Funcionario func2 = new Funcionario();
		func2.nome = "COP";
		func2.salario = 100;
		
		if(func1 == func2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		} //são diferentes pq são dois objetos diferentes referenciados
		
		//comparara funcionarios criando um new e referenciando duas variaveis para o mesmo
		Funcionario f2 = new Funcionario();
		f2.nome = "cop";
		f2.salario = 100;
		
		Funcionario f3 = f2;
		if(f2 == f3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		} //nesse caso, são iguais, pois referenciam para o MESMO objeto
	}  
	
	
}
