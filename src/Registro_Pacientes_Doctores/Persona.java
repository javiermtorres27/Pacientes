/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro_Pacientes_Doctores;

public class Persona {
    
    private Integer id;
    private String nombre;
    private String cedula;
    private String ciudad;
    private String eps;
    

    public Persona(String nombre, String cedula, String ciudad, String eps) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.eps = eps;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }
    
    @Override
    public String toString(){
        return nombre+" "+cedula;
    }
    
    public String mostrar(){
        return this.toString();
    }
    
}
