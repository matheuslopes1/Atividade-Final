import java.util.Scanner;

public class FibIterativa {
	private static double fibo(double n) {
		double fib = 0;
		double fibAnterior = 0;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				fib = 1;
				fibAnterior = 0;
			} else {
				fib += fibAnterior;
				fibAnterior = fib - fibAnterior;
			}
		}
		return fib;
	}

	public static void main(String[] args) {
		int numeroInserido;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		numeroInserido = entrada.nextInt();
		ContarTempo.comecar();
		for (int i = 0; i < numeroInserido; i++) {
			System.out.println("Fibonacci de (" + i + ") é :" + FibIterativa.fibo(i));
		}
		ContarTempo.parar();
	}
}