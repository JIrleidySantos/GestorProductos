/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestionproductos.modelo;

/**
 *
 * @author mundo
 */
public class GestorProductos {
    
    int tamañoVector =5;
    Producto[] objProductos= new Producto [tamañoVector];
    
    public String agregarProducto (Producto producto){
    int cont=0;
    String msg ="Producto ingresado";
    Producto[] objProductos = new Producto[5];
    for (int i = 0; i < objProductos.length; i++) {
        if (objProductos[i]== null) {
            objProductos [i].setId(i++);
            objProductos [i].setNombre(producto.getNombre());
            objProductos [i].setPrecio(producto.getPrecio());
            objProductos [i].setDisponible(producto.isDisponible());
            }else{
                cont++;
            }
        } if(cont==objProductos.length){
            msg = "Espacio en la lista insuficiente";
        }
        
        return msg;
            
        }
    
    public Producto[] listarProductos(){
        Producto[] assistProductos = new Producto [tamañoVector];
        for (int i = 0; i < objProductos.length; i++ ){
            if (objProductos[i].isDisponible()){
                assistProductos[i].setId(objProductos[i].getId());
                assistProductos[i].setNombre(objProductos[i].getNombre());
                assistProductos[i].setPrecio(objProductos[i].getPrecio());
                assistProductos[i].setDisponible(objProductos[i].isDisponible());
            }
        }   
        return assistProductos;
    } 
}
    

