package classeinstancia;

public class ClasseInstancia {

	public static void main(String[] args) {
		
		System.out.println("Quantidade mínima estoque: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto = new Produto();
		produto.nome = "óculos";
		
		System.out.println("Quantidade mínima estoque: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "mouse";
		
		System.out.println("Quantidade mínima estoque: " + Produto.quantidadeMinimaEstoque);

//		
//		System.out.println("Produto 1: " + produto.nome);
//		System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1" + produto.nome);
		Impressao.erro("Produto 1" + produto2.nome);
	}

}
