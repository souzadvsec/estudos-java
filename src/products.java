import java.util.Locale; // Importa a biblioteca para configurar regionalização (como o ponto decimal)

public class products {
	public static void main(String[] args) {

		// --- Declaração de Variáveis ---
		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F'; // 'char' armazena um único caractere entre aspas simples

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		// --- Saída de Dados ---

		System.out.println("Products");

		// %s = String | %.2f = Double com 2 casas decimais | %n = Quebra de linha
		System.out.printf("%s, wich price is $ %.2f%n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f%n", product2, price2);

		System.out.println(); // Linha em branco para organizar a saída

		// %d = Inteiro (digit) | %c = Caractere
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);

		System.out.println();

		// Exemplo de controle de precisão de casas decimais
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);

		// Mudando a localização para o padrão dos EUA (usa ponto em vez de vírgula)
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}
}