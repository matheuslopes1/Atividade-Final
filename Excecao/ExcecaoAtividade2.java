import java.util.Scanner;

public class ExcecaoAtividade2 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		String numero_string;
		while (true) {
			System.out.print("Digite um inteiro: ");
			numero_string = entrada.nextLine();
			try {
				int numero_inteiro = Integer.parseInt(numero_string);
				System.out.println("Voc� digitou " + numero_inteiro + ". ");
			} catch (Exception e) {
				System.out.println("Este n�o � um inteiro num�rico.");
			}
		}
	}
}
