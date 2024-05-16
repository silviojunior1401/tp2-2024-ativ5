/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ5;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Silvio Junior
 */
public class FaturaService implements PassagemPedagioObserver {

    // private Double totalFaturado;

    Map<Double, Double> totalFinanceiro = new HashMap<>();

    @Override
    public void processarPassagem(PassagemPedagio passagem) {
        this.faturar(passagem);
        this.totalFinanceiroTag(passagem.getTag());
    }

    public void faturar(PassagemPedagio passagem) {
        Double tarifaAcumulada = 0D;
        Double codigoTag = passagem.getTag().getCodigo();

        System.out.println("faturar....");

        if (this.totalFinanceiro.containsKey(codigoTag)) {
            tarifaAcumulada = this.totalFinanceiro.get(codigoTag);
        }

        this.totalFinanceiro.put(codigoTag, passagem.getTarifa() + tarifaAcumulada);
    }

    public void totalFinanceiroTag(Tag tag) {
        System.out.println("Total faturado na tag: " + this.totalFinanceiro.get(tag.getCodigo()));
    }

}
