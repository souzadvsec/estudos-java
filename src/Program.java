import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		// Declaração de variáveis
		// String: armazena texto
		String nome = "Sandro";
		// int: armazena números inteiros
		int idade = 25;
		// double: armazena números decimais
		double salario = 4000.0;

		// Define o padrão de localização para US (usa ponto como separador decimal)
		Locale.setDefault(Locale.US);

		// Exibe as informações formatadas na tela
		// %s = String, %d = inteiro, %.2f = decimal com 2 casas, %n = quebra de linha
		// printf: formata e imprime a string com os valores das variáveis
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais%n", nome, idade, salario);
	}
}
