package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Algo que pode ser observado
        Lista lista = new Lista();

        //Algo que observa
        Estatistica e = new Estatistica();

        lista.adicionarObservador(e);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("Digite um numero: ");
            int i = scanner.nextInt();
            lista.adicionarNumero(i);
        }

    }
}
