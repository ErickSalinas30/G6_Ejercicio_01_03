/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author usuario
 */
public class Matricula {
    private String material;
    private String nPlaca;
    
    public Matricula(String material,String nP){
        this.material=material;
        this.nPlaca=nP;
    }
    
    public String mostrarInfoMatricula(){
        return "El vehiculo esta hecho de "+this.material+" y su placa es "+this.nPlaca;
    }
    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }
    
    
    
}
