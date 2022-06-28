package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02MostrarListaDeTarefasAoUsuario {

	public static void main(String[] args) throws IOException {
			Path tarefas = Paths.get("C:\\estudos\\CursoJava\\Capitulo10\\tarefas.txt");
			List<String>linhas = Files.readAllLines(tarefas);
			
			
			for(int i = 0; i < linhas.size(); i++) {
				String tarefinhas = linhas.get(i);
				System.out.println("Tarefa " + (i+1) + ": " + tarefinhas);
				
			}
			
			
			
	}

}
