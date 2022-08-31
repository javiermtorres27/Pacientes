/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro_Pacientes_Doctores;

public class Persona {

    private Integer id;
    private String nombre;
    private String cedula;
    private String idCiudad;
    private String idEps;

    public Persona(String nombre, String cedula, String idCiudad, String idEps) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.idCiudad = idCiudad;
        this.idEps = idEps;
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

    public String getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(String idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getIdEps() {
        return idEps;
    }

    public void setIdEps(String idEps) {
        this.idEps = idEps;
    }

    @Override
    public String toString() {
        return nombre + " " + cedula + " " + idCiudad + " " + idEps;
    }

    public String mostrar() {
        return this.toString();
    }

}
