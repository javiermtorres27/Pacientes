/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro_Pacientes_Doctores;

public class Medico extends Persona{
    
    private String especialidad;

    public Medico(String nombre, String cedula, String ciudad, String eps, String especialidad) {
        super(nombre, cedula, ciudad, eps);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    @Override
    public String mostrar(){
        return super.toString()+" "+super.getEps()+" "+especialidad;
            
    }
    
    public String paciente(){
        return this.getCedula();
    }
    
}
