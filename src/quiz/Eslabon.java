/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ancardenas
 */
public abstract class Eslabon {
    protected String nombre;
    protected String descripcion;
    protected int direccionLat;
    protected int direccionLong;
    protected HashMap<String,Producto> productos;



    public Eslabon(String nombre, String descripcion, int direccionLat, int direccionLong) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccionLat = direccionLat;
        this.direccionLong = direccionLong;
        this.productos = new HashMap<>();
    }
    public void darinformaciuon(){
        System.out.println(this.nombre);
        System.out.println(this.descripcion);
        System.out.println("Latitud "+ this.direccionLat);
        System.out.println("Longitud "+ this.direccionLong);
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDireccionLat() {
        return direccionLat;
    }

    public int getDireccionLong() {
        return direccionLong;
    }

    public Producto getProductos(String nom) {
        return this.productos.get(nom);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDireccionLat(int direccionLat) {
        this.direccionLat = direccionLat;
    }

    public void setDireccionLong(int direccionLong) {
        this.direccionLong = direccionLong;
    }

    public void setProductos(String nom,Producto prod) {
        this.productos.put(nom, prod);
    }
    
    
}
