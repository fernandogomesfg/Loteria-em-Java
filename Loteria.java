package loteria;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fernando Gomes
 */
public class Loteria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random numeroGerado = new Random();

        //Declarando os vectores
        int vector[] = new int[5];
        int numDaSorte[] = new int[5];

        //Pedindo ao usuario para digitar os 5 numeros da sorte no intervalo de 0 -50
        System.out.println("Digite seus numeros da sorte no intervalo de 0-50");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            numDaSorte[i] = teclado.nextInt();
        }

        //Mostrando os numeros digitados pelo usuario
        for (int n : numDaSorte) {
            //System.out.println("Numero escolhidos pelo usuario: " + n);
        }
        System.out.println();

        //Numeros gerados pelo radom
        for (int i = 0; i < vector.length; i++) {
            //Gera numeros aleatorios de 0-50
            vector[i] = numeroGerado.nextInt(51);

            //Mostra os 5 numeros gerados
            System.out.println("Os valores gerados sao:" + vector[i]);
        }

        //Fazendo as comparacoes dos valores digitados e gerados
        System.out.println();
        if (Arrays.equals(vector, numDaSorte)) {
            System.out.println("Voce ganhou");
        } else {
            System.out.println("Voce Perdeu");
        }
    }

}
