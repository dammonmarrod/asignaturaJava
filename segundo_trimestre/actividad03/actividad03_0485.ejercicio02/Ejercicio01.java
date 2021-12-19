
package actividad03_0485.ejercicio02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


/*añade el código que muestre por consola un  menú con las siguientes opciones
(y programa cada opción en una función aparte)  */
public class Ejercicio01 {
    
    public static Scanner sc = new Scanner(System.in);
   
    //Variables
    public static String valorIntroducidoPregunta;//recoge el valor introducido en la pregutna
    public static boolean resultado;
    public static int opcion; //Guardaremos la opcion del usuario
      
    
    //Ruta absoluta hacia el proyecto en el que se está ejecutando el código
    public static String rutaProyecto= System.getProperty("user.dir");
    //Texto para separar las carpetas en una ruta
    public static String separador = File.separator;
    
    
              
    public static void main(String []args) throws IOException{
       do{
           System.out.println("1. Nuevo Archivo.");
           System.out.println("2. Listar Archivos.");
           System.out.println("3. Muestra un Archivo.");
           System.out.println("4. Borrar un Archivo.");
           System.out.println("5. Renombrar un Archivo.");
           System.out.println("6. Reemplazar caracteres de un Archivo.");
           System.out.println("7. Salir.");
           
           opcion=pideEntero("Elige una de estas opciones: ");
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1.Nuevo Archivo.");
                   nuevoArchivo();
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2. Listar Archivos.");
                   String[] archivosCarpetaArchivos=listarArchivos();
                   //Verificamos que hay un archivo
                    if(archivosCarpetaArchivos == null || archivosCarpetaArchivos.length == 0)
                    {
                      System.out.println("No hay archivos dentro de la carpeta \"archivos\"");
                    }else{
                        System.out.println("Listado de archivos en la carpeta \"archivos\":");
                         for (int i = 0; i < archivosCarpetaArchivos.length; i++){
                             System.out.print(i+1 + ".- " + archivosCarpetaArchivos[i]);
                             System.out.println("  La ruta del archivo es: " + rutaProyecto + separador + "archivos" + separador + archivosCarpetaArchivos[i]);   
                         } 
                    }
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3. Muestra un archivo.");
                   muestraUnArchivo();
                   break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4. Borrar un Archivo.");
                    borrarUnArchivo();
                   break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5. Renombrar un Archivo.");
                    renombrarUnArchivo();
                   break;
                case 6:
                   System.out.println("Has seleccionado la opcion 6. Reemplazar caracteres de un Archivo");
                   reemplazarCaracteresArchivo();
                   break;
                case 7:
                    //opcion 7 Salir
                    break;
                //Si el usuario selecciona una opción no contemplada se tiene que volver a mostrar el menú.
                default:
                   System.out.println("Solo es válida una opción entre 1 y 7");
           }
          System.out.println(""); 
       }
      while(opcion !=7);
    }

