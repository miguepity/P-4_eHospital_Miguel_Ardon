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
public class Paramedicos {
    String nombre_completo;
    int edad;
    String ID;
    String ranking;

    public Paramedicos() {
    }

    public Paramedicos(String nombre_completo, int edad, String ID, String ranking) {
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.ID = ID;
        this.ranking = ranking;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre_completo + ", ranking=" + ranking;
    }
}
