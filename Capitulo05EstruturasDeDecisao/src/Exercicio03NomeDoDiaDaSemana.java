import java.util.Scanner;

public class Exercicio03NomeDoDiaDaSemana {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o n�mero do dia desejado: ");
		Integer dia = leia.nextInt();
		
		String nomeDia = "";
		
		switch(dia) {
		case 1: nomeDia = "domingo";
			break;
		case 2: nomeDia = "segunda-feira";
			break;
		case 3: nomeDia = "ter�a-feira";
			break;
		case 4: nomeDia = "quarta-feira";
			break;
		case 5: nomeDia = "quinta-feira";
			break;
		case 6: nomeDia = "sexta-feira";
			break;
		case 7: nomeDia = "s�bado";
			break;
		
		default:
			System.err.println("N�o � um n�mero v�lido!");
			System.exit(1);	
		}
		
		System.out.println("O dia escolhido �: " + nomeDia);
		
		leia.close();
	}
}
