
public class NumerosDivisiveisPor5 {

	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("N�meros div�siveis por 5: " );

		for(int i = 0 ; i < numeros.length; i++) {
			if(numeros[i] % 5 == 0) {
				System.out.println(numeros[i]);
			}
		}
		
	}

}
