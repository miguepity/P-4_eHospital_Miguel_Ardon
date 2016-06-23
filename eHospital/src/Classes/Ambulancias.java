/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Ambulancias {
    String placa;
    String año;
    int velocidad;

    public Ambulancias() {
    }

    public Ambulancias(String placa, String año, int velocidad) {
        this.placa = placa;
        this.año = año;
        this.velocidad = velocidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Ambulancias{" + "placa=" + placa +'}';
    }
    
    
}
