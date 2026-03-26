/*public class Program {

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		System.out.println("Good!");
	}
}

 
import java.util.Locale;

public class Program {
	public static void main() {
		double x = 10.127890;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros\n", x);
	}
}

*/

import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		String nome = "Beatrice";
		int idade = 20;
		double salario = 4000.0;
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais%n", nome, idade, salario);
	}
}
