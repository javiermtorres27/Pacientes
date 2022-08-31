/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro_Pacientes_Doctores;

public class Medico extends Persona {

    private String idEspecialidad;

    public Medico(String nombre, String cedula, String idCiudad, String idEps, String idEspecialidad) {
        super(nombre, cedula, idCiudad, idEps);
        this.idEspecialidad = idEspecialidad;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(String idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    @Override
    public String mostrar() {
        return super.toString() + " " + idEspecialidad;

    }

    public String paciente() {
        return this.getCedula();
    }

}
