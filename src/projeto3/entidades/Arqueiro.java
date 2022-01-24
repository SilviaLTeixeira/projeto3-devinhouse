package projeto3.entidades;

public class Arqueiro extends Combate {
	private static final int PONTO_ATAQUE = 20;
	private static final int PONTO_DEFESA = 10;
	private static final Armas[] ARMAS = {new Besta(9), new Arco(8)};
	
	public Arqueiro() {
		super(PONTO_ATAQUE,PONTO_DEFESA,ARMAS);
	}

	public Armas[] getARMAS() {
		return ARMAS;
	}
	
}
