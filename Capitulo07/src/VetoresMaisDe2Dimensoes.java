
public class VetoresMaisDe2Dimensoes {
	public static void main(String[] args) {
		
		Double[] faturamentoJaneiro = new Double[] {15000.0, 20000.0, 30000.0, 40000.0};
		Double[] faturamentoFevereiro = new Double[] {20000.0, 50000.0, 70000.0, 90000.0};
		Double[] faturamentoMarço = new Double[] {30000.0, 90000.0, 70000.0, 120000.0};
		
		
		Double[][] faturamentoAnual = new Double [][] {faturamentoJaneiro, faturamentoFevereiro, faturamentoMarço};
		
		Double[][][] faturamentoQuinquenal = new Double[][][] {faturamentoAnual};
		Double[][][][] faturamentoDaDecasa = new Double[][][][] {faturamentoQuinquenal};
		
		
	
	}
}
