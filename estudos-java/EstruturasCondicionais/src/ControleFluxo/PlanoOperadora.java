package ControleFluxo;

public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M";
		
		switch (plano) {
		case "T": {
			System.out.println("5gb youtube");
			break;
		}
		case "M": {
			System.out.println("Whatsapp e instagram grátis");
			break;
		}
		case "B": {
			System.out.println("100 minutos de ligação");
			break;
		}
		}
	}
}
