//package cardGame;

public class Jogo {

    public void printCabecalho() {
        System.out.println("========= CARD GAME =========\n");
    }

    public void printPlacar(Jogador p1, Jogador p2) {
        System.out.println("\t  P1 " + p1.getPontuacao() + ":" + p2.getPontuacao() + " P2\n");
    }

    public void printVencedor(Jogador p1, Jogador p2) {
        if(p1.getPontuacao() == p2.getPontuacao()) {
            System.out.println("EMPATE!!!");
        }
        else if(p1.getPontuacao() > p2.getPontuacao()) {
            System.out.println(p1.getNome() + " GANHOU A PARTIDA!!!");
        }
        else {
            System.out.println(p2.getNome() + " GANHOU A PARTIDA!!!");
        }

    }

    public void printTabuleiro(Tabuleiro tabuleiro) {
    for(int i=0; i<3; i++) {
      printCartas(tabuleiro.getLinhaCartas(i));
    }
  }

    public void printCartas(Carta[] cartas) {
    for(int i=0; i<cartas.length; i++) {
      linhaDoJogador(cartas[i]);
    }
    System.out.println();

    for(int i=0; i<cartas.length; i++) {
      linhaSuperior();
    }
    System.out.println();

    for(int i=0; i<cartas.length; i++) {
      linhaTopo(cartas[i]);
    }
    System.out.println();

    for(int i=0; i<cartas.length; i++) {
      linhaMeio(cartas[i]);
    }
    System.out.println();

    for(int i=0; i<cartas.length; i++) {
      linhaFundo(cartas[i]);
    }
    System.out.println();

    for(int i=0; i<cartas.length; i++) {
      linhaInferior();
    }
    System.out.println("\n");
  }

    private static void linhaDoJogador(Carta c) {
    int topo = c.getTopo();
    String player = eh0(topo) ? "  ": c.getJogador().getNome();
    System.out.print(player + "    ");
  }

  private static void linhaSuperior() {
    System.out.print("+-----+" + "    ");
  }

  private static void linhaTopo(Carta c) {
    int topo = c.getTopo();
    System.out.print("|  " + (eh10(topo) ? "A": topo) + "  |" + "    ");
  }

  private static void linhaMeio(Carta c) {
    int esquerda = c.getEsquerda();
    int direita = c.getDireita();
    System.out.print("|" + (eh10(esquerda) ? "A": esquerda) + "   " + (eh10(direita) ? "A": direita) + "|" + "    ");
  }

  private static void linhaFundo(Carta c) {
    int fundo = c.getFundo();
    System.out.print("|  " + (eh10(fundo) ? "A": fundo)+"  |" + "    ");
  }

  private static void linhaInferior() {
    System.out.print("+-----+" + "    ");
  }

    public static boolean eh0(int num) {
    if(num == 0) return true;
    else return false;
  }

  private static boolean eh10(int num) {
    if(num == 10) return true;
    else return false;
  }

}
