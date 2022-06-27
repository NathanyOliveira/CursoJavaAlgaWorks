package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Nathany";
		cliente.ultimoNome = "Maciel";
		cliente.telefone = "35999-9999";
		cliente.email = "macielnathany@gmail.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome ="Gabriel";
		cliente2.ultimoNome = "Fatori";
		cliente2.telefone = "118888888";
		
		
		//System.out.println("Nome cliente: " + Cliente.obterNomeCompleto(cliente)); // Esse é o método estático

		System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + " DDD: " + cliente.obterDDD());
		System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + " DDD: " + cliente2.obterDDD());

	}
	
//	static String obterNomeCompleto(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		return nomeCompleto;
//	}

}
