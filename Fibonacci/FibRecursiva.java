import java.util.Scanner;

public class FibRecursiva {
	private static long fibo(int n) {
		if (n<2) {
			return n;
		} else {
			return fibo(n-1) + fibo(n-2);
		}
	}
	public static void main(String[] args) {
		int numeroInserido;
    	Scanner entrada = new Scanner(System.in);
    	System.out.println("Digite um numero:");
    	numeroInserido = entrada.nextInt();
    	ContarTempo.comecar();
        for (int i = 0; i < numeroInserido; i++) {
			System.out.println("Fibonacci de ("+i+") é :"+FibRecursiva.fibo(i));
		}
		ContarTempo.parar();
	}	
}