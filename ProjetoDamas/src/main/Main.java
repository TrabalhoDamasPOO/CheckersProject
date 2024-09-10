package main;

/*

Novas adições:
	1-Funções getDist, getDir e scanCapturasDisponiveis
		Modificação nos parâmetros da função getDist para fazer mais sentido semântico
	2-Funções isKing, verificarObstaculos e scanCapturasDistantes
		Também foi adicionada uma função validacaoCaptura, que é um método privado e não é utilizado por outras classes além da classe Board
	3-Funções isValidMove e movePiece modificadas
		Verificação de captura obrigatória na função isValidMove
		Adaptação da função movePiece para permitir capturas em sequência
	4-Função checkKingCapture adicionada e função removePiece modificada
		A função removePiece foi modificada para funcionar tanto com capturas a distância como com capturas normais
		A função checkKingCapture detecta capturas realizadas por uma dama sem afetar a função isCapture
	5-Função isCapture modificada para verificar se existe uma peça para ser capturada na direção do movimento
	6-Captura obrigatória
	7-Captura em sequência

Bugs encontrados (e não corrigidos):


Bugs corrigidos:
	1-Detecção de uma captura obrigatória não realizada logo ao começar a partida
	2-Falsa sequência criada a partir da movimentação de uma peça para uma casa adjacente à uma peça adversária
	3-Sequência não funcionando
	4-Movimentar peças para trás sem ser captura
	5-Movimentar a peça por duas casas consecutivas sem ser dama nem captura
	6-Burlar a captura obrigatória movendo a peça duas casas em outra direção
	7-Captura obrigatória no turno errado
		OBS: Isso foi causado por um else if utilizando um valor booleano como uma das condições, foi resolvido adicionando uma redundância
			Ex:
				if ((x) && (alguma operação qualquer > 0)) {	-------------> if ((x) && (alguma operação qualquer > 0)) {
				
				} else if (alguma operação qualquer < 0) {                     } else if ((!x) && (alguma operação qualquer > 0)) {
				
				}                                                              }
	8-Damas não sendo promovidas (OBS: AINDA PRECISA TESTAR ISSO)
	9-Movimento legal detectado como movimento para trás
		OBS: Causado pelo mesmo erro do else if mencionado no bug corrigido 7
	10-Índice negativo causando erros na função validacaoCaptura
	11-Dama não consegue se movimentar mais de uma casa
	12-Captura a distância realizada por uma dama não registrando


TODO:


*/

public class Main {
    public static void main(String[] args) {
        Game jogo = new Game();
        jogo.start();
    }
}