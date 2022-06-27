package exercicio03ExibindoDadosDeUmPedido;


//praticar encapsulamento
public class ExibindoDadosDeUmPedido {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		
		pedido.codigo = "1";
		pedido.subtotal = 100.0;
		pedido.desconto = (pedido.subtotal * 10 / 100);
		//pedido.total = 9.0;
		
		System.out.println("Codigo: " + pedido.getCodigo());
		System.out.println("Subtotal: " + pedido.getSubtotal());
		System.out.println("Desconto: " + pedido.getDesconto());
		System.out.println("Total: " + pedido.getTotal());
	}

}
