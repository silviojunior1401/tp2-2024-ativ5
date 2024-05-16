/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ5;

import java.util.Date;

/**
 *
 * @author Silvio Junior
 */
public class PassagemPedagio {
    private Tag tag;
    private Date horario;
    private String placa;
    private Double tarifa;
    private Integer codPraca;

    public PassagemPedagio(Tag tag, Date horario, String placa, Double tarifa, Integer praca) {
        this.tag = tag;
        this.horario = horario;
        this.placa = placa;
        this.tarifa = tarifa;
        this.codPraca = praca;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getPraca() {
        return codPraca;
    }

    public void setPraca(Integer codPraca) {
        this.codPraca = codPraca;
    }
    
}
