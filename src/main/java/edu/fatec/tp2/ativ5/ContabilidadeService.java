/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ5;

/**
 *
 * @author Silvio Junior
 */
public class ContabilidadeService implements PassagemPedagioObserver {

    @Override
    public void processarPassagem(PassagemPedagio passagem) {
        this.enviarContabilidade();
    }
    
    public void enviarContabilidade() {
        System.out.println("ir para contabilidade....");
        //TODO: implements contabilidade component
    }
    
}
