package sobrecarga;

public class Sobrecarga {

	public static void  main(String[] args) {
			//quadrilatero
		//com retorno
		
		System.out.println("retornos");
		
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("�rea do quadrado: " + areaQuadrado);
		
		
		double areaRetangulo = Quadrilatero.area(5, 5);
		System.out.println("�rea do ret�ngulo: " + areaRetangulo);
		
		
		double areaTrapezio = Quadrilatero.area(8, 9, 2);
		System.out.println("�rea do ret�ngulo: " + areaTrapezio);
		
		double areaLosango = Quadrilatero.area(3, 3);
		System.out.println("�rea do losango: " + areaLosango);
		
		
		//quando era void
//		System.out.println("Exerc�cio quadril�tero");
//		Quadrilatero.area(3);
//		Quadrilatero.area(5d,5d);
//		Quadrilatero.area(7, 8, 9);
//		Quadrilatero.area(3f, 4f);
	}

}



