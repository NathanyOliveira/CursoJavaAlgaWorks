package sobrecarga;

public class Quadrilatero {
	
	public static Double  area(double lado) {
		// quando era void //System.out.println("�rea do quadrado: " + );
		return lado * lado;
	}
	
	public static Double area(double lado1, double lado2) {
		//System.out.println("�rea do ret�ngulo: " + lado1 * lado2);
		return lado1 * lado2;
	}
	
	public static Double area(double baseMaior, double baseMenor, double altura) {
		//System.out.println("�rea do trap�zio: " + (baseMaior+baseMenor)*altura / 2);
		return (baseMaior+baseMenor)*altura / 2;
	}

	public static Float area(float diagonal1, float diagonal2) {
		//System.out.println("�rea losango: " + (diagonal1*diagonal2) / 2);
		return ((diagonal1*diagonal2) / 2);
	}
}
