package example;

import java.util.ArrayList;

public class Lista {
    public ArrayList<Integer> numeros = new ArrayList<>();
    public ArrayList<Observador> observadores = new ArrayList<>();

    public void adicionarNumero(int n){
        numeros.add(n);
        notificarObservador();
    }

    public void adicionarObservador(Observador o){
        if(!observadores.contains(o)){
            observadores.add(o);
        }
    }

    public void removerObservador(Observador o){
        observadores.remove(o);
    }

    public void notificarObservador(){
        for(Observador o : observadores){
            o.executarAcao(numeros);
        }
    }

    @Override
    public String toString() {
        return "Numeros atuais: " + numeros; 
    }
}
