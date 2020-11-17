
public class EntregaM1Fase3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		final int ANY=1950;
		final String TRASPAS= "Any de traspas";
		final String NOTRASPAS= "Any de no traspas";
		boolean anyTraspas;
		int any=1948;
		for (int i=any; i < ANY; i++ ) {
		anyTraspas = (i%4==0);
		if (anyTraspas) {
			System.out.println(TRASPAS);			
		}
		else {
			System.out.println(NOTRASPAS);
		}
	}
	}

}
