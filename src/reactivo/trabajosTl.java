package reactivo;

public class trabajosTl {
    
    private String nombre;
    private String descripcion;
    private String habilidades;
    private int experiencia;
    private String nivel;
    
    public trabajosTl() {
    }

    public trabajosTl(String nombre, String descripcion, String habilidades, int experiencia, String nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.nivel = nivel;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /* NOTA: Al tratarse de un método int, la operación experiencia / 10 siempre dará como resultado un valor entero.
    Dicho esto, es importante saber que al añadir valores menores a 10, el resultado de la división será 0. */
    public int sueldo() {
        
        int salario = 0;
        switch  (nivel) {
            case "Jr":
                salario = 1000 * (1 + (experiencia / 10));
                break;
            case "Sr":
                salario = 1500 * (1 + (experiencia / 10));
                break;
            case "Leader":
                salario = 2000 * (1 + (experiencia / 10));
                break;
            case "Boss":
                salario = 2500 * (1 + (experiencia / 10));
                break;
        }
        
        return salario;   
    }

    @Override
    public String toString() {
        return "trabajosTl{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", habilidades=" + habilidades + ", experiencia=" + experiencia + ", nivel=" + nivel + '}';
    }
     
}
