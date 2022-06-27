package encapsulamento;

public class Cliente {
	
//	String nome;
	
	//variaveis de instancia
	String primeiroNome;
	String ultimoNome;
	String telefone;
	
	//encapsulamento
	String getNome() { // nome nao � propriedade mais
		return primeiroNome + " " + ultimoNome;
	}
	
	void setNome(String nome){
		String[]nomeCompleto = nome.split(" ");
		primeiroNome = nomeCompleto[0];
		ultimoNome = nomeCompleto[1];
		
		
	}

	
	
	String getPrimeiroNome() {
		return primeiroNome;
	}

	void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	String getUltimoNome() {
		return ultimoNome;
	}

	void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	String getTelefone() {
		return telefone;
	}

	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
