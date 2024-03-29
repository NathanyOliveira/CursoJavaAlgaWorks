import java.util.Scanner;

public class RetornandoValores2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		
		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que voc� deseja � o: ", scanner);
		
		testeLogicoValidarPosicaoEscolhida(posicaoCursoEscolhido, cursos);
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);

		
		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida �: ", scanner);
		
		testeLogicoValidarPosicaoEscolhida(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	//M�todos para facilitar o c�digo acima: 
	
	
	static void testeLogicoValidarPosicaoEscolhida(Integer posicaoUsuario, String[]tamanho) {
		Boolean posicaoValida = posicaoUsuario >= 0 && posicaoUsuario < tamanho.length; 
		
		if (!posicaoValida) {
			System.err.println("Posi��o inv�lida!");
			System.exit(1);
		}
	}
		
	
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
		
	}
	
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimir(texto);
		Integer numero = scanner.nextInt();
		return numero;
		
	}
}
