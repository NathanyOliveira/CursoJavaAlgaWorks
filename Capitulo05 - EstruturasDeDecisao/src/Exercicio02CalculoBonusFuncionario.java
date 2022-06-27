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
//			System.out.println("Parabéns por atingir a meta! Seu bônus é de: " + bonusTotal);
//			
//		}else if (faturamentoReal < metaFaturamentoAnual && faturamentoReal >= metaFaturamentoAnual*80/100) {
//			System.out.println("Parte da meta foi atingida! Seu bônus é de: " + bonusParcial );
//		}else {
//			System.out.println("Meta não atingida!");
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
		
		System.out.println("DIGITE A META DE FATURAMENTO ANUAL DA EMPRESA: "); // Aqui é a meta ao inves da média
		Double metaDeFaturamentoAnual = scanner.nextDouble(); // aqui troquei o nome da variável de "media..." para "meta...".
		
		System.out.println("DIGITE O FATURAMENTO REAL DA EMPRESA NO ÚLTIMO ANO: ");
		Double faturamentoRealDaEmpresa = scanner.nextDouble();
		
		Double oitentaPorCentoDaMeta = metaDeFaturamentoAnual * 80 / 100;

        Boolean faturouPeloMenos80PorCento = faturamentoRealDaEmpresa > oitentaPorCentoDaMeta;

        // Se passar do IF, temos certeza que tem bonus. Basta saber se é total ou parcial.
        if (!faturouPeloMenos80PorCento) {
            System.out.println("O funcionário não obteve bônus salarial.");
            System.exit(0); // Aqui o programa para.
        }

        System.out.println("DIGITE A MÉDIA SALARIAL DO FUNCIONÁRIO(A): ");
		Double mediaSalarialDoFuncionario = scanner.nextDouble();

		Boolean ganharBonusTotal = faturamentoRealDaEmpresa >= metaDeFaturamentoAnual;
        if (ganharBonusTotal) {
            System.out.println("O funcionário(a) obteve bônus salarial de " + mediaSalarialDoFuncionario);
        } else if (faturouPeloMenos80PorCento) { // essa verificação é só por desincargo de conciência, pois, para chegar aqui, tem que ter faturado os 80%. Gosto de fazer isso, pois, nunca sabemos o que será o futuro do nosso algoritmo. :)
            Double bonusParcial = mediaSalarialDoFuncionario * 80 / 100;
            System.out.println("O funcionário(a) obteve bônus salarial de " + bonusParcial);
        }		
	}
}
