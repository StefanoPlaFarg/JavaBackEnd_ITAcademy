
public class EntregaM1Fase4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MEUANY=1950;
		String nomCognom ="Stefano Pola";
		String data="21/10/1950";
		String traspas;		
		traspas = (MEUANY/4==0)?(traspas="traspàs"):(traspas="no traspàs");
		System.out.println ("El meu nom és " + nomCognom);
		System.out.println ("Vaig néixer el  " + data);
		System.out.println ("El meu any de naixement és de " + traspas);
	}

}
