package projeto3.entidades;

public class Clava extends Armas {

	public Clava(int dano) {
		super(dano);
		
	}
	public String ataque() {
		return "Com sua clava";
	}
	public String toString() {
		return "Clava";
	}

}
