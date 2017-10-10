import java.util.ArrayList;
import java.util.List;

public class Rotor {
	private int posicaoDaLetra;
	private int contadorRotor1;
	private int contadorRotor2;
	private int contadorRotor3;	
	private String alfabeto;
	private static final int tamanho = 26;
	private String rotor1;
	private String rotor2;
	private String rotor3;	
	public Rotor(){		
		posicaoDaLetra = 0;
		contadorRotor1 = 0;
		contadorRotor2 = 0;
		contadorRotor3 = 0;		
		alfabeto=("abcdefghijklmnopqrstuvwxyz");
		rotor1 = ("pqrstuvwxyzabcdefghijklmno");
		rotor2 = ("uvwxyzabcdefghijklmnopqrst");
		rotor3 = ("jklmnopqrstuvwxyzabcdefghi");
	}	
	public void percorreAlfabeto(char letraDigitada){
		posicaoDaLetra = alfabeto.indexOf(letraDigitada);
		percorreRotor1(posicaoDaLetra);
	}	
	public void percorreRotor1(int posicao){
		contaVoltaRotor1();
		char letraNoRotor1 = rotor1.charAt(posicao);
		mudaPosicaoRotor1();
		percorreRotor2(letraNoRotor1);
	}		
	public void percorreRotor2 (char letra){
		int posicao = 0;
		char letraNoRotor2 = letra;
		while (letraNoRotor2 != rotor2.charAt(posicao)){
			posicao++;
		}
		posicaoDaLetra = posicao;
	}	
	public char percorreRotor3 (){
		char letra = rotor3.charAt(posicaoDaLetra);
		return letra;
	}	
	public void contaVoltaRotor1(){
		if(contadorRotor1 == tamanho){
			contadorRotor1 = 0;
			contadorRotor2++;
			mudaPosicaoRotor2();
		}
		else contadorRotor1 ++;	
	}	
	public void contaVoltaRotor2(){
		if(contadorRotor2 == tamanho){
			contadorRotor2 = 0;
			contadorRotor3++;
			mudaPosicaoRotor3();
		}
		else contadorRotor2 ++;
	}	
	public void contaVoltaRotor3(){
		if(contadorRotor3==tamanho){
			contadorRotor3 = 0;
		}
	}	
	public void mudaPosicaoRotor1(){
		List<Character> r1 = new ArrayList<Character>();		
		for(int i=0; i<rotor1.length(); i++){
			r1.add(rotor1.charAt(i));
		}		
		r1.add(0, rotor1.charAt(rotor1.length() - 1));
		r1.remove(r1.size()-1);		
		rotor1 ="";		
		for(int i=0; i<r1.size();i++){
			rotor1 += r1.get(i);
		}
	}	
	public void mudaPosicaoRotor2(){
		List<Character> r2 = new ArrayList<Character>();		
		for(int i=0; i<rotor2.length(); i++){
			r2.add(rotor2.charAt(i));
		}		
		r2.add(0, rotor2.charAt(rotor2.length() - 1));
		r2.remove(r2.size()-1);		
		rotor1 ="";		
		for(int i=0; i<r2.size();i++){
			rotor1 += r2.get(i);
		}
	}	
	public void mudaPosicaoRotor3(){
		List<Character> r3 = new ArrayList<Character>();		
		for(int i=0; i<rotor3.length(); i++){
			r3.add(rotor3.charAt(i));
		}		
		r3.add(0, rotor3.charAt(rotor3.length() - 1));
		r3.remove(r3.size()-1);		
		rotor3 ="";		
		for(int i=0; i<r3.size();i++){
			rotor3 += r3.get(i);
		}
	}
}
