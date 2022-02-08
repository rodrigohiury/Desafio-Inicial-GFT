import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoMedia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println("Cálculo de Média! Informe a primeira nota: ");
        double a = scanner.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double b = scanner.nextDouble();
        double media = ((a*3.5)+(b*7.5))/11;
        System.out.println("Média= " + df.format(media));
        System.out.println();
    }
}
