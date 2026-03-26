import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Define o padrão de localização como US (usa ponto como separador decimal)
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para ler dados do teclado
		Scanner sc = new Scanner(System.in);

		// Declara variáveis para armazenar nome, idade e salário
		String x;
		int y;
		double z;

		// Solicita e lê o nome do usuário
		System.out.println("Digite o nome: ");
		x = sc.next();

		// Solicita e lê a idade do usuário
		System.out.println("Digite a idade: ");
		y = sc.nextInt();

		// Solicita e lê o salário do usuário
		System.out.println("Digite o salario: ");
		z = sc.nextDouble();

		// Exibe as informações formatadas
		System.out.printf("%s tem %d anos e recebe %.2f reais.%n", x, y, z);

		// Fecha o Scanner para liberar recursos
		sc.close();
	}
}
