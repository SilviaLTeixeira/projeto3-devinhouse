package projeto3.entidades;

public class Armeiro extends Inimigo {
   private static final int PONTO_ATAQUE = 20;
   private static final int PONTO_DEFESA = 10;
   private static final Armas ARMA = new Espada(9);
   
   public Armeiro() {
	   super(PONTO_ATAQUE,PONTO_DEFESA,ARMA);
   }

}
