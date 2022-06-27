package sobrecarga;

public class Sobrecarga {

	public static void  main(String[] args) {
			//quadrilatero
		//com retorno
		
		System.out.println("retornos");
		
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);
		
		
		double areaRetangulo = Quadrilatero.area(5, 5);
		System.out.println("Área do retângulo: " + areaRetangulo);
		
		
		double areaTrapezio = Quadrilatero.area(8, 9, 2);
		System.out.println("Área do retângulo: " + areaTrapezio);
		
		double areaLosango = Quadrilatero.area(3, 3);
		System.out.println("Área do losango: " + areaLosango);
		
		
		//quando era void
//		System.out.println("Exercício quadrilátero");
//		Quadrilatero.area(3);
//		Quadrilatero.area(5d,5d);
//		Quadrilatero.area(7, 8, 9);
//		Quadrilatero.area(3f, 4f);
	}

}



