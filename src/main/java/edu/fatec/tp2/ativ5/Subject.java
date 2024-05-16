/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.fatec.tp2.ativ5;

/**
 *
 * @author Silvio Junior
 */
public interface Subject {
    
    public void register(Observer observer);
    
    public void removeRegister(Observer observer);
    
    public void notifyObservers();
}
