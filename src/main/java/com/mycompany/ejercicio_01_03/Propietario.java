/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author usuario
 */
public class Propietario extends Persona{
    private String cedula;
    private int edad;
    

    public Propietario(String nombre, int fN,String cedula,int edad){
        this.getNombre();
        this.getfNacimiento();
        this.cedula=cedula;
        this.edad=edad;
        
    }
    
    
            
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String mostrarInfo() {
        return "El nombre del propietario es "+this.getNombre()+" nacido en al año"
                +this.getfNacimiento()+" con cedula de identidad"+this.cedula
                +" y con una edad de "+this.edad;
    }
    
    
    
}
