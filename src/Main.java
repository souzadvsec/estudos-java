import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Para fazer entrada de dados.

		String x;
		int y;
		double z;

		System.out.println("Digite o nome: ");
		x = sc.next(); // para strings.
		System.out.println("Digite a idade: ");
		y = sc.nextInt(); // para numeros inteiros.
		System.out.println("Digite o salario: ");
		z = sc.nextDouble(); // para numeros decimais.

		System.out.printf("%s tem %d anos e recebe %.2f reais.%n", x, y, z);

		sc.close();
	}
}
