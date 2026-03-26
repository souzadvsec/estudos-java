import java.util.Locale;

public class segundo_programa {

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
