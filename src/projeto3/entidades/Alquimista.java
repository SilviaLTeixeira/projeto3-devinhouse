package projeto3.entidades;

public class Alquimista extends Inimigo {
	private static final int PONTO_ATAQUE = 30;
	private static final int PONTO_DEFESA = 5; 
	private static final Armas ARMA = new Cajado(8);
	
	public Alquimista() {
		super(PONTO_ATAQUE,PONTO_DEFESA,ARMA);
	}

	
}
