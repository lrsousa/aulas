package aulas;

public class ExercicioX {
	public static void main(String [] args) {
		/*
		//mostrar numero de 150 a 300
		for(int i = 150; i <=300; i++){
			System.out.println(i);
		}
		//soma de numeros de 0 a 1000
		int i = 1;
		int soma = 0;
		while(i < 1000){
			soma = soma + i;
			i++;
		}
		System.out.println(soma);
		//soma dos multiplos de 3
		int j = 1;
		int somaMultTres = 0;
		while(j < 100){
			if(j%3 == 0){
				somaMultTres = somaMultTres + j;
			}
			j++;
		}
		System.out.println(somaMultTres);
		//fatorial de 1 a 100
		long x,k;
		for(k = 1; k <= 10; k++){
			long fator = 1;
		for(x = k; x >= 1; x--){
			fator = fator * x;
		}
		System.out.println(fator);
		}
		//serie fibonacci ate 100
		long w;
		long a = 0, b = 1;
		long fibonacci = 0;
		for(w = 0; w <= 100; w++){
			if(w == 1){
					fibonacci = a;
			}else if(w == 2){
					fibonacci = b;		
			}else {
				fibonacci = a + b;
				a = b;
				b = fibonacci;
			}
			System.out.println(fibonacci);
		}
		//Exercicio 7 
		int val = 13;
		while(val != 1){
			if(val%2 == 0){
				val = val /2;
				if (val == 1){
				System.out.println(val);
				} else {
				System.out.print(val + "->");
			    }
			}else{
				val = 3 * val + 1;
				System.out.print(val  + "->");
			}
		}		*/
		//exercicio 8 
		int z;
		int l;
		for(z = 1; z <= 10; z++){
			for(l = 1; l <= z ;l++){
				System.out.print(z*l + " ");
			}
			System.out.println(" ");
		}
	}	// main	
} // class
