/** To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streetfighter;
import Personajes.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Docente
 */
public class Streetfighter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    // TODO code application logic here
        JOptionPane.showMessageDialog(null,"Hola Bienvenido a la version 1.0 de Street fighter");
        String personaje = Crear_personaje();
    
    }
    private static String Crear_personaje()
    {
        String personaje=JOptionPane.showInputDialog(null,"Selecciona el numerdo de tu personaje\n1 Ryu\n2 Ken\n3 Chun-li\n4 Guille");
        int personaje1 = Integer.parseInt(personaje);
        switch(personaje1)
        {
            case 1:
                Ryu jugador10=new Ryu("Ryu");
                personaje=jugador10.getNombre();
                JOptionPane.showMessageDialog(null,"Tu personaje es "+jugador10.getNombre()+", tiene un nivel de vida "+jugador10.getVida()+", con ataque "+jugador10.getAtaque()+ " y con defensa" +jugador10.getDefensa());
                break;
            case 2:
                Ken jugador11=new Ken("Ken");
                personaje=jugador11.getNombre();
                JOptionPane.showMessageDialog(null,"Tu personaje es "+jugador11.getNombre()+", tiene un nivel de vida "+jugador11.getVida()+", con ataque "+jugador11.getAtaque()+ " y con defensa" +jugador11.getDefensa());
                break;
            case 3:
                Chunli jugador12=new Chunli("Chun-li");
                personaje=jugador12.getNombre();
                JOptionPane.showMessageDialog(null,"Tu personaje es "+jugador12.getNombre()+", tiene un nivel de vida "+jugador12.getVida()+", con ataque "+jugador12.getAtaque()+ " y con defensa" +jugador12.getDefensa());
                break;
            case 4:
                Chunli jugador13=new Chunli("Chun-li");
                personaje=jugador13.getNombre();
                JOptionPane.showMessageDialog(null,"Tu personaje es "+jugador13.getNombre()+", tiene un nivel de vida "+jugador13.getVida()+", con ataque "+jugador13.getAtaque()+ " y con defensa" +jugador13.getDefensa());
                break;
            default:
                JOptionPane.showMessageDialog(null,"No esta ese personaje");
                personaje=" ";
                break;
        }
        return personaje;
    }

}
