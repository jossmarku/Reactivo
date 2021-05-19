package reactivo;

public class Reactivo {

    public static void main(String[] args) {
        
        trabajosTl usuario001 = new trabajosTl("developper", "desarrollo de aplicaciones", "programacion web", 2, "Jr");
        
        System.out.println("Los datos del usuario001 son: " + usuario001.toString());
        System.out.println("El sueldo establecido para el usuario001 es: " + usuario001.sueldo());
        
        
        trabajosTl usuario002 = new trabajosTl("designer", "desarrollo de aplicaciones", "base de datos", 3, "Boss");
        
        System.out.println(" ");
        System.out.println("Los datos del usuario002 son: " + usuario002.toString());
        System.out.println("El sueldo del usuario002 es: " + usuario002.sueldo());
        
        trabajosTl usuario003 = new trabajosTl("telecom", "desarrollo de aplicaciones", "configuracion de servidores", 1, "Leader");
        
        System.out.println(" ");
        System.out.println("Los datos del usuario003 son: " + usuario003.toString());
        System.out.println("El sueldo del usuario003 es: " + usuario003.sueldo());
        
    }
}
