/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author usuario
 */
public class Asignatura {
    private String nombre;
    private int nGrado;
    private String dificultad;
    
    
    public Asignatura(String nA,int nGrad,String df){
        this.nombre=nA;
        this.nGrado=nGrad;
        this.dificultad=df;
        
        
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnGrado() {
        return nGrado;
    }

    public void setnGrado(int nGrado) {
        this.nGrado = nGrado;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    
}
