package projeto3.entidades;

public class Jogador {
	private String motiva�ao;
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

public String getMotiva�ao() {
	return motiva�ao;
}

public String setMotiva�ao(String motiva�ao) {
		if(motiva�ao.equals("Vingan�a")||motiva�ao.equals("vingan�a")||motiva�ao.equals("VINGAN�A")) {
			System.out.println("Imagens daquela noite tr�gica invadem sua mente. Voc� nem precisa se esfor�ar para lembrar, pois essas mem�rias est�o sempre presentes, mesmo que de pano de fundo, quando voc� tem outros pensamentos em foco, elas nunca o deixaram. Elas s�o o combust�vel que te fizeram chegar at� aqui. E voc� sabe que n�o ir� desistir at� ter vingado a morte daqueles que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo. O maldito l�der finalmente pagar� por tanto mal causado na vida de tantos (e principalmente na sua).");
			this.motiva�ao = motiva�ao;
		}else if(motiva�ao.equals("Gloria")||motiva�ao.equals("gloria")||motiva�ao.equals("GLORIA")){
			System.out.println("Voc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os abertos, bardos criando can��es sobre seus feitos her�icos, nobres te presenteando com j�ias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilan�as. Desde j�, voc� sente o amor do p�blico, te louvando a cada passo que d� pelas ruas, depois de destruir o vil�o que tanto assombrou a paz de todos. Por�m, voc� sabe que ainda falta o �ltimo ato dessa hist�ria. Voc� se concentra na miss�o. A gl�ria o aguarda, mas n�o antes da �ltima batalha.");
			this.motiva�ao = motiva�ao;
		}else {
			System.out.println("Escolha entre Vingan�a ou Gloria");
			System.exit(0);
		}
	
	return motiva�ao;
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
