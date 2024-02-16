/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.tienda;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.Productos;

/**
 * @author David Esteban Ortiz Ortiz
 * @author Sebastian Coronado Parra
 */
public class Tienda {

    public static void main(String[] args) {
                Productos p = new Productos(); 
                Scanner lector = new Scanner(System.in);
        boolean activo=true;
        do{
            p.mostrarMenu();
           int opcion = lector.nextInt();
           //menu para ingresar al programa
           switch(opcion){
               case 1:
                   //agregar producto en el programa
                   p.agregarProducto();
                   break;
               case 2:
                   //mostrar los productos registrados
                   p.mostrarProductos();
                   break;
               case 3:
                   //ordenado por cantidad de manera ascendete 
                   p.productosAscendente();
                   break;
               case 4:
                   //eliminando producto
                   p.eliminarProducto();
                   break;
               case 5:
                       //Culminacion del programa
                       activo = false; System.out.println("PROGRAMA TERMINADO");
                   break;
                   
                   default:
                       System.out.println("La opción escogida es invalida, escoja una opción valida");
     
               
           }
        }
        while(activo);
        
    
   
    }


}
    
    
    
    
    
    

    


    
    

