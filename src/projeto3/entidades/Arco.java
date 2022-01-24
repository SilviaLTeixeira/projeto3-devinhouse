package projeto3.entidades;

public class Arco extends Armas {

	public Arco(int dano) {
		super(dano);
		
	}
	public String ataque() {
		return " Com seu arco as flechas o atingiram";
	}
	public String toString() {
		return "Arco e Flecha";
	}

}
