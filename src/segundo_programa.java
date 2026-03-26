import java.util.Locale;

public class segundo_programa {

    public static void main(String[] args) {
        // Declaração de uma variável double com valor inicial
        double x = 10.127890;

        // Exibe o valor original sem formatação
        System.out.println(x);

        // Exibe o valor formatado com 2 casas decimais (padrão da máquina)
        System.out.printf("%.2f%n", x);

        // Define o locale padrão como US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Exibe o valor formatado com 2 casas decimais no padrão US
        System.out.printf("%.2f%n", x);

        // Exibe o valor com concatenação de strings
        System.out.println("RESULTADO = " + x + " METROS");

        // Exibe o valor formatado com 2 casas decimais usando printf
        System.out.printf("RESULTADO = %.2f metros\n", x);
    }
}
