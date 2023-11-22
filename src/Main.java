import exercicio4.IdadeException;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IdadeException {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Informe sua idade: ");
        double age = Double.parseDouble(scan.nextLine());

        if(age <= 0 || age > 100){
            throw new IdadeException("Idade inválida!");
        }
    }
}