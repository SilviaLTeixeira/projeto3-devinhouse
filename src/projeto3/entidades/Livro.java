package projeto3.entidades;

public class Livro extends Armas {

	public Livro(int dano) {
		super(dano);
		
	}
    public String ataque() {
    	return "absorvendo energia do livro com uma mão e liberando com a outra";
    }
    public String toString() {
    	return "Livro";
    }
}
