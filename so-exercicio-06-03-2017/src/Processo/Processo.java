package Processo;

public class Processo {
	public static void main(String[] args) {
		System.out.println("Aguardando para iniciar a execu��o cronometrada...");
		try {
			Thread.sleep(10000);
		}
		catch(Exception e){}
		
		long start = System.currentTimeMillis();
		System.out.println("Executando");
		
		for(int j = 0; j<2000; j++ ) {
			for (int i=0;i<65535; i++) {
				double b = Math.log(Math.sqrt(Math.PI));
			}
		}
		
		System.out.println("Fim da execu��o.\nTempo em milisegundos:" +
				(System.currentTimeMillis() - start));
	}
	
}