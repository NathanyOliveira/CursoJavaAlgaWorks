
public class Vetores2Dimensoes {
	public static void main(String[] args) {
		
		Double[] faturamentoJaneiro = new Double[] {15000.0, 20000.0, 30000.0, 40000.0};
		Double[] faturamentoFevereiro = new Double[] {20000.0, 50000.0, 70000.0, 90000.0};
		Double[] faturamentoMar�o = new Double[] {30000.0, 90000.0, 70000.0, 120000.0};
		
		
		Double[][] faturamentoAnual = new Double [][] {faturamentoJaneiro, faturamentoFevereiro, faturamentoMar�o};
		
//		System.out.println("Faturamento do dia 1 de janeiro: " + faturamentoAnual[0][0]);
//		System.out.println("Faturamento do dia 2 de janeiro: " + faturamentoAnual[0][1]);
//		System.out.println("Faturamento do dia 3 de fevereiro: " + faturamentoAnual[1][2]);
//		System.out.println("Faturamento do dia 2 de mar�o: " + faturamentoAnual[2][2]);
		
		for(int i = 0; i < faturamentoAnual.length ; i++) {
			System.out.println("M�s: " + (i+1));
			
			Double[] mes = faturamentoAnual[i];
			
			for(int y = 0; y < mes.length ; y++) {
				Double dia = mes[y]; //double dia = faturamentoAnual[i][y];
				System.out.println("Dia " + (y+1) + ": " + dia);
			}
		}
		
		
	}
}
