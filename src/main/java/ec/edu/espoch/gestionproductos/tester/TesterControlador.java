/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestionproductos.tester;

import ec.edu.espoch.gestionproductos.modelo.Producto;

/**
 *
 * @author USUARIO
 */
public class TesterControlador {
    
        
    public void prueba(Producto objProducto){
        
       System.out.println("Nombre: "+ objProducto.getNombre());
        System.out.println("Precio: "+objProducto.getPrecio());
        System.out.println("Estado: "+objProducto.isDisponible());
        
    }
    
}
