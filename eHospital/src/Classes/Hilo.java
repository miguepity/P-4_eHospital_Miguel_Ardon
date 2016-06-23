/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Hilo implements Runnable{
    int tiempo;
    ArrayList<Paramedicos> paramedico;
    ArrayList<Ambulancias> ambulancias;
    Ambulancias ambulancia;
    int i=1;

    public Hilo(ArrayList<Paramedicos> paramedicos,Ambulancias ambulancia) {
        this.tiempo = ambulancia.getVelocidad();
        this.paramedico = paramedicos;
    }

    @Override
    public void run() {
        System.out.println(tiempo+"tiempo");
        System.out.println(i+"conatdasd");
        while (i != tiempo) {
            //bara.setValue(i);
            //bara.repaint();
            i++;
            System.out.println(i+"cakasda");
            try {
                
                Thread.sleep(this.tiempo);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            if(i==tiempo){
                //bara.setValue(100);
                JOptionPane.showMessageDialog(null,"Se atendio la emergencia!!!");
                //bara.setValue(0);
                break;
            }
        }
    }

}
