/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ5;

/**
 *
 * @author Silvio Junior
 */
public class AnalyticsService implements PassagemPedagioObserver {

    @Override
    public void processarPassagem(PassagemPedagio passagem) {
        this.fazerAnalytics();
    }
    
    public void fazerAnalytics() {
        System.out.println("fazer BI....");
        //TODO: implements analytics component
    }
    
}
