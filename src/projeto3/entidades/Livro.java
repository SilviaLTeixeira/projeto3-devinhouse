package projeto3.entidades;

public class Livro extends Armas {

	public Livro(int dano) {
		super(dano);
		
	}
    public String ataque() {
    	return "absorvendo energia do livro com uma m�o e liberando com a outra";
    }
    public String toString() {
    	return "Livro";
    }
}
