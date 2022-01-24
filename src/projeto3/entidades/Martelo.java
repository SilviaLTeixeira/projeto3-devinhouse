package projeto3.entidades;

public class Martelo extends Armas {

	public Martelo(int dano) {
		super(dano);
		
	}
	public String ataque() {
		return "Com seu martelo";
	}
	public String toString() {
		return "Martelo";
	}


}
