package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01ListaDeTarefas {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<String>();
		System.out.println("Digite sua lista de tarefas, para finalizar, aperte 'X'.");

		String tarefa;
		int i = 0;
		while (true) { // Deixei o true como condi��o do la�o, pois, o que vai par�-lo � o fato do usu�rio digitar o "x" no console.
			System.out.print("Tarefa " + (i + 1) + ": ");
			tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break; // Essa � a �nica maneira de parar esse la�o.
			}

			linhas.add(tarefa);
			i++;
		}

		escreverNoArquivo("C:\\estudos\\CursoJava\\Capitulo10\\tarefas.txt", linhas);

		scanner.close();
		
		System.out.println("Fim...");
	}
	
	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
	}
}