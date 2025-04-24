import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        //Declaração de variávais
        double cel, fah; //cel - temperatura em graus celsius; fah - temperatura em graus fahrenheit

        //Criação e instâcia de objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação do programa
        System.out.println("\n\t\t\t -- Conversor -- \n");
        
        //Entradas
        System.out.println("Informe a temperatura em ºC: ");
        cel = entrada.nextDouble();

        //Processamento
        fah = cel * 9 / 5 + 32;

        //Saída
        System.out.println("\n" + cel + "ºC =" + fah + "ºF\n");
    }
}
