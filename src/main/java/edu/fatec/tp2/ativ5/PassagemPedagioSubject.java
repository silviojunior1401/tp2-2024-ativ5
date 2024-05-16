/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author junin
 */
public class PassagemPedagioSubject implements Subject {

    private List<Observer> observersList = new ArrayList<>();

    private PassagemPedagio novaPassagem;
    @Override
    public void register(Observer observer) {
        this.observersList.add(observer);
    }

    @Override
    public void removeRegister(Observer observer) {
        this.observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observersList) {
            if (o instanceof PassagemPedagioObserver) {
                PassagemPedagioObserver passagemPedagioObserver = (PassagemPedagioObserver) o;
                passagemPedagioObserver.processarPassagem(this.novaPassagem);
            }
        }
    }
    
    public void criarPedagio(PassagemPedagio p) {
        this.novaPassagem = p;
        this.notifyObservers();
    }

}
