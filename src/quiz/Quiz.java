/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author ancardenas
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Eslabon> emp = new HashMap<>();
        emp.put("Granja de pepe", new Farmer("pepe", "Solo Vende Huevos", 23, 54) );
        emp.put("Granja de paco", new Farmer("paco", "Hace harina", 43, 52));
        emp.put("Pasteleria de Paca",new Manufarturer("Pasteleria paca", "Hace tortas", 31, 35) );
        emp.put("Distrimao", new DistributionCenter("Distrimao", "Distribuye de todo", 30, 12));
        emp.put("Tienda de doña flor", new Retail("Tienda de doña flor", "La tienda de la esquina", 30, 22));
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 Desea añadir un producto");
        
        int a = sc.nextInt();
        switch(a){
            case 1:System.out.println("Lista de establecimientos"); 
                for (Map.Entry<String, Eslabon> entry : emp.entrySet()) {
                    String key = entry.getKey();
                    System.out.println(emp.get(key).getNombre());
                    
                   
                }System.out.println("A que establecimiento desea agregar el producto");
                    String nom =sc.next();
                    System.out.println("Ingrese el nombre del producto");
                    
                System.out.println("");
        }
    }
    
}
