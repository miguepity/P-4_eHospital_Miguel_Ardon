/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Complejo_Hospitalario {

    String nombre;
    String direccion;
    int capacidad_paramedicos;
    int ambulancias_maximas;
    String ranking;
    ArrayList<Paramedicos> paramedicos = new ArrayList();
    ArrayList<Ambulancias> ambulancias = new ArrayList();

    public Complejo_Hospitalario() {
    }

    public Complejo_Hospitalario(String nombre, String direccion, int capacidad_paramedicos, int ambulancias_maximas, String ranking,ArrayList<Paramedicos> paramedicos,ArrayList<Ambulancias> ambulancias) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad_paramedicos = capacidad_paramedicos;
        this.ambulancias_maximas = ambulancias_maximas;
        this.ranking = ranking;
        this.paramedicos = paramedicos;
        this.ambulancias = ambulancias;
    }

    public ArrayList<Paramedicos> getParamedicos() {
        return paramedicos;
    }

    public void setParamedicos(ArrayList<Paramedicos> paramedicos) {
        if(paramedicos.size()>capacidad_paramedicos){
            JOptionPane.showMessageDialog(null, "No se puede agregar porque excede la cantidad de paramedicos", "Eroor",WIDTH);
        }else{
            this.paramedicos = paramedicos;
        }
    }

    public ArrayList<Ambulancias> getAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(ArrayList<Ambulancias> ambulancias) {
        this.ambulancias = ambulancias;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad_paramedicos() {
        return capacidad_paramedicos;
    }

    public void setCapacidad_paramedicos(int capacidad_paramedicos) {
        this.capacidad_paramedicos = capacidad_paramedicos;
    }

    public int getAmbulancias_maximas() {
        return ambulancias_maximas;
    }

    public void setAmbulancias_maximas(int ambulancias_maximas) {
        this.ambulancias_maximas = ambulancias_maximas;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Complejo_Hospitalario{" + "nombre=" + nombre + ", ranking=" + ranking + '}';
    }
}
