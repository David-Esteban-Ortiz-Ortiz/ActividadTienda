/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author David Esteban Ortiz Ortiz
 * @author Sebastian Coronado Parra
 */
public class Productos {
                    Scanner lector = new Scanner(System.in);
                    ArrayList<Productos>misProductos=new ArrayList<>();
    //Atributos
    private String nombreProducto;
    private double precioProducto;
    private int cantidadProducto;
    private int idProducto;
    
    //Constructores
    public Productos() {
    }
    
    public Productos(String nombreProducto, double precioProducto, int cantidadProducto,int idProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.idProducto = idProducto;
    }

// Getters y Setters

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }
    
    public void setIdProducto(int idProducto) {
    this.idProducto = idProducto;
    }
        // Metodos
        // agrega el producto
         public void agregarProducto(){
         /**
                    * Ingreso de datos para ingresar productos
                    * entrada del nombre del producto
                    */
                   System.out.println("Ingrese el nombre del producto");
                   
                   String nombreProducto=lector.nextLine(); lector.nextLine(); 
                  
                   System.out.println("Ingrese el id del producto");
                   int idProducto=lector.nextInt();
                   //entrada de precio de producto
                   System.out.println("Ingrese el precio del producto");
                   double precioProducto=lector.nextDouble();
                   //entrada de la cantidad del producto
                   System.out.println("Ingrese la cantidad en paquetes del producto");
                   int cantidadProducto=lector.nextInt();
                   //Creacion del objeto y llenar la información
                   Productos nuevoProductos=new Productos(nombreProducto, precioProducto, cantidadProducto, idProducto);
                   //ALMACENAR EL OBJETO EN LA CONTENEDORA
                   misProductos.add(nuevoProductos); 
    }

    //muestra el menu      
    public void mostrarMenu(){
                    /**
             * Menu de opciones para añadir una nueva tarea 
             * ver el inventario
             * eliminar prouctos 
             * Salir del programa
             * 
             */
           System.out.println("==== Menu de opciones ====");
           System.out.println("1. Agregar producto");
           System.out.println("2. Mostrar inventario de productos");
           System.out.println("3. Mostrar de mayor a menor cantidad del productos");
           System.out.println("4. Eliminar un producto");
           System.out.println("5. Terminar el programa");
           System.out.println("_________________________________________________");
           
    }
    
    // muestra los productos registrados
    public void mostrarProductos(){
                  //Muestra los productos registrados
                   for(Productos p:misProductos){
                       System.out.println("Nombre del producto: " +p.getNombreProducto());
                       System.out.println("ID: " +p.getIdProducto());
                       System.out.println("Precio del producto: "+p.getPrecioProducto());
                       System.out.println("Cantidad del producto: "+p.getCantidadProducto());
                       System.out.println("==========================================");
                   }
        
    }
    
    //productos ordenados por cantidad de manera ascendente
    public void productosAscendente(){
                   //Muestra los productos de manera ascendente dependiendo de la cantidad de productos registrados 
                   for(int i=0; i<misProductos.size()-1;i++){
               
               for(int j=i+1;j<misProductos.size();j++){
                       Productos producto1=misProductos.get(i);
                       Productos producto2=misProductos.get(j);
                       if(producto1.getCantidadProducto()>producto2.getCantidadProducto()){
                           misProductos.set(i,producto2);
                           misProductos.set(j,producto1);
                       }
                      
                       }
               
                   }
                  //Muestra los productos registrados
                   for(Productos p:misProductos){
                       System.out.println("Nombre del producto: " +p.getNombreProducto());
                       System.out.println("ID: " +p.getIdProducto());
                       System.out.println("Precio del producto: "+p.getPrecioProducto());
                       System.out.println("Cantidad del producto: "+p.getCantidadProducto());
                       System.out.println("==========================================");
                   }                     
    }
    
    // Eliminar producto
    public void eliminarProducto(){
                 /**
                   *  System.out.println("Digite el Id del producto que quiere eliminar");
                   int id=lector.nextInt();
                   for(Productos p:misProductos){
                      if (p.getIdProducto()==id)
                          misProductos.remove(p);
                   }
                   System.out.println("Producto con id"+id+"ha sido eliminado");
                   
           }
                   */
                   System.out.println("digite Id del producto a eliminar");
                   int id=lector.nextInt();
                   Iterator<Productos>it=misProductos.iterator();
                   while(it.hasNext()){
                       Productos p=it.next();
                       if(p.getIdProducto()==id)
                           it.remove();
                   }
                   System.out.println("producto con id"+id+"eliminado");
        
    }
    
    
}
