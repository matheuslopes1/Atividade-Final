
public class ExcecaoAtividade {
	public static void main(String[] args) {
		methodA();
	}
	private static void methodA() {
		System.out.println("Inicia A");
		try {
			methodB();
		} catch (Exception e) {
			System.out.println("Finaliza A");
		}
	}
	private static void methodB() throws NullPointerException {
		System.out.println("Inicia B");
		methodC();
		System.out.println("Finaliza B");
	}
	private static void methodC() throws NullPointerException {
		System.out.println("Inicia C");
		methodD();
		System.out.println("Finaliza C");
	}
	private static void methodD() {
		System.out.println("Inicia D");
		throw new NullPointerException();
	}
}
