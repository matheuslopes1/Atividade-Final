public class ContarTempo {
    private static long tempInicial;
    private static long tempFinal;
    public static void comecar(){
        tempInicial = System.nanoTime();
    }
    public static void parar(){
        tempFinal = System.nanoTime();
        long nanoSegundo=1000000000;
        long segundo = 60;
        long dif = (tempFinal - tempInicial);       
        long milisegundos = dif%nanoSegundo; 
        long segundos = dif/nanoSegundo; 
        long minutos = segundos/segundo;
        System.out.println("Tempo de execu��o em Minutos: "+minutos);
        System.out.println("Tempo de execu��o em Segundos: "+segundos); 
        System.out.println("Tempo de exucu��o em Milisegundos: "+milisegundos);
        
    }
}