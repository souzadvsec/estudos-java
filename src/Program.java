import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		String nome = "Sandro";
		int idade = 25;
		double salario = 4000.0;
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais%n", nome, idade, salario);
	}
}
