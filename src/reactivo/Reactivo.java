/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reactivo;

/**
 *
 * @author Personal
 */
public class Reactivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        trabajosTl usuario001 = new trabajosTl("developper", "desarrollo de aplicaciones", "programacion", 3, "Jr", 0);
        
        System.out.println(usuario001.sueldo());
        System.out.println(" ");
        System.out.println(usuario001.toString());
    }
    
}
