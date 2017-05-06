/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodehashmap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Christian Collaguazo
 */
public class EjemplodeHashTable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cx = new Scanner(System.in);
        String[] nombres = {"Xavi", "Chris", "Max", "Dani",
            "Belen", "Sebastian", "Fabian", "Jose",
            "Ismael", "Narcisa"};
        int[] edad= {25, 24, 48, 49, 27, 46, 57,
            29, 52, 59};
        Hashtable tabla = new Hashtable();//creacion del hashTable
        for (int i = 0; i < nombres.length; i++) {
            tabla.put(edad[i], nombres[i]);//ingreso de los valores del hashTable
        }
        System.out.println("Tabla creada");
        tabla.put(null , "valorNulo");
        boolean salir = false;
        while(salir == false)
        {
            System.out.println("1. Buscar en la tabla");
            System.out.println("2. Agregar Elemento");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Conjunto de llaves y valores");
            System.out.println("5. Salir");
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
                    System.out.println("Valor anterior: " + tabla.put(clave, valor));//inseta un nuevo valor en la tabla
                    System.out.println("Se ha agregado el valor: " + tabla.get(clave) );
                    break;
                    
                case 3:
                    System.out.println("Ingrese la clave");
                    clave = cx.nextInt();
                    Object aux = tabla.remove(clave);//remueve un valor de la tabla
                    if(aux != null)
                    {
                        System.out.println("El elemento se a eliminado: " + aux);
                    }
                    break;
                case 4:
                    System.out.println("Conjunto de claves");
                    Set conjunto = tabla.keySet(); // nos devuelve el conjunto de claves en la tabala
                    System.out.println("Conjunto de claves: " + conjunto);
                    System.out.println("Enumeracion de valores: ");
                    Enumeration enu = tabla.elements();// nos devuelve una enumeracion con los valores de la tabla
                    while (enu.hasMoreElements())
                    {
                        System.out.print(enu.nextElement());
                        if (enu.hasMoreElements()) System.out.print(", ");
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Saliendo");
                    salir = true;
            }
        }
        
        
    }
    
}
