package projeto3.entidades;

public class Mago extends Combate {
	private static final int PONTO_ATAQUE = 30;
	private static final int PONTO_DEFESA = 5;
	private static final Armas[] ARMAS = {new Livro(7), new Cajado(8)};
	public Mago() {
		super(PONTO_ATAQUE,PONTO_DEFESA,ARMAS);
	}
	public Armas[] getARMAS() {
		return ARMAS;
	}

   
}
