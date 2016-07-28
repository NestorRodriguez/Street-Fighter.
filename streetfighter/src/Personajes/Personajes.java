/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import javax.swing.JOptionPane;

/**
 *
 * @author Docente
 */
class Personajes {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    public boolean turno;
    
    public Personajes (String Nombre)
    {
        this.nombre=Nombre;
        this.vida=50;
        this.ataque=12;
        this.defensa=15;
        this.turno=true;
    }
    public void golpe()
    {
        JOptionPane.showMessageDialog(null,"Personaje "+getNombre()+" lanza un golpe de "+getAtaque()+" de daño.");
    }
    
    public void Informe()
    {
       // JOptionPane.showMessageDialog(null,"Tu personaje es "+getNombre()+", tiene un nivel de vida "+getVida()+", con ataque "+getAtaque()+ " y con defensa" +getDefensa());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    /*public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }*/

    
}
