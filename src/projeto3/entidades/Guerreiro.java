package projeto3.entidades;

public class Guerreiro extends Combate{
	private static final int PONTO_ATAQUE = 25;
	private static final int PONTO_DEFESA = 20;
	private static final Armas[] ARMAS = {new Espada(9), new Machado(10), new Martelo(8), new Clava(7)};
	
	public Guerreiro() {
		super(PONTO_ATAQUE,PONTO_DEFESA,ARMAS);
	}

	public Armas[] getARMAS() {
		return ARMAS;
	}
}
