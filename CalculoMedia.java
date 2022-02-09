/**
        Este programa calcula a média ponderada de duas notas e retorna o resultado
        A primeira nota tem peso 3,5 e a segunda tem peso 7,5.
        Feito para o Desafio 1 do Bootcamp GFT Start #4 Java da DIO
        @author Rodrigo Araújo
        @version 1.0.0
        @since Release 1.0.0
        
        */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoMedia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");    //formata a saída para 5 casas decimais
        System.out.println("Cálculo de Média! Informe a primeira nota: ");
        double a = scanner.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double b = scanner.nextDouble();
        // O Peso da nota a é de 3,5. E o da nota b é 7,5. Total do pesos é 11
        double media = ((a*3.5)+(b*7.5))/11;
        System.out.println("Média= " + df.format(media));
        System.out.println();
    }
}
