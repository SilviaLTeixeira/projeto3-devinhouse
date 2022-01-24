package projeto3.entidades;

public class Machado extends Armas {

	public Machado(int dano) {
		super(dano);
		
	}
	public String ataque() {
		return "Com seu machado";
	}
	public String toString() {
		return "Machado";
	}


}
