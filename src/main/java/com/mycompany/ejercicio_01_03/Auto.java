/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_03;

/**
 *
 * @author usuario
 */
public class Auto {
    private double precio;
    private String color;
    private String marca;
    private Propietario boss;
    
    public Auto(double precio,String color,String marca){
        this.precio=precio;
        this.color=color;
        this.marca=marca;
        
        
                
    }

    public String mostrarInfoVehiculo(){
        return "El precio del carro es"+this.precio+" pintado de un color"
                +this.color+" y de la marca "+this.marca;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Propietario getBoss() {
        return boss;
    }

    public void setBoss(Propietario boss) {
        this.boss = boss;
    }
    
    
            
            
}
