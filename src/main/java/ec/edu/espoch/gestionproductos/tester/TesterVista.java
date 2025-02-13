/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestionproductos.tester;

import ec.edu.espoch.gestionproductos.vista.Vista;

/**
 *
 * @author mundo
 */
public class TesterVista {
    private Vista vista;

    public TesterVista(Vista vista) {
        this.vista = vista;
    }
    
    public void agregrar(){
        System.out.println("Nombre Producto"+vista.getNombre());
        System.out.println("El precio Producto"+vista.getPrecio());
        System.out.println("Su disponibilidad"+vista.getDisponible());
    }
}
