package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = "Nathany Maciel";
//		cliente.telefone = "1199999999";
//		
//		System.out.println("Nome cliente: " + cliente.nome);
		
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Nathany Maciel");
		cliente.setTelefone("11999999999");
		
		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Último nome: " + cliente.getUltimoNome());

		
		
	}

}
