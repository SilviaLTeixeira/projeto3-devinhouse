package projeto3;
import java.util.Random;
import java.util.Scanner;
import projeto3.entidades.Mago;
import projeto3.entidades.Arqueiro;
import projeto3.entidades.Guerreiro;
import projeto3.entidades.Alquimista;
import projeto3.entidades.Armas;
import projeto3.entidades.Armeiro;
import projeto3.entidades.Jogador;
import projeto3.entidades.Lider;
import projeto3.entidades.Livro;
import projeto3.entidades.CombateLogica;

public class App {

	public static void main(String[] args) throws Exception {
		  Scanner entrada = new Scanner(System.in);
		      Jogador jogador = new Jogador();
		      CombateLogica combate = new CombateLogica();
		      combate.setJogador(jogador);
			  System.out.println("Seja bem vindo a BATALHA FINAL!");
			  System.out.println("Escolha o nivel de dificuldade(Escreva Facil , Normal , Dificil)");
			  String dificuldade = entrada.next();
			  combate.setNivelDificuldade(dificuldade);
			  System.out.println("Escolha nome e sexo");
			  String nome = entrada.next();
			  nome = jogador.setNome(nome);
			  System.out.println(nome);
			  String genero = entrada.next();
			  genero = jogador.setGenero(genero);
			  System.out.println("Escolha uma classe de combate");
			  String classe = entrada.next();
			  try {
			  switch(genero) {
			  case "Feminino":
				  if(classe.equals("Arqueira")||classe.equals("arqueira")||classe.equals("ARQUEIRA")) {
					  System.out.println("Voce é uma Arqueira e as armas disponiveis para sua classe sao : BESTA , ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreira")||classe.equals("guerreira")||classe.equals("GUERREIRA")) {
					  System.out.println("Voce é uma Guerreira e as armas disponiveis para sua classe sao: ESPADA, MACHADO, MARTELO , CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Maga")||classe.equals("maga")||classe.equals("MAGA")) {
					  System.out.println("Voce é uma Maga e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "feminino":
				  if(classe.equals("Arqueira")||classe.equals("arqueira")||classe.equals("ARQUEIRA")) {
					  System.out.println("Voce é uma Arqueira e as armas disponiveis para sua classe sao : BESTA , ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreira")||classe.equals("guerreira")||classe.equals("GUERREIRA")) {
					  System.out.println("Voce é uma Guerreira e as armas disponiveis para sua classe sao: ESPADA, MACHADO, MARTELO , CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Maga")||classe.equals("maga")||classe.equals("MAGA")) {
					  System.out.println("Voce é uma Maga e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "FEMININO":
				  if(classe.equals("Arqueira")||classe.equals("arqueira")||classe.equals("ARQUEIRA")) {
					  System.out.println("Voce é uma Arqueira e as armas disponiveis para sua classe sao : BESTA , ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreira")||classe.equals("guerreira")||classe.equals("GUERREIRA")) {
					  System.out.println("Voce é uma Guerreira e as armas disponiveis para sua classe sao: ESPADA, MACHADO, MARTELO , CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Maga")||classe.equals("maga")||classe.equals("MAGA")) {
					  System.out.println("Voce é uma Maga e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "Masculino":
				  if(classe.equals("Arqueiro")||classe.equals("arqueiro")||classe.equals("ARQUEIRO")) {
					  System.out.println("Voce é um Arqueiro e as suas armas disponiveis sao : BESTA, ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreiro")||classe.equals("guerreiro")||classe.equals("GUERREIRO")) {
					  System.out.println("Voce é um Guerreiro e as armas disponiveis para sua classe sao: ESPADA, MACHADO , MARTELO ,CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Mago")||classe.equals("mago")||classe.equals("MAGO")) {
					  System.out.println("Voce é um Mago e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "masculino":
				  if(classe.equals("Arqueiro")||classe.equals("arqueiro")||classe.equals("ARQUEIRO")) {
					  System.out.println("Voce é um Arqueiro e as suas armas disponiveis sao : BESTA, ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreiro")||classe.equals("guerreiro")||classe.equals("GUERREIRO")) {
					  System.out.println("Voce é um Guerreiro e as armas disponiveis para sua classe sao: ESPADA, MACHADO , MARTELO ,CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Mago")||classe.equals("mago")||classe.equals("MAGO")) {
					  System.out.println("Voce é um Mago e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "MASCULINO":
				  if(classe.equals("Arqueiro")||classe.equals("arqueiro")||classe.equals("ARQUEIRO")) {
					  System.out.println("Voce é um Arqueiro e as suas armas disponiveis sao : BESTA, ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreiro")||classe.equals("guerreiro")||classe.equals("GUERREIRO")) {
					  System.out.println("Voce é um Guerreiro e as armas disponiveis para sua classe sao: ESPADA, MACHADO , MARTELO ,CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Mago")||classe.equals("mago")||classe.equals("MAGO")) {
					  System.out.println("Voce é um Mago e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			
			
				  
			  }
			  }catch(Exception e) {
				  System.out.println("Digite uma classe disponivel para o seu genero");
				  System.exit(0);
			  }
			  
			  System.out.println("Escolha uma arma dentre as disponiveis para a sua classe");
			  Armas[] armas = jogador.getCombate().getArmas();
			  int arma = 0;
			  for(int i = 0; i < armas.length ; i++ ) {
				  System.out.printf("%d/%s%n",i,armas[i].toString());
			  }
			  arma = entrada.nextInt();
			  jogador.setArma(arma);  
			  
			  System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.");
			  System.out.println("Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal");
			  System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");
			  System.out.println("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: VINGANÇA, GLÓRIA");
			  String motivaçao = entrada.next();
			  motivaçao = jogador.setMotivaçao(motivaçao);
			  System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. Você avança pelo portal.");
			  System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou desistir.");
			  System.out.println("Escolha entre seguir em frente ou desistir(Escreva seguir ou desistir)");
			  String escolha = entrada.next();
				  switch(escolha) {
				  case "seguir":{
					  System.out.println("você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
					  System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta");
					  System.out.println("Escolha entre correr , saltar e andar(Escreva a palavra)");
					  String escolhaDois = entrada.next();
					  if(escolhaDois.equals("correr")||escolhaDois.equals("Correr")||escolhaDois.equals("CORRER")) {
						  System.out.println("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa");
						 
					  }else if(escolhaDois.equals("saltar")||escolhaDois.equals("Saltar")||escolhaDois.equals("SALTAR")) {
						  System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
						 
					  }else if(escolhaDois.equals("andar")||escolhaDois.equals("Andar")||escolhaDois.equals("ANDAR")) {
						  System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna");
						  Random random = new Random();
						  int numeroArmadilha = random.nextInt(10)+1;
						  System.out.println(numeroArmadilha);
						  int pontoDeVida;
						  int ataqueFlecha = 1;
						  pontoDeVida = jogador.getCombate().getPV() - numeroArmadilha - ataqueFlecha;
						  jogador.getCombate().setPV(pontoDeVida);
						  System.out.println("Voce foi atingido!!! Os seus pontos de vida sao :"+pontoDeVida);
						
					  }else {
					  System.out.println("Erro, escolha entre correr , saltar ou andar");
					  System.exit(0);
					  } 
				  }
				  
				  System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.");
				  System.out.println("Você se dirige para a porta à direita.");
				  System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da região.Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate. Ele avança em sua direção");
				  System.out.println("Escolha entre atacar ou fugir(Escreva a palavra)");
				  String escolhaTres = entrada.next();
				  if(escolhaTres.equals("Atacar")||escolhaTres.equals("atacar")||escolhaTres.equals("ATACAR")) {
					  combate.setInimigo(new Armeiro());
					  boolean jogadorVenceu = combate.lutar();
					  if(!jogadorVenceu) {
						  System.exit(0);
					  }
				  }else if(escolhaTres.equals("Fugir")||escolhaTres.equals("fugir")||escolhaTres.equals("FUGIR")) {
					  System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez");
					  break;
				  }else {
					 System.out.println("Erro, escolha entre atacar ou fugir"); 
					 System.exit(0);
				  }
				  
				  System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado");
				  System.out.println("Escolha entre pegar ou nao a armadura nova(Escreva sim ou nao)");
				  String escolhaQuatro = entrada.next();
				  if(escolhaQuatro.equals("Sim")||escolhaQuatro.equals("sim")||escolhaQuatro.equals("SIM")) {
				  System.out.println("Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios à sua frente.");
				  jogador.getCombate().setPD(jogador.getCombate().getPD() + 5);
				  }else if(escolhaQuatro.equals("Nao")||escolhaQuatro.equals("nao")||escolhaQuatro.equals("NAO")) {
				   System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo");
				  }else {
				  System.out.println("Escolha entre sim ou nao");
				  System.exit(0);
				  }
				  System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto");
				  System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos soldados para aterrorizar a região");
				  System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");
				  System.out.println("Escolha entre atacar ou fugir");
				  String escolhaCinco = entrada.next();
				  if(escolhaCinco.equals("Atacar")||escolhaCinco.equals("atacar")||escolhaCinco.equals("ATACAR")) {
					  combate.setInimigo(new Alquimista());
					  boolean jogadorVenceu = combate.lutar();
					  if(!jogadorVenceu) {
						  System.exit(0);
					  }
				  }else if(escolhaCinco.equals("Fugir")||escolhaCinco.equals("fugir")||escolhaCinco.equals("FUGIR")) {
					  System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez");
					  break;
				  }else {
					 System.out.println("Erro, escolha entre atacar ou fugir"); 
					 System.exit(0);
				  }
				  System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole");
				  System.out.println("Escolha sim ou nao");
				  String beberPoçao = entrada.next();
				  if(beberPoçao.equals("Sim")||beberPoçao.equals("sim")||beberPoçao.equals("SIM")) {
				  System.out.println("Você se sente revigorado para seguir adiante!");
				  jogador.getCombate().setPV(jogador.getCombate().getMaxPV());
				  System.out.println("Parabens , sua vida voltou para 100% !!!");
				  }else if(beberPoçao.equals("Nao")||beberPoçao.equals("nao")||beberPoçao.equals("NAO")) {
				   System.out.println("Você fica receoso de beber algo produzido pelo inimigo");
				  }else {
				  System.out.println("Escolha entre sim ou nao");
				  System.exit(0);
				  }
				  System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa que leva presa ao cinto");
				  System.out.println("De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta");
				  System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes");
				  System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla");
				  String escolhaSeis = "";
				  do {
					System.out.println("Voce quer atacar ou esperar?");
					escolhaSeis = entrada.next();
					if(escolhaSeis.equals("Esperar")||escolhaSeis.equals("esperar")||escolhaSeis.equals("ESPERAR")) {
					  System.out.println("E ai vai atacar so no dia 30 de fevereiro?");	
					}else if(escolhaSeis.equals("Atacar")||escolhaSeis.equals("atacar")||escolhaSeis.equals("ATACAR")) {
						System.out.println("Voce decidiu atacar");
					}else {
						System.out.println("Decida entre atacar ou esperar");
						escolhaSeis = "Esperar";
					}
				  }while(escolhaSeis.equals("Esperar")||escolhaSeis.equals("esperar")||escolhaSeis.equals("ESPERAR"));
				  combate.setInimigo(new Lider());
				  boolean jogadorVenceu = combate.lutar();
				  if(!jogadorVenceu) {
					  System.exit(0);
				  }
				  System.out.println("Você conseguiu!");
				  if(motivaçao.equals("Vingança")||motivaçao.equals("vingança")||motivaçao.equals("VINGANÇA")) {
					 System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida");
					}else if(motivaçao.equals("Gloria")||motivaçao.equals("gloria")||motivaçao.equals("GLORIA")){
					  System.out.println("O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou");
					}
				  System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção à noite, retornando à cidade. Seu dever está cumprido");
				  System.out.println("FIM DO JOGO");
				  break;
			      case "desistir":{
				  System.out.println("o medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.");
				  break;
			  }
	}

				  
			  
             
			  
		  
		  entrada.close();

		}
}
        
	


