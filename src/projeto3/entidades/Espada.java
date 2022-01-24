package projeto3.entidades;

public class Espada extends Armas {

	public Espada(int dano) {
		super(dano);
		
	}
	public String ataque() {
		return "Com sua espada";
	}
	public String toString() {
		return "Espada";
	}


}
