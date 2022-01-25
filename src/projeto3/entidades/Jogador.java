package projeto3.entidades;

public class Jogador {
	private String motivaçao;
	private String nome;
	private String apelido;
	private String genero;
	private Combate combate;
	private Armas arma;
	
 public Jogador() {
	 
 }

public String getNome() {
	return nome;
}

public String setNome(String nome) {
	return this.nome = nome;
}

public String getGenero() {
	return genero;
}

public String setGenero(String genero) {
	
	if(genero.equals("Feminino")||genero.equals("feminino")||genero.equals("FEMININO")) {
	   System.out.println("Voce pode ser uma Arqueira, uma Guerreira ou uma Maga");
	   this.genero = genero;
	}else if(genero.equals("Masculino")||genero.equals("masculino")||genero.equals("MASCULINO")) {
	   System.out.println("Voce pode ser um Arqueiro , um Guerreiro ou um Mago");
	   this.genero = genero;
	}else {
	System.out.println("Por favor escolha um genero valido(Masculino ou Feminino)");
	System.exit(0);
	}
	return genero;
}

public String getMotivaçao() {
	return motivaçao;
}

public String setMotivaçao(String motivaçao) {
		if(motivaçao.equals("Vingança")||motivaçao.equals("vingança")||motivaçao.equals("VINGANÇA")) {
			System.out.println("Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).");
			this.motivaçao = motivaçao;
		}else if(motivaçao.equals("Gloria")||motivaçao.equals("gloria")||motivaçao.equals("GLORIA")){
			System.out.println("Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.");
			this.motivaçao = motivaçao;
		}else {
			System.out.println("Escolha entre Vingança ou Gloria");
			System.exit(0);
		}
	
	return motivaçao;
}

public Combate getCombate() {
	return combate;
}

public void setCombate(Combate combate) {
	this.combate = combate;
}

public Armas getArma() {
	return arma;
}

public void setArma(int armaEscolhida) {
	this.arma = this.getCombate().getArmas()[armaEscolhida];
}

public String getApelido() {
	return apelido;
}

public String setApelido(String apelido) {
	return this.apelido = apelido;
}



}
