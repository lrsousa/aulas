package desafioCap4;

public class Fibonacci {
	int resultado;
	public int calculaFibonacci(int n){
	        if(n==0){
	            return resultado = 0;
	        }
	        if(n==1){
	            return  resultado = 1;
	        }
	        return ( calculaFibonacci(n-1) + calculaFibonacci(n-2));
	 } 	 
	
	
public static int[] calculaFibonacciIterativo(int[] fib,int n) {
		fib = new int[n];
		int a = 1;
		int b = 1;
		fib[0] = 0;
		fib[1] = 1;
		int aux;
		
		if(n==0){
			return fib;
		}
		if(n == 1 || n == 2){
			return fib;
		}
		for (int i = 2; i < n; i++) {
			aux = a + b;
			b = a;
			a = aux;
			fib[i] = a;
		}
		return fib;
	}	
		public static void main(String[] args){
			int[] array = null;
			int[] resp = calculaFibonacciIterativo(array, 6);
			for(int i : resp){
			System.out.println(i);	
			}
		}
}
