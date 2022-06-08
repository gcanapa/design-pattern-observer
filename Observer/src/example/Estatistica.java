package example;

import java.util.ArrayList;

public class Estatistica implements Observador {

    @Override
    public void executarAcao(ArrayList<Integer> numeros) {
        System.out.println("FUI NOTIFICADO!!");
        System.out.println("Recebi os seguintes itens na notificacao: " + numeros);
    }
    
}
