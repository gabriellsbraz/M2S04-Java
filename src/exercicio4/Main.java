package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isIdadeValida = false;

        do {
            System.out.println("Informe sua idade: ");
            int idade = scan.nextInt();
            try {
                validarIdade(idade);
                System.out.println("Olá, você tem " + idade +" anos de idade!");
                isIdadeValida = true;
            } catch (IdadeException e){
                System.out.println(e.getMessage());
            }
        } while (!isIdadeValida);
    }

    private static void validarIdade(int idade) throws IdadeException {
        if (idade <= 0 || idade > 100)
            throw new IdadeException("Você informou uma idade inválida! Tente novamente.");
    }
}
