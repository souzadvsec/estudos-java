import java.util.Scanner;

public class ex34 {
	public static void main(String[] args) {

		// Criar um objeto Scanner para ler entrada do usuário
		Scanner sc = new Scanner(System.in);

		// Declarar variáveis para armazenar strings e um inteiro
		String s1, s2, s3;
		int x;

		// Ler um número inteiro do usuário
		x = sc.nextInt();
		// Consumir a quebra de linha deixada pelo nextInt()
		sc.nextLine();
		// Ler três strings do usuário
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		// Exibir os dados digitados
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// Fechar o Scanner para liberar recursos
		sc.close();
	}

}
