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
					  System.out.println("Voce � uma Arqueira e as armas disponiveis para sua classe sao : BESTA , ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreira")||classe.equals("guerreira")||classe.equals("GUERREIRA")) {
					  System.out.println("Voce � uma Guerreira e as armas disponiveis para sua classe sao: ESPADA, MACHADO, MARTELO , CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Maga")||classe.equals("maga")||classe.equals("MAGA")) {
					  System.out.println("Voce � uma Maga e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "feminino":
				  if(classe.equals("Arqueira")||classe.equals("arqueira")||classe.equals("ARQUEIRA")) {
					  System.out.println("Voce � uma Arqueira e as armas disponiveis para sua classe sao : BESTA , ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreira")||classe.equals("guerreira")||classe.equals("GUERREIRA")) {
					  System.out.println("Voce � uma Guerreira e as armas disponiveis para sua classe sao: ESPADA, MACHADO, MARTELO , CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Maga")||classe.equals("maga")||classe.equals("MAGA")) {
					  System.out.println("Voce � uma Maga e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "FEMININO":
				  if(classe.equals("Arqueira")||classe.equals("arqueira")||classe.equals("ARQUEIRA")) {
					  System.out.println("Voce � uma Arqueira e as armas disponiveis para sua classe sao : BESTA , ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreira")||classe.equals("guerreira")||classe.equals("GUERREIRA")) {
					  System.out.println("Voce � uma Guerreira e as armas disponiveis para sua classe sao: ESPADA, MACHADO, MARTELO , CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Maga")||classe.equals("maga")||classe.equals("MAGA")) {
					  System.out.println("Voce � uma Maga e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "Masculino":
				  if(classe.equals("Arqueiro")||classe.equals("arqueiro")||classe.equals("ARQUEIRO")) {
					  System.out.println("Voce � um Arqueiro e as suas armas disponiveis sao : BESTA, ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreiro")||classe.equals("guerreiro")||classe.equals("GUERREIRO")) {
					  System.out.println("Voce � um Guerreiro e as armas disponiveis para sua classe sao: ESPADA, MACHADO , MARTELO ,CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Mago")||classe.equals("mago")||classe.equals("MAGO")) {
					  System.out.println("Voce � um Mago e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "masculino":
				  if(classe.equals("Arqueiro")||classe.equals("arqueiro")||classe.equals("ARQUEIRO")) {
					  System.out.println("Voce � um Arqueiro e as suas armas disponiveis sao : BESTA, ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreiro")||classe.equals("guerreiro")||classe.equals("GUERREIRO")) {
					  System.out.println("Voce � um Guerreiro e as armas disponiveis para sua classe sao: ESPADA, MACHADO , MARTELO ,CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Mago")||classe.equals("mago")||classe.equals("MAGO")) {
					  System.out.println("Voce � um Mago e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
					  jogador.setCombate(new Mago());
					  break;
				  }else {
					  throw new Exception();
				  }
			  case "MASCULINO":
				  if(classe.equals("Arqueiro")||classe.equals("arqueiro")||classe.equals("ARQUEIRO")) {
					  System.out.println("Voce � um Arqueiro e as suas armas disponiveis sao : BESTA, ARCO");
					  jogador.setCombate(new Arqueiro());
					  break;
				  }if(classe.equals("Guerreiro")||classe.equals("guerreiro")||classe.equals("GUERREIRO")) {
					  System.out.println("Voce � um Guerreiro e as armas disponiveis para sua classe sao: ESPADA, MACHADO , MARTELO ,CLAVA");
					  jogador.setCombate(new Guerreiro());
					  break;
				  }if(classe.equals("Mago")||classe.equals("mago")||classe.equals("MAGO")) {
					  System.out.println("Voce � um Mago e as armas disponiveis para sua classe sao: LIVRO, CAJADO");
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
			  
			  System.out.println("A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do crep�sculo voc� est� prestes a entrar na fase final da sua miss�o. Voc� olha para o portal � sua frente, e sabe que a partir desse ponto, sua vida mudar� para sempre.");
			  System.out.println("Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno. Olha para seu equipamento de combate, j� danificado e desgastado depois de tantas lutas. Voc� est� a um passo de encerrar para sempre esse mal");
			  System.out.println("Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui.");
			  System.out.println("Escolha sua motiva��o para invadir a caverna do inimigo e derrot�-lo: VINGAN�A, GL�RIA");
			  String motiva�ao = entrada.next();
			  motiva�ao = jogador.setMotiva�ao(motiva�ao);
			  System.out.println("Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado. Voc� avan�a pelo portal.");
			  System.out.println("A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua frente, s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir � frente, ou desistir.");
			  System.out.println("Escolha entre seguir em frente ou desistir(Escreva seguir ou desistir)");
			  String escolha = entrada.next();
				  switch(escolha) {
				  case "seguir":{
					  System.out.println("voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
					  System.out.println("Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta");
					  System.out.println("Escolha entre correr , saltar e andar(Escreva a palavra)");
					  String escolhaDois = entrada.next();
					  if(escolhaDois.equals("correr")||escolhaDois.equals("Correr")||escolhaDois.equals("CORRER")) {
						  System.out.println("Voc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas n�o d� muita import�ncia e segue para dentro da sala, olhando ao redor � procura de inimigos. N�o tem ningu�m, mas voc� ouve sons de flechas batendo na pedra atr�s de voc�, e quando se vira, v� v�rias flechas no ch�o. Espiando pela porta, voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa");
						 
					  }else if(escolhaDois.equals("saltar")||escolhaDois.equals("Saltar")||escolhaDois.equals("SALTAR")) {
						  System.out.println("Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior da sala.");
						 
					  }else if(escolhaDois.equals("andar")||escolhaDois.equals("Andar")||escolhaDois.equals("ANDAR")) {
						  System.out.println("Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc� pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado em uma pedra solta. Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se abre no teto atr�s de voc�, no corredor. Flechas voam da escotilha em sua dire��o, e voc� salta para dentro da sala, por�m uma delas te acerta na perna");
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
				  
				  System.out.println("Voc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas. A porta � sua frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc� n�o sabe ler, mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo. Voc� se aproxima da porta e percebe que ela est� trancada por duas fechaduras douradas, e voc� entende que precisar� primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o l�der.");
				  System.out.println("Voc� se dirige para a porta � direita.");
				  System.out.println("Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara com uma sala espa�osa, com v�rios equipamentos de batalha pendurados nas paredes e dispostos em arm�rios e mesas. Voc� imagina que este seja o arsenal do inimigo, onde est�o guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da regi�o.Enquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar para tr�s. Ali, de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um dos capit�es do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posi��o de combate. Ele avan�a em sua dire��o");
				  System.out.println("Escolha entre atacar ou fugir(Escreva a palavra)");
				  String escolhaTres = entrada.next();
				  if(escolhaTres.equals("Atacar")||escolhaTres.equals("atacar")||escolhaTres.equals("ATACAR")) {
					  combate.setInimigo(new Armeiro());
					  boolean jogadorVenceu = combate.lutar();
					  if(!jogadorVenceu) {
						  System.exit(0);
					  }
				  }else if(escolhaTres.equals("Fugir")||escolhaTres.equals("fugir")||escolhaTres.equals("FUGIR")) {
					  System.out.println("Voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez");
					  break;
				  }else {
					 System.out.println("Erro, escolha entre atacar ou fugir"); 
					 System.exit(0);
				  }
				  
				  System.out.println("Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados, e olha em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado");
				  System.out.println("Escolha entre pegar ou nao a armadura nova(Escreva sim ou nao)");
				  String escolhaQuatro = entrada.next();
				  if(escolhaQuatro.equals("Sim")||escolhaQuatro.equals("sim")||escolhaQuatro.equals("SIM")) {
				  System.out.println("Voc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas pe�as suas, que estavam danificadas, pelas pe�as de armaduras existentes na sala. De armadura nova, voc� se sente mais protegido para os desafios � sua frente.");
				  jogador.getCombate().setPD(jogador.getCombate().getPD() + 5);
				  }else if(escolhaQuatro.equals("Nao")||escolhaQuatro.equals("nao")||escolhaQuatro.equals("NAO")) {
				   System.out.println("Voc� decide que n�o precisa utilizar nada que venha das m�os do inimigo");
				  }else {
				  System.out.println("Escolha entre sim ou nao");
				  System.exit(0);
				  }
				  System.out.println("Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do l�der inimigo. Voc� pega a chave e guarda numa pequena bolsa que leva presa ao cinto");
				  System.out.println("Voc� retorna � sala anterior e se dirige � porta da esquerda. Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem v�rios potes e garrafas de vidro com conte�dos misteriosos e de cores diversas, e voc� entende que o capit�o que vive ali, realiza experimentos com diversos ingredientes, criando po��es utilizadas pelos soldados para aterrorizar a regi�o");
				  System.out.println("No fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo. Um orque horrendo, de armadura, cajado em punho, em posi��o de combate. Ele avan�a em sua dire��o.");
				  System.out.println("Escolha entre atacar ou fugir");
				  String escolhaCinco = entrada.next();
				  if(escolhaCinco.equals("Atacar")||escolhaCinco.equals("atacar")||escolhaCinco.equals("ATACAR")) {
					  combate.setInimigo(new Alquimista());
					  boolean jogadorVenceu = combate.lutar();
					  if(!jogadorVenceu) {
						  System.exit(0);
					  }
				  }else if(escolhaCinco.equals("Fugir")||escolhaCinco.equals("fugir")||escolhaCinco.equals("FUGIR")) {
					  System.out.println("Voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez");
					  break;
				  }else {
					 System.out.println("Erro, escolha entre atacar ou fugir"); 
					 System.exit(0);
				  }
				  System.out.println("Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente rosado, pega a garrafa e pondera se deve beber um gole");
				  System.out.println("Escolha sim ou nao");
				  String beberPo�ao = entrada.next();
				  if(beberPo�ao.equals("Sim")||beberPo�ao.equals("sim")||beberPo�ao.equals("SIM")) {
				  System.out.println("Voc� se sente revigorado para seguir adiante!");
				  jogador.getCombate().setPV(jogador.getCombate().getMaxPV());
				  System.out.println("Parabens , sua vida voltou para 100% !!!");
				  }else if(beberPo�ao.equals("Nao")||beberPo�ao.equals("nao")||beberPo�ao.equals("NAO")) {
				   System.out.println("Voc� fica receoso de beber algo produzido pelo inimigo");
				  }else {
				  System.out.println("Escolha entre sim ou nao");
				  System.exit(0);
				  }
				  System.out.println("Ao lado da porta, voc� v� uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do l�der inimigo. Voc� pega a chave e guarda na pequena bolsa que leva presa ao cinto");
				  System.out.println("De volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente, e voc� percebe que est� muito pr�ximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que voc� sabe que ir� se seguir, e adentra a porta");
				  System.out.println("L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados �s paredes");
				  System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de l�mina dupla");
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
				  System.out.println("Voc� conseguiu!");
				  if(motiva�ao.equals("Vingan�a")||motiva�ao.equals("vingan�a")||motiva�ao.equals("VINGAN�A")) {
					 System.out.println("Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma sensa��o de al�vio e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora voc� pode seguir sua vida");
					}else if(motiva�ao.equals("Gloria")||motiva�ao.equals("gloria")||motiva�ao.equals("GLORIA")){
					  System.out.println("O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de alegria. A gl�ria o aguarda, voc� a conquistou");
					}
				  System.out.println("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em dire��o � noite, retornando � cidade. Seu dever est� cumprido");
				  System.out.println("FIM DO JOGO");
				  break;
			      case "desistir":{
				  System.out.println("o medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio. Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.");
				  break;
			  }
	}

				  
			  
             
			  
		  
		  entrada.close();

		}
}
        
	


