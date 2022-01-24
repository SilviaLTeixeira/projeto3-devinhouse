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
			System.out.println("O inimigo n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s");
			return true;
		}else {
			String motiva�ao = jogador.getMotiva�ao();
			System.out.println("Voc� n�o estava preparado para a for�a do inimigo");
			if(motiva�ao.equals("Vingan�a")||motiva�ao.equals("vingan�a")||motiva�ao.equals("VINGAN�A")) {
				System.out.println("N�o foi poss�vel concluir sua vingan�a, e agora resta saber se algu�m se vingar� por voc�.");
			}else {
				String genero = jogador.getGenero();
				if(genero.equals("Feminino")||genero.equals("feminino")||genero.equals("FEMININO")) {
					System.out.println("A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por sua pr�xima her�ina");
				}else {
					System.out.println("A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por seu pr�ximo her�i");
				}
			}
			return false;
		}
		
	}

	private void inimigoAtaca() {
		this.setRolamentoDado();
		if(this.rolamentoDado == 1) {
			System.out.println("O inimigo errou o ataque! Voc� n�o sofreu dano.");
		}else if(this.rolamentoDado == 20) {
			int dano = this.getInimigo().getPA() + this.getInimigo().getArma().getDano() + this.getRolamentoDado();
			dano = nivelDificuldade.equals("Facil")
					||nivelDificuldade.equals("facil")
					||nivelDificuldade.equals("FACIL") ? (int)(dano - dano*0.2): dano;
			jogador.getCombate().setPV(jogador.getCombate().getPV() - dano);
			System.out.printf("O inimigo acertou um ataque cr�tico! Voc� sofreu %d de dano e agora possui %d pontos de vida.%n",dano,this.getJogador().getCombate().getPV());
		}else {
			int dano = this.getInimigo().getPA() + this.getInimigo().getArma().getDano() + this.getRolamentoDado() - jogador.getCombate().getPD();
			dano = nivelDificuldade.equals("Facil")
					||nivelDificuldade.equals("facil")
					||nivelDificuldade.equals("FACIL") ? (int)(dano - dano*0.2): dano;
			jogador.getCombate().setPV(jogador.getCombate().getPV()- dano);
			System.out.printf("O inimigo atacou! Voc� sofreu %d de dano e agora possui %d pontos de vida%n",dano,this.getJogador().getCombate().getPV());
		}
		
	}

	private void jogadorAtaca() {
		this.setRolamentoDado();
		if(this.rolamentoDado == 1) {
			System.out.println("Voc� errou seu ataque! O inimigo n�o sofreu dano algum.");
		}else if(this.rolamentoDado == 20) {
			int dano = this.getJogador().getCombate().getPA() + this.getJogador().getArma().getDano() + this.getRolamentoDado();
			dano = nivelDificuldade.equals("Dificil")
					||nivelDificuldade.equals("dificil")
					||nivelDificuldade.equals("DIFICIL") ? (int)(dano - dano*0.1): dano;
			inimigo.setPV(inimigo.getPV()- dano);
			System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou %s e causou %d de dano no inimigo!%n",this.getJogador().getArma().ataque(),dano);
		}else {
			int dano = this.getJogador().getCombate().getPA() + this.getJogador().getArma().getDano() + this.getRolamentoDado() - inimigo.getPD();
			dano = nivelDificuldade.equals("Dificil")
					||nivelDificuldade.equals("dificil")
					||nivelDificuldade.equals("DIFICIL") ? (int)(dano - dano*0.1): dano;
			inimigo.setPV(inimigo.getPV()- dano);
			System.out.printf("Voc� atacou %s e causou %d de dano no inimigo!%n",this.getJogador().getArma().ataque(),dano);
		}
			
	}	
	
}
   