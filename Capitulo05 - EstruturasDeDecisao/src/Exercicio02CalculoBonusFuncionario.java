//import java.util.Scanner;
//
//public class Exercicio02CalculoBonusFuncionario {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//	
//		System.out.println("Digite a meta do faturamento anual: ");
//		Double metaFaturamentoAnual = scanner.nextDouble();
//		
//		System.out.println("Digite o faturamento real: ");
//		Double faturamentoReal = scanner.nextDouble();
//
//		Double bonusTotal = 12000.0;
//		Double bonusParcial = bonusTotal * 80/100;
//		
//		if(faturamentoReal >= metaFaturamentoAnual) {
//			System.out.println("Parab�ns por atingir a meta! Seu b�nus � de: " + bonusTotal);
//			
//		}else if (faturamentoReal < metaFaturamentoAnual && faturamentoReal >= metaFaturamentoAnual*80/100) {
//			System.out.println("Parte da meta foi atingida! Seu b�nus � de: " + bonusParcial );
//		}else {
//			System.out.println("Meta n�o atingida!");
//		}
//				
//		scanner.close();
//	}
//}
//




import java.util.Scanner;

public class Exercicio02CalculoBonusFuncionario {
	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("DIGITE A META DE FATURAMENTO ANUAL DA EMPRESA: "); // Aqui � a meta ao inves da m�dia
		Double metaDeFaturamentoAnual = scanner.nextDouble(); // aqui troquei o nome da vari�vel de "media..." para "meta...".
		
		System.out.println("DIGITE O FATURAMENTO REAL DA EMPRESA NO �LTIMO ANO: ");
		Double faturamentoRealDaEmpresa = scanner.nextDouble();
		
		Double oitentaPorCentoDaMeta = metaDeFaturamentoAnual * 80 / 100;

        Boolean faturouPeloMenos80PorCento = faturamentoRealDaEmpresa > oitentaPorCentoDaMeta;

        // Se passar do IF, temos certeza que tem bonus. Basta saber se � total ou parcial.
        if (!faturouPeloMenos80PorCento) {
            System.out.println("O funcion�rio n�o obteve b�nus salarial.");
            System.exit(0); // Aqui o programa para.
        }

        System.out.println("DIGITE A M�DIA SALARIAL DO FUNCION�RIO(A): ");
		Double mediaSalarialDoFuncionario = scanner.nextDouble();

		Boolean ganharBonusTotal = faturamentoRealDaEmpresa >= metaDeFaturamentoAnual;
        if (ganharBonusTotal) {
            System.out.println("O funcion�rio(a) obteve b�nus salarial de " + mediaSalarialDoFuncionario);
        } else if (faturouPeloMenos80PorCento) { // essa verifica��o � s� por desincargo de conci�ncia, pois, para chegar aqui, tem que ter faturado os 80%. Gosto de fazer isso, pois, nunca sabemos o que ser� o futuro do nosso algoritmo. :)
            Double bonusParcial = mediaSalarialDoFuncionario * 80 / 100;
            System.out.println("O funcion�rio(a) obteve b�nus salarial de " + bonusParcial);
        }		
	}
}
