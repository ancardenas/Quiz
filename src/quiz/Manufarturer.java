/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;


/**
 *
 * @author ancardenas
 */
public class Manufarturer extends Eslabon {

    public Manufarturer(String nombre, String descripcion, int direccionLat, int direccionLong) {
        super(nombre, descripcion, direccionLat, direccionLong);
    }
    public void crearProdcuto(String nom,Producto prod){
        this.productos.put(nom, prod);
        
    }
}
