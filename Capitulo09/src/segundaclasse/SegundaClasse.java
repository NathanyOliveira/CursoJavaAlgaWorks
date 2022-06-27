package segundaclasse;

public class SegundaClasse {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nome = "caderno";
		produto.quantidadeEstoque = 0;
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));

	}
	
	static Boolean eNecessarioReporEstoque(Produto produto) {
		
		if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE ) {
			
			return true;
		}
		
			return false;
		
	
	}

}


