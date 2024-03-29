import java.util.Scanner;

public class PrimeiroMetodo {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		imprimir("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		testeLogicoValidarPosicaoEscolhida(posicaoCursoEscolhido, cursos);
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);

		imprimir("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
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
	
	
}
