package Operadores;

public class Operadores {
	public static void main(String[] args) {
		String concatenacao = "?";
		
		concatenacao = 1+1+1+"1";
		
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+1;
		
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+"1";
		
		System.out.println(concatenacao);
		
		concatenacao = "1"+1+1+1;
		
		System.out.println(concatenacao);
		
		concatenacao = "1"+(1+1+1);
		
		System.out.println(concatenacao);
		
		int numero = 5;
		
		numero++;
		//numero = numero +1;
		
		System.out.println(numero);
		
		boolean variavel = true;
		
		variavel = !variavel;
		
		System.out.println(variavel);
		
		int a, b;
		
		a = 6;
		b = 9;
		
		int Resultado =  a == b ? 1 : 0;
		
		System.out.println(Resultado);
		
		String nomeUm = "Renan";
		String nomeDois = new String("Renan");
		
		System.out.println(nomeUm.equals(nomeDois));
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 != numero2;
		
		System.out.println("numeroUm é diferente a numeroDois? " + simNao);
		
		boolean condicao=true;
		
		boolean condicao2=false;
		
		if(condicao && ( 7 > 4)) {
			System.out.println("as duas condições são verdadeiras");
		}
		
		if(condicao || condicao2) {
			System.out.println("Uma das condições é verdadeira");
		}
		
		System.out.println("Fim");
	}
}
