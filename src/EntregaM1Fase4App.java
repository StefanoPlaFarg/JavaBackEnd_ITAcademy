
public class EntregaM1Fase4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MEUANY=1950;
		String nomCognom ="Stefano Pola";
		String data="21/10/1950";
		String traspas;		
		traspas = (MEUANY/4==0)?(traspas="trasp�s"):(traspas="no trasp�s");
		System.out.println ("El meu nom �s " + nomCognom);
		System.out.println ("Vaig n�ixer el  " + data);
		System.out.println ("El meu any de naixement �s de " + traspas);
	}

}
