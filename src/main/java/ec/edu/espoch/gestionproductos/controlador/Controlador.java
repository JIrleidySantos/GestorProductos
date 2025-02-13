/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestionproductos.controlador;

import ec.edu.espoch.gestionproductos.modelo.GestorProductos;
import ec.edu.espoch.gestionproductos.modelo.Producto;
import ec.edu.espoch.gestionproductos.tester.TesterControlador;
import ec.edu.espoch.gestionproductos.vista.Vista;

/**
 *
 * @author mundo
 */
public class Controlador {
   private Vista vista;
   private TesterControlador gestorProductos;
   private GestorProductos modelo;
   

    public Controlador(Vista vista) {
        this.vista = vista;
        this.gestorProductos=new TesterControlador();
    }
   
    public void agregarProducto(){
        try {
            if (this.vista != null) {    
            Producto objProducto = new Producto();
            objProducto.setNombre(this.vista.getNombre());
            objProducto.setDisponible(this.vista.getDisponible());
            objProducto.setPrecio(this.vista.getPrecio());
            gestorProductos.prueba(objProducto);
            }else{
                vista.error("Completa los datos!");
            }
            
        } catch (Exception e) {
            vista.error("Consulta al ing Pedro ;)");
        }
    }
    
    
}
