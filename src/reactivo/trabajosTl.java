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
public class trabajosTl {
    
    String nombre = " ";
    String descripcion = " ";
    String habilidades = " ";
    int experiencia = 0;
    String nivel = " ";
    int salario = 0;
    
    public trabajosTl() {
    }

    public trabajosTl(String nombre, String descipcion, String habilidades, int experiencia, String nivel, int salario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.habilidades = habilidades;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.salario = salario;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    int sueldo() {
        
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
        return "trabajosTl{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", habilidades=" + habilidades + ", experiencia=" + experiencia + ", nivel=" + nivel + ", salario=" + salario + '}';
    }
     
}
