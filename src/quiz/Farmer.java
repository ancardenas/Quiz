/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author ancardenas
 */
public class Farmer extends Eslabon {

    public Farmer(String nombre, String descripcion, int direccionLat, int direccionLong) {
        super(nombre, descripcion, direccionLat, direccionLong);
    }

   

    public void registrarProducto(String nom) {
        this.productos.put(nom, new Producto(nom));
    }
    
}
