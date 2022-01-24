package projeto3.entidades;

public class Lider extends Inimigo {
	private static final int PONTO_ATAQUE = 40;
	private static final int PONTO_DEFESA = 25;
	private static final Armas ARMA = new Machado(10);
	public Lider(){
		super(PONTO_ATAQUE,PONTO_DEFESA,ARMA);
	}
	
}
