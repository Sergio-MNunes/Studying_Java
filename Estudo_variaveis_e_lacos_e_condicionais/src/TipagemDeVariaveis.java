
public class TipagemDeVariaveis {

	public static void main (String[] args) {
		
		// Estes s�o os tipos de vari�veis primitivos que existem no java:
		int idade = 25;
		double salario = 1500.90;
		float pi = 3.14f; // No tipo float, precisamos informar explicitamente que o n�mero atribu�do � vari�vel � um float, colocando um "f" no final.
		long inteiroLongo = 234234234l; // O mesmo acontece para o tipo long. Precisamos declarar que a atribui��o � um tipo long com o "l" no final. Long � usado para n�meros muito grandes.
		short inteiroPequeno = 1500; // O short � usado para n�meros pequenos.
		byte inteiroMenorAinda = 122; // Byte � usado para n�meros muito pequenos, at� 256.
		boolean verdadeiroOuFalso = false;
		
		System.out.println("Ol�, a minha idade � "+ idade + " e eu ganho R$" + salario + " por m�s.");
		System.out.println(pi);
		System.out.println(inteiroLongo);
		System.out.println(inteiroPequeno);
		System.out.println(inteiroMenorAinda);
		System.out.println(verdadeiroOuFalso);
		
		// N�o se usa o tipo double para fazer opera��es com os n�meros em algumas situa��es. Veja o resultado da soma abaixo e pesquise ela no google.
		double numero1 = 0.1;
		double numero2 = 0.2;
		System.out.println(numero1 + numero2);
		
		// Pense na seguinte situa��o: quando queremos converter um tipo int para um double, n�o existe problema, pois o tipo double comporta o int. Veja abaixo:
		int intQualquer = 5;
		double doubleQualquer = intQualquer;
		System.out.println(doubleQualquer);
		
		// N�o deu problema nenhum. Mas, quando queremos converter um double para int, a� sim o compilador reclama, pois uma vari�vel do tipo double n�o cabe numa do tipo int.
		
		// Se quisermos for�ar essa atribui��o, cientes de que perderemos informa��o na convers�o, usamos o conceito de cast. Veja abaixo:
		double doubleTemperatura = 24.5;
		int intTemperatura = (int) doubleTemperatura;
		System.out.println(intTemperatura);
		
		// Percebeu? Perdemos a casa decimal na convers�o, que foi feita utilizando o cast (int).
		
		// Estas situa��es s�o criadas por conta do tamanho de cada tipo de vari�vel do java, conforme a tabela abaixo:

		// TIPO	    TAMANHO
		// boolean	1 bit
		// byte	    1 byte
		// short	2 bytes
		// char	    2 bytes
		// int	    4 bytes
		// float	4 bytes
		// long	    8 bytes
		// double	8 bytes
	}
}
