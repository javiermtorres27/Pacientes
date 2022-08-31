/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro_Pacientes_Doctores;

public class Paciente extends Persona {

    private Integer edad;

    public Paciente(String nombre, String cedula, String ciudad, String eps, Integer edad) {
        super(nombre, cedula, ciudad, eps);
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean clasificarEdad(int edad) {
        return this.getEdad() > 30 && this.getEdad() <= 60;
    }

    @Override
    public String mostrar() {
        return super.toString() + " " + edad;
    }

}
