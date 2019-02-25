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
public class Producto {
    private String nombre;
    private  int precio;
    private  ArrayList<Producto> matPrima;
    private  ArrayList<Eslabon> retaliacion;

    public Producto(String nombre) {
        this.nombre = nombre;
        this.matPrima = new ArrayList<>();
        this.retaliacion = new ArrayList<>();
    }

    public Producto(int precio) {
        this.precio = precio;
        this.matPrima = new ArrayList<>();
        this.retaliacion = new ArrayList<>();
    }

    public void addMatPrima(Producto prod){
        this.matPrima.add(prod);
    }
    public void addRetaliacion(Eslabon es){
        this.retaliacion.add(es);
    }
    public void rastroProd(){
        for (int i = 0; i < retaliacion.size(); i++) {
            System.out.println(this.retaliacion.get(i));
        }
    }
    
}
