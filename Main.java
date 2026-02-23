package SistemaDeliveryParte1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();
        Restaurante restaurante2 = new Restaurante();

        System.out.println("Digite os nomes do restaurante");
        System.out.println("1° Restaurante");
        restaurante.nome = sc.nextLine();
        System.out.println("2° Restaurante");
        restaurante2.nome = sc.nextLine();

        System.out.println("Digite os endereços dos restaurantes");
        System.out.println("1° Restaurante");
        restaurante.endereco = sc.nextLine();
        System.out.println("2° Restaurante");
        restaurante2.endereco = sc.nextLine();

        System.out.println("Digite a categoria dos restaurante (Ex: Massas, Mexicano, Italiano)");
        System.out.println("1° Restaurante");
        restaurante.categoria = sc.nextLine();
        System.out.println("2° Restaurante");

        restaurante2.categoria = sc.nextLine();
        System.out.println("Informações 1° restaurante");
        restaurante.MostrarInformacoes();
        System.out.println("Informações 2° restaurante");
        restaurante2.MostrarInformacoes();
    }
}
