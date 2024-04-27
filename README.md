## Objetivo do Projeto:
Implementar um jogo de batalha de cartas baseado em um tabuleiro de 3x3.
## Especificação do Jogo:
Este é um jogo de tabuleiro 3x3 jogado entre dois jogadores. Cada jogador possui um
conjunto de 5 cartas com valores nos quatro lados (topo, fundo, esquerda e direita) que vão
de 0 até 10 (o 10 é representado por ‘A’ no jogo). Os jogadores alternam turnos para colocar
uma de suas cartas em uma célula vazia do tabuleiro. O objetivo é conquistar as células do
tabuleiro com cartas mais fortes, com base nas regras de comparação de valores entre
cartas.
## Regras do Jogo:
1. O jogo possui cartas e um tabuleiro 3x3.
a. Exemplo:
i. A imagem à esquerda é o exemplo de uma carta (as setas são
apenas ilustrações para entender o direcionamento, portanto não
devem estar presentes de forma gráfica no terminal).
ii. A imagem à direita é um exemplo gráfico do campo 3x3 do jogo, este
campo deve ter uma única carta para cada posição, totalizando 9
cartas.

![image](https://github.com/Mariadalva25/Card_Game/assets/112985509/5603d8dc-d23b-41a9-b654-87e287ac9051)

3. Durante a inserção de uma carta, o jogador ganha as células adjacentes ao lado da
carta colocada se a carta adversária tiver um valor menor na direção
correspondente.
a. Exemplo: Jogador verde coloca uma carta que possui o valor 6 em seu
lado esquerdo na posição do tabuleiro imediatamente à direita de uma
carta do oponente que possui o valor 2 no seu lado direito: as duas cartas
se tornam verdes(ao se tornar verde, significa que o jogador verde tomou
posse da carta que era antes do jogador azul), pois 6 é maior que 2.
i. Note que nessa jogada as cartas se encontram, nesse caso ficou a
esquerda de uma carta junto com a direita de outra. Mas não se limita
apenas com a ‘esquerda’ e ‘direita’ das cartas, podendo aplicar o
mesmo padrão para a posição ‘cima’ e ‘baixo’.

![image](https://github.com/Mariadalva25/Card_Game/assets/112985509/7144d697-3c9b-4e84-9ad6-04eced0c57e5)

5. O jogador vence o jogo se conquistar mais células no tabuleiro ao final do jogo.
6. O jogo termina quando todas as células do tabuleiro forem preenchidas.
## Pontuação dos Jogadores:
● Cada jogador começa o jogo com 5 pontos.
● Quando um jogador captura uma carta do oponente no tabuleiro, ele ganha um
ponto.
● Quando um jogador perde uma carta para o oponente no tabuleiro, ele perde um
ponto.

