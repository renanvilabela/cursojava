package ControleFluxo;

public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 3;
		
		if(nota >= 7)
			System.out.println("Aprovado");
		
		else if (nota >=5 && nota < 7)
			System.out.println("Prova recuperação");
		
		else
			System.out.println("Reprovado");
	}
}
