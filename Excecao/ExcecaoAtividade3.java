import java.util.Scanner;

public class ExcecaoAtividade3 {	
	public static void main(String args[]) {
		int NumeroInteiro[];
		int zero = 0;
		System.out.print("digite o tamanho do vetor:");		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);				
		try {
			int tamanho = entrada.nextInt();
			if(tamanho < zero) {
				throw new NegativeArraySizeException();
			}
			NumeroInteiro = new int[tamanho];
			int i = 0;
			while (i < tamanho) {
				System.out.print("Digite um Numero: ");
				int Posicao = entrada.nextInt();
				System.out.print("Digite a posição que deseja inserir o numero: ");				
				if (Posicao > tamanho) {
					throw new ArrayIndexOutOfBoundsException();
				}
				NumeroInteiro[Posicao] = entrada.nextInt();
				i++;
			}
		} catch (NegativeArraySizeException e) {
			System.out.println("O tamanho do vetor não pode ser negativo...");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inexistente...");
		} catch (Exception e) {
			System.out.println("Error...");
		}
	}
}
