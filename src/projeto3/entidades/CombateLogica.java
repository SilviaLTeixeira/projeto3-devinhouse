package projeto3.entidades;

import java.util.Random;

public class CombateLogica {
	private int rolamentoDado;
	private String nivelDificuldade;
	private Inimigo inimigo;
	private Jogador jogador;
	public CombateLogica() {
		
	}

	public int getRolamentoDado() {
		return rolamentoDado;
	}
	
	public void setRolamentoDado() {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(20)+1;
	    this.rolamentoDado = numeroAleatorio;
		
	}
	public String getNivelDificuldade() {
		return nivelDificuldade;
	}
	public void setNivelDificuldade(String nivelDificuldade) {
		if(nivelDificuldade.equals("Facil")||nivelDificuldade.equals("facil")||nivelDificuldade.equals("FACIL")) {
			System.out.println("Voce escolheu o nivel facil");
		    this.nivelDificuldade = nivelDificuldade;
		}else if(nivelDificuldade.equals("Normal")||nivelDificuldade.equals("normal")||nivelDificuldade.equals("NORMAL")) {
			System.out.println("Voce escolheu o nivel normal");
			this.nivelDificuldade = nivelDificuldade;
		}else if(nivelDificuldade.equals("Dificil")||nivelDificuldade.equals("dificil")||nivelDificuldade.equals("DIFICIL")) {
			System.out.println("Voce escolheu o nivel dificil");
			this.nivelDificuldade = nivelDificuldade;
		}else {
			System.out.println("Por favor escolha um nivel de dificuldade valido(Facil, Normal , Dificil)");
			System.exit(0);		
	}
	}

	public Inimigo getInimigo() {
		return inimigo;
	}

	public void setInimigo(Inimigo inimigo) {
		this.inimigo = inimigo;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public boolean lutar() {
		boolean turnoJogador = true;
		while(inimigo.getPV()>0&&jogador.getCombate().getPV()>0) {
			if(turnoJogador) {
				this.jogadorAtaca();
				turnoJogador = false;
			}else {
				this.inimigoAtaca();
				turnoJogador = true;
			}
		}
		if(inimigo.getPV()<= 0) {
			System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés");
			return true;
		}else {
			String motivaçao = jogador.getMotivaçao();
			System.out.println("Você não estava preparado para a força do inimigo");
			if(motivaçao.equals("Vingança")||motivaçao.equals("vingança")||motivaçao.equals("VINGANÇA")) {
				System.out.println("Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.");
			}else {
				String genero = jogador.getGenero();
				if(genero.equals("Feminino")||genero.equals("feminino")||genero.equals("FEMININO")) {
					System.out.println("A glória que buscavas não será sua, e a cidade aguarda por sua próxima heróina");
				}else {
					System.out.println("A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói");
				}
			}
			return false;
		}
		
	}

	private void inimigoAtaca() {
		this.setRolamentoDado();
		if(this.rolamentoDado == 1) {
			System.out.println("O inimigo errou o ataque! Você não sofreu dano.");
		}else if(this.rolamentoDado == 20) {
			int dano = this.getInimigo().getPA() + this.getInimigo().getArma().getDano() + this.getRolamentoDado();
			dano = nivelDificuldade.equals("Facil")
					||nivelDificuldade.equals("facil")
					||nivelDificuldade.equals("FACIL") ? (int)(dano - dano*0.2): dano;
			jogador.getCombate().setPV(jogador.getCombate().getPV() - dano);
			System.out.printf("O inimigo acertou um ataque crítico! Você sofreu %d de dano e agora possui %d pontos de vida.%n",dano,this.getJogador().getCombate().getPV());
		}else {
			int dano = this.getInimigo().getPA() + this.getInimigo().getArma().getDano() + this.getRolamentoDado() - jogador.getCombate().getPD();
			dano = nivelDificuldade.equals("Facil")
					||nivelDificuldade.equals("facil")
					||nivelDificuldade.equals("FACIL") ? (int)(dano - dano*0.2): dano;
			jogador.getCombate().setPV(jogador.getCombate().getPV()- dano);
			System.out.printf("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida%n",dano,this.getJogador().getCombate().getPV());
		}
		
	}

	private void jogadorAtaca() {
		this.setRolamentoDado();
		if(this.rolamentoDado == 1) {
			System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
		}else if(this.rolamentoDado == 20) {
			int dano = this.getJogador().getCombate().getPA() + this.getJogador().getArma().getDano() + this.getRolamentoDado();
			dano = nivelDificuldade.equals("Dificil")
					||nivelDificuldade.equals("dificil")
					||nivelDificuldade.equals("DIFICIL") ? (int)(dano - dano*0.1): dano;
			inimigo.setPV(inimigo.getPV()- dano);
			System.out.printf("Você acertou um ataque crítico! Você atacou %s e causou %d de dano no inimigo!%n",this.getJogador().getArma().ataque(),dano);
		}else {
			int dano = this.getJogador().getCombate().getPA() + this.getJogador().getArma().getDano() + this.getRolamentoDado() - inimigo.getPD();
			dano = nivelDificuldade.equals("Dificil")
					||nivelDificuldade.equals("dificil")
					||nivelDificuldade.equals("DIFICIL") ? (int)(dano - dano*0.1): dano;
			inimigo.setPV(inimigo.getPV()- dano);
			System.out.printf("Você atacou %s e causou %d de dano no inimigo!%n",this.getJogador().getArma().ataque(),dano);
		}
			
	}	
	
}
   