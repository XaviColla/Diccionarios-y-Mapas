/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotreemap;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Christian Collaguazo
 */
public class EjemploTreeMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cx = new Scanner(System.in);
        
        String[] nombres = {"Xavi", "Chris", "Max", "Dani",
            "Belen", "Sebastian", "Fabian", "Jose",
            "Ismael", "Narcisa"};
        int[] edad= {15, 24, 48, 49, 27, 46, 57,
            29, 78, 89};
        TreeMap tabla;
        tabla = new TreeMap(); // mapa vacío
        for (int i = 0; i < nombres.length; i++) {
            tabla.put(edad[i], nombres[i]);
        }
        SortedMap su1, su2, su3;
        System.out.println("Mapa creado: " + tabla);
        boolean salir = false;
        
        while(salir == false)
        {
            System.out.println("1. Buscar en la tabla");
            System.out.println("2. Agregar Elemento");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Conjunto de llaves y valores");
            System.out.println("5. Crear un sub arbol: [18 , 65]");
            System.out.println("6. Crear un sub arbol: <18");
            System.out.println("7. Crear un sub arbol: >65");
            System.out.println("8. Eliminar el primer elemento");
            System.out.println("9. Salir");
            System.out.println("Ingrese su opcion: ");
            int opc = cx.nextInt();
            switch(opc)
            {
                case 1:
                    System.out.println("Ingrese la clave a buscar");
                    int clave = cx.nextInt();
                    if (tabla.containsKey(clave)) {//verifica si la clave existe
                        System.out.println("Valor: "+ tabla.get(clave));//nos retorna el valor asiciado a esa clave
                    }
                    else
                    {
                        System.out.println("No se a encontrado el valor");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la clave");
                    clave = cx.nextInt();
                    //cx.next();
                    System.out.println("Ingrese el Valor");
                    String valor = cx.next();
                    System.out.println("Valor anterior: " + tabla.put(clave, valor));//inseta un nuevo valor en el mapa
                    System.out.println("Se ha agregado el valor: " + tabla.get(clave) );
                    break;
                    
                case 3:
                    System.out.println("Ingrese la clave");
                    clave = cx.nextInt();
                    Object aux = tabla.remove(clave);//remueve un valor del mapa
                    if(aux != null)
                    {
                        System.out.println("El elemento se a eliminado: " + aux);
                    }
                    break;
                case 4:
                    System.out.println("Conjunto de claves");
                    Set conjunto = tabla.keySet();//llena un conjunto con las claves que hay dentro del hashMap
                    System.out.println("Conjunto de claves: " + conjunto);
                    Set conjunto2 = tabla.entrySet();//llena un conjunto con los valores que hay dentro del hashMap
                    System.out.println("Conjunto de valores: " + conjunto2);
                    break;
                case 5:
                    su1 = tabla.subMap(18, 65); // desde 18 hasta 65
                    System.out.println("Submapa en el rango [18 ... 65): " + su1);
                    break;
                case 6:
                    su2 = tabla.headMap(18); // claves menores que 18
                    System.out.println("Submapa de claves menores que 18: " + su2);
                    break;
                case 7:
                    su3 = tabla.tailMap(65); // claves mayores o iguales que 65
                    System.out.println("Submapa de claves mayores que 65: " + su3);
                    break;
                case 8:
                    System.out.println("Borra primer elemento: " + tabla.remove(tabla.firstKey())); // borra el primer elemento
                    break;
                default:
                    System.out.println("Saliendo");
                    salir = true;
            }
        }
        
        
        
       
       
        
    }
    
}
