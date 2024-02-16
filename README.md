
![Logo Java](https://seeklogo.com/images/J/java-logo-7833D1D21A-seeklogo.com.png)

# ACTIVIDAD TIENDA GRUPAL
Nombres:
- David Esteban Ortiz
- Sebastian Coronado Parra

Aqui se podra encontrar la actividad propuesta para Algoritmos y programación 3.

## Descripción del Problema:

Se requiere la realización de un programa simple para el manejo simple de gestión de un inventario para una tienda de barrio. Se requiere manejar el nombre del producto, el precio y la cantidad, para realizar el ejercicio se requiere de cuatro requerimientos funcionales, el sistema debe permitir agregar un producto, permitir obtener el inventario de productos, organizar el producto teniendo en cuenta la cantidad de menor a mayor y eliminar un producto. Para realizar el ejercicio es necesario utilizar conceptos de Programación Orientada a Objetos (POO), ciclos, condicionales y manejo de contenedoras variables para el manejo de una persistencia simple basada en memoria.


## Resolución de problemas por computador.
Pasos:
1. Conocer el problema.
2. Análisis profundo del tema.
3. Diseño del problema.
4. Prueba de la solción del problema.
5. Codificación.
6. Compilación y ejecución.
7. Verificación y depuración.

## Clase productos
```
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

```
## Clase tienda
```
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
    
```


