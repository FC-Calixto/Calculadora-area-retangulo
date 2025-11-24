import java.util.Scanner;

public class CalculaAreaRetangulo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = 0;
        double altura = 0;
        boolean validoBase = false;
        boolean validoAltura = false;

        while (!validoBase) {

            //Solicitar a entradaBase do retângulo
            System.out.println("Digite a medida da base do retângulo em metros (até 2 casas decimais): ");
            String entradaBase = scanner.nextLine();

            //Normalizar entrada com , ou . na medida com casas decimais
            entradaBase = entradaBase.replace(',','.');

            try {
                //Converter entrada para double
                base = Double.parseDouble(entradaBase);

                //Verifica limite de 2 casas decimais
                if (entradaBase.matches("\\d+(\\.\\d{1,2})?") && base > 0) {
                    validoBase = true;
                } else {
                    System.out.println("Erro: Informe um número positivo com até duas casas decimais.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Digite apenas números decimais");
            }
        }

        while (!validoAltura) {

        //Solicitar a entradaAltura do retângulo
        System.out.println("Digite a medida da altura do retângulo em metros (até 2 casas decimais): ");
        String entradaAltura = scanner.nextLine();

        //Normalizar entrada com , ou . na medida com casas decimais
        entradaAltura = entradaAltura.replace(',','.');

        try {
            //Converter entrada para double
            altura = Double.parseDouble(entradaAltura);

            //Verifica limite de 2 casas decimais
            if (entradaAltura.matches("\\d+(\\.\\d{1,2})?") && altura > 0) {
                validoAltura = true;
            } else {
                System.out.println("Erro: Informe um número positivo com até duas casas decimais.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Digite apenas números decimais");
        }
    }

        //Calcular a área do retângulo
        double area = base * altura;

        //Exibir resultado ao usuário utilizando o %.2f m²%n para exibir apenas 2 casas decimais
        System.out.printf("Área do retângulo: %.2f m²%n", area);

        scanner.close();
    }
}