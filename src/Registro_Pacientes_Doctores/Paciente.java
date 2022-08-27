/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro_Pacientes_Doctores;

public class Paciente extends Persona{
    
    static int contadorPacientes = 0;
    private int edad;
    private String ciudad;
    private String enfermedad;
    
    private int medicoAsignado;

    public int getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(int medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    public Paciente(String eps, String enfermedad, String nombre, String cedula, int edad, String ciudad, int medicoAsignado) {
        super(nombre, cedula, eps);
        this.edad = edad;
        this.ciudad = ciudad;
        this.enfermedad = enfermedad;
        this.medicoAsignado = medicoAsignado;
    }

    public static int getContadorPacientes() {
        return contadorPacientes;
    }

    public static void setContadorPacientes(int contador) {
        Paciente.contadorPacientes = contador;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public boolean clasificarEdad(int edad){
        if(super.getNombre().equals("javier")){
            
        }
        
        return (edad>30 && edad<=60);
    }
    
    @Override
    public String mostrar(){
       return super.toString()+" "+edad+" "+ciudad+" "+super.getEps()+" "+enfermedad;
       
       
       
    }
    
}
