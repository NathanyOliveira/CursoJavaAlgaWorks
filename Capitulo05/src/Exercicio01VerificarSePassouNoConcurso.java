import java.util.Scanner;

//Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua 
//prova. Ser�o dois par�metros para receber um para receber a nota de portugu�s e outro 
//para receber as de matem�tica.
//A prova, no total, vale 200 pontos - 100 para cada mat�ria. A nota m�nima total para 
//passar � igual ou maior que 150. Entretanto, o candidato n�o pode tirar menos do que 60
//pontos em qualquer uma das duas mat�rias, ou seja, se tirar 59 em portugu�s e 100 em 
//matem�tica (totalizando uma nota maior do que o total necess�rio que � 150) ele n�o 
//conseguir� a vaga. No final mostre para o candidato se ele conseguiu ou n�o.


public class Exercicio01VerificarSePassouNoConcurso {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println("Digite a nota de portugu�s: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.println("Digite a nota de matem�tica: ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean passouMatematica =  notaMatematica >= 60;
		Boolean passouPortugues = notaPortugues >= 60;
		Boolean minimoTotal = (notaMatematica + notaPortugues >= 150);
		
		if(passouMatematica && passouPortugues && minimoTotal) {
			System.out.println("Parab�ns! Voc� foi aprovado. Nota Matem�tica: " + notaMatematica + " Nota Portugu�s: " + notaPortugues);
		}else {
			System.out.println("Voc� foi reprovado! Nota Matem�tica: " + notaMatematica + " Nota Portugu�s: " + notaPortugues);
		}
		
		scanner.close();

	}
}
