import java.util.Scanner;

//Crie um sistema onde o usu�rio vai cadastrar, utilizando o console, as 5 tarefas mais
//importantes do dia dele. Armazene cada uma dessas tarefas em um vetor e, no final,
//imprima as tarefas novamente.

public class Exercicio01CadastrandoTafefasDoDia {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String[] tarefasDiarias = new String [5];

		System.out.println("Digite as 5 tarefas do seu dia: ");
		for(int i = 0; i < tarefasDiarias.length; i ++) {
			System.out.print("Tarefa " + " " + (i+1) + ": ");
			tarefasDiarias[i] = leia.nextLine();
		}
		
		System.out.println("Suas tarefas di�rias s�o: "); 
		for(int i = 0; i < tarefasDiarias.length; i++) {
			System.out.println((i+1) + " " + tarefasDiarias[i]);
		}
		leia.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

//public static void main(String[] args) {
//    Scanner leia = new Scanner(System.in);
//    String[] tarefas = new String[5];
//
//    for(int i = 0; i < tarefas.length; i++){
//        System.out.print("Informe a tarefa " + i + ": ");
//        tarefas[i] = leia.nextLine();
//    	}
//    	System.out.println("Suas tarefas s�o: ");
//
//    	for (int i = 0; i < tarefas.length; i++){
//        System.out.println(i + ": " + tarefas[i]);
//    	}
//
//    leia.close();
//	}
//}





//public class Exercicio01CadastrandoTafefasDoDia {
//
//	public static void main(String[] args) {
//		
//		String[] tarefas = new String [6];
//		
//		Scanner scanner = new Scanner(System.in);
//
//	for (int i = 1; i < tarefas.length; i++) {
//		System.out.println("Digite a sua " + i + " tarefa: ");
//		tarefas[i] = scanner.nextLine();
//	
//	}
//	for (int i = 1; i < tarefas.length; i++) {
//	System.out.println("Tarefa " + i + ": "+ tarefas[i] );
//	}
//	
//		scanner.close();
//	}
//}


//import java.util.Scanner;
//public class Exercicio01CadastrandoTafefasDoDia {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String[] tarefaDoDia = new String[6];
//		
//		for (int i = 1; i <  tarefaDoDia.length ;i++) {
//			System.out.print("Informe sua "+i+"� atividade: ");
//			tarefaDoDia[i] = scanner.nextLine();
//		}
//		scanner.close();
//		
//		for (int i = 1; i < tarefaDoDia.length ; i++) {
//			System.out.println(i+"� "+tarefaDoDia[i]);
//			}
//	}
//}
