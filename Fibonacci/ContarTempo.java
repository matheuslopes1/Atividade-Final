public class ContarTempo {
    private static long tempInicial;
    private static long tempFinal;
    public static void comecar(){
        tempInicial = System.nanoTime();
    }
    public static void parar(){
        tempFinal = System.nanoTime();
        long nanoSegundo=1000000000;        
        long dif = (tempFinal - tempInicial);       
        long milisegundos = dif%nanoSegundo; 
        long segundos = dif/nanoSegundo;
        System.out.println("Tempo de execução em Segundos: "+segundos); 
        System.out.println("Tempo de exucução em Milisegundos: "+milisegundos);
        
    }
}
