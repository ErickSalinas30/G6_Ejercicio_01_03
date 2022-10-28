/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author usuario
 */
public class Estudiante extends Persona{
    private String cedula;
    private int cicloCurso;
    
    public Estudiante(String nombre,int fN,String cI,int cC){
        this.cedula=cI;
        this.cicloCurso=cC;
        
    }
    
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCicloCurso() {
        return cicloCurso;
    }

    public void setCicloCurso(int cicloCurso) {
        this.cicloCurso = cicloCurso;
    }

    @Override
    public String mostrarInfo() {
        return "El nombre del estudiante es "+this.getNombre()+" nacido en el año"
                +this.getfNacimiento()+" con numero de cedula: "+this.cedula+" en el ciclo numero"
                +this.cicloCurso;
    }
    
    
    
    
}
