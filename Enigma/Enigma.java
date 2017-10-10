import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Enigma{
	private List<Character> letras;
	private String fraseInserida;
	private String fraseCriptografada;
	private Rotor rotor;
	public Enigma(){
		letras = new ArrayList<Character>();
		rotor = new Rotor();			
	}
	public void criptografar(){
		recebeFrase();	
		limpaFraseCompilada();
		criptografaLetras();
		mostraFraseCompilada();
	}
	private void recebeFrase(){
		System.out.println("Digite um frase: ");
		Scanner recebeFrase = new Scanner(System.in);
		fraseInserida = recebeFrase.nextLine().replaceAll(" ", " ");
	}
	private void limpaFraseCompilada(){
		fraseCriptografada="";
	}
	private void criptografaLetras(){
		for(int contador=0; 
				contador<fraseInserida.length(); 
				contador++){
			char caractereDaFrase = fraseInserida.charAt(contador);	
			rotor.percorreAlfabeto(caractereDaFrase);
			char caractereCriptografado = rotor.percorreRotor3();
			letras.add(caractereCriptografado);
			fraseCriptografada += letras.get(contador);
		}	
	}
	public void mostraFraseCompilada(){		
		System.out.println("A frase criptografada: "+fraseCriptografada);
	}
}
