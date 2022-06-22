import java.util.Scanner;

public class Exercicio04ExibirTabuadaDeUmNumeroQualquer {

	public static void main(String[] args) {
		
		System.out.println("Digite o n�mero para calcular a tabuada: ");
		Scanner scanner = new Scanner(System.in);
		
		Double tabuadaEntrada = scanner.nextDouble();
		imprimirTabuada(tabuadaEntrada, 0.0);
		
		scanner.close();
	}

	static void imprimirTabuada(Double multiplicando, Double multiplicador) {
		
		Double resultado = 0.0;
		if (++multiplicador <= 10) {
			 resultado = multiplicando * multiplicador;
			System.out.println(multiplicando.toString() + " x " + multiplicador + " = " + resultado);

			imprimirTabuada(multiplicando, multiplicador);
		}
	}

}



	
	