
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
    
    /*Tener presente que si no existe una carpeta de nombre “archivos” 
    ubicada en la carpeta del proyecto, se cree de manera que quedará 
    en la misma carpeta que las carpetas src  y bin */
    
    
    /*Nuevo Archivo: debe llamar a una función 
    que pida un nombre de archivo al usuario 
    y cree un archivo con el nombre indicado dentro de la carpeta 
    de nombre “archivos” ubicada en la carpeta del proyecto, 
    y que rellene el archivo con un texto introducido por el usuario.
    */
    public static void nuevoArchivo() throws IOException{
        System.out.println("============================================");
        System.out.println("Función nuevoArchivo"); 
         
        
        /*Tener presente que si no existe una carpeta de nombre “archivos” 
        ubicada en la carpeta del proyecto, se cree de manera que quedará 
        en la misma carpeta que las carpetas src  y bin */
        //Creamos la carpeta "archivos"
        File documento = new File(rutaProyecto + separador + "archivos");
        if(!documento.exists()){//Si no existe la carpeta "archivos" la creamos
             System.out.println(documento.mkdir());
        }else{//Si  existe la carpeta "archivos"
           System.out.println("Ya existe la carpeta archivos");
        }
        
        //Creamos el archivo.txt
        System.out.println("Introduzca el nombre del nuevo archivo");
        String nombreNuevoArchivo=sc.nextLine();
        File archivo = new File(rutaProyecto + separador + "archivos" + separador + nombreNuevoArchivo + ".txt");
        if(!archivo.exists()){//Si no existe el archivo lo creamos
             System.out.println(archivo.createNewFile());
        }else{//Si  existe la carpeta "archivos"
           System.out.println("Ya existe el archivo " + nombreNuevoArchivo + ".txt");
        }
        //Escribimos dentro del archivo
        FileWriter variableFileWriter = new FileWriter(archivo);
        BufferedWriter variableBuffer = new BufferedWriter(variableFileWriter);
        System.out.println("Que quieres escribir en el archivo");
        String contenido=sc.nextLine();
        variableBuffer.write(contenido);//para escribir un texto en el fichero.
        variableBuffer.flush(); // para escribir todo aquello que pudiera haber quedado pendiente en el buffer y vaciarlo.
        variableBuffer.close(); //para finalizar la comunicación con el fichero.
        System.out.println("");
    }
    
    
    /*Listar Archivos debe llamar a una función 
    que muestre los nombres de archivos (sin carpetas) 
    dentro de la carpeta “archivos” numerados: ej: 
    1-Archivo1.txt  2-Archivp2.txt .. 
    y retorne un array con las rutas de los archivos. 
    */
    public static String [] listarArchivos(){
        System.out.println("============================================");
        System.out.println("Función listarArchivos"); 
         /*Tener presente que si no existe una carpeta de nombre “archivos” 
        ubicada en la carpeta del proyecto, se cree de manera que quedará 
        en la misma carpeta que las carpetas src  y bin */
         
        //Creamos la carpeta "archivos" si no existe
        File documento = new File(rutaProyecto + separador + "archivos");
        if(!documento.exists()){//Si no existe la carpeta "archivos" la creamos
             System.out.println(documento.mkdir());
        }
        //Listamos los archivos
        String[] archivosCarpetaArchivos=documento.list();
        String[] nombresArchivosCarpetaArchivos=new String[archivosCarpetaArchivos.length];
        String [] rutasArchivosCarpetaArchivos= new String[archivosCarpetaArchivos.length];//Tendrá el mismo tamaño que el array archivosCarpetaArchivos
        //Verificamos que hay un archivo
        if(archivosCarpetaArchivos == null || archivosCarpetaArchivos.length == 0)
        {
          System.out.println("No hay archivos dentro de la carpeta \"archivos\"");
        }
        else{
            System.out.println("========================================");
            System.out.println("Listado de archivos en la carpeta \"archivos\":");
            for (int i = 0; i < archivosCarpetaArchivos.length; i++){
                //System.out.print(i+1 + ".- " + archivosCarpetaArchivos[i]);
                //Guardamos los nombres en un array
                nombresArchivosCarpetaArchivos[i]=archivosCarpetaArchivos[i];
                //System.out.println("  La ruta del archivo es: " + rutaProyecto + separador + "archivos" + separador + archivosCarpetaArchivos[i]);
                //Guardamos las rutas en un array
                rutasArchivosCarpetaArchivos[i]=rutaProyecto + separador + "archivos" + separador + archivosCarpetaArchivos[i];
            }   
        }
        System.out.println("Se han guardado en el array nombresArchivosCarpetaArchivos");
        return nombresArchivosCarpetaArchivos;
        
    }
    
    /*Muestra un Archivo debe de llamar a ListarArchivos 
    para mostrar los archivos disponibles  y 
    permitir al usuario elegir qué documento quiere ver 
    según su número y mostrar el contenido del documento por consola.
    */
     public static void muestraUnArchivo() throws FileNotFoundException, IOException{
        System.out.println("============================================");
        System.out.println("Función muestraUnArchivo"); 
        String[] archivosCarpetaArchivos=listarArchivos();
        if(archivosCarpetaArchivos == null || archivosCarpetaArchivos.length == 0)
        {
          System.out.println("No hay archivos dentro de la carpeta \"archivos\"");
        }
        else{
            System.out.println("========================================");
            System.out.println("Listado de archivos en la carpeta \"archivos\":");
            int numeroArchivoBorrar= pideEntero("¿Que número de archivo quieres mostrar?");
            for (int i = 0; i < archivosCarpetaArchivos.length; i++){
                if((i+1)==numeroArchivoBorrar){
                    File archivo = new File(rutaProyecto + separador + "archivos" + separador + archivosCarpetaArchivos[i]);
                    FileReader fr = new FileReader(archivo); //Stream conectado al fichero a leer.
                    BufferedReader br = new BufferedReader(fr); //Buffer que almacena datos del stream
                    for (String linea = br.readLine(); linea != null; linea = br.readLine()) {
                        System.out.println(linea); //mostramos por consola el texto leído
                    }
                    br.close(); //cerramos el buffer
                }     
            }
        }
        System.out.println("");
    }
    
     /*Borrar un Archivo: debe llamar a una función 
     que muestre los archivos dentro de la carpeta “archivos” numerados 
     y permitir al usuario elegir qué documento quiere borrar según su número.
     */
     
     public static void borrarUnArchivo(){
        System.out.println("============================================");
        System.out.println("Función borrarUnArchivo"); 
        String[] archivosCarpetaArchivos=listarArchivos();
        if(archivosCarpetaArchivos == null || archivosCarpetaArchivos.length == 0)
        {
          System.out.println("No hay archivos dentro de la carpeta \"archivos\"");
        }
        else{
            System.out.println("========================================");
            System.out.println("Listado de archivos en la carpeta \"archivos\":");
            int numeroArchivoBorrar= pideEntero("¿Que número de archivo quieres borrar?");
            for (int i = 0; i < archivosCarpetaArchivos.length; i++){
                if((i+1)==numeroArchivoBorrar){
                    File archivo = new File(rutaProyecto + separador + "archivos" + separador + archivosCarpetaArchivos[i]);
                    archivo.delete();
                }     
            }
        System.out.println("");
        }
     }
    
     
    /*Renombrar un Archivo: debe mostrar los archivos dentro de la carpeta “archivos” numerados
     y permitir al usuario elegir qué documento quiere renombrar según su número.
     A continuación le pregunte el nuevo nombre y lo renombre si es válido. 
     Si es un nombre inválido se debe mostrar un mensaje por consola al usuario 
     y volver a ejecutar el menú.
     */ 

   
    public static void renombrarUnArchivo(){
        System.out.println("============================================");
        System.out.println("Función renombrarUnArchivo"); 
        String[] archivosCarpetaArchivos=listarArchivos();
        if(archivosCarpetaArchivos == null || archivosCarpetaArchivos.length == 0)
        {
          System.out.println("No hay archivos dentro de la carpeta \"archivos\"");
        }
        else{
            System.out.println("========================================");
            System.out.println("Listado de archivos en la carpeta \"archivos\":");
            int numeroArchivoBorrar= pideEntero("¿Que número de archivo quieres renombrar?");
            if(numeroArchivoBorrar >archivosCarpetaArchivos.length){
                System.out.println("No existe ese número de archivo.");
            }else{
                for (int i = 0; i < archivosCarpetaArchivos.length; i++){
                if((i+1)==numeroArchivoBorrar){
                    System.out.println("¿Que nuevo nombre le quieres dar al archivo?");
                    String nuevoNombre=sc.nextLine();
                    File nombreAntiguo = new File(rutaProyecto + separador + "archivos" + separador + archivosCarpetaArchivos[i]);
                    File nombreNuevo = new File(rutaProyecto + separador + "archivos" + separador + nuevoNombre + ".txt");
                    nombreAntiguo.renameTo(nombreNuevo);
                }     
            }
            } 
        }
        System.out.println("");
    }
    
    
    /*Reemplazar caracteres de un Archivo: 
    debe de llamar a ListarArchivos para permitir al usuario elegir 
    qué documento se quiere modificar según su número 
    y a continuación pida qué carácter se quiere reemplazar 
    y por qué nuevo carácter. 
    Si el documento no existe o es inválido, se debe mostrar un mensaje por consola al usuario 
    y volver a ejecutar el menú. Es preferible el uso de RandomAccessFile.
    */
     public static void reemplazarCaracteresArchivo() throws IOException{
        System.out.println("============================================");
        System.out.println("Función reemplazarCaracteresArchivo"); 
        String[] archivosCarpetaArchivos=listarArchivos();
        if(archivosCarpetaArchivos == null || archivosCarpetaArchivos.length == 0)
        {
          System.out.println("No hay archivos dentro de la carpeta \"archivos\"");
        }
        else{
            System.out.println("========================================");
            System.out.println("Listado de archivos en la carpeta \"archivos\":");
            int numeroArchivoBorrar= pideEntero("¿En que número de archivo quieres reemplazar los caracteres?");
            if(numeroArchivoBorrar >archivosCarpetaArchivos.length){
                System.out.println("No existe ese número de archivo.");
            }else{
                for (int i = 0; i < archivosCarpetaArchivos.length; i++){
                if((i+1)==numeroArchivoBorrar){
                    /*
                    Codigo fuente
                    https://puntocomnoesunlenguaje.blogspot.com/2013/06/java-ficheros-acceso-aleatorio.html
                    */
                   long pos = 0;
                    String rutaDocumento = rutaProyecto + separador + "archivos" + separador + archivosCarpetaArchivos[i];
                    RandomAccessFile raf = new RandomAccessFile(rutaDocumento, "rw");//rw - read_write. Lectura y escritura */
                    //Se pide el caracter a buscar
                    System.out.println("¿Que caracter quieres modificar?");
                    String caracterBuscar=sc.nextLine();
                    System.out.println("¿Cuál es el nuevo caracter?");
                    String caracterReemplazar=sc.nextLine();
                    
                    String cadena = raf.readLine(); //leemos la primera línea
                    //leemos del fichero
                    while(cadena!=null){  //mientras no lleguemos al final del fichero
                        int indice = cadena.indexOf(caracterBuscar); //buscamos el carácter en la línea leída
                        while(indice!=-1){ //mientras la línea contenga esa palabra (por si está repetida)
                            StringBuilder  auxBuilder = new StringBuilder(cadena); //paso la línea a un StringBuilder para modificarlo
                            auxBuilder.replace(indice, indice+caracterBuscar.length(), caracterReemplazar.toUpperCase());                   
                            cadena = auxBuilder.toString();

                            //nos posicionamos al principio de la línea actual y se sobrescribe la línea completa
                            //La posición donde empieza la línea actual la estoy guardando
                            //en la variable pos
                            raf.seek(pos);
                            raf.writeBytes(cadena);

                            //compruebo si se repite la misma palabra en la línea
                            indice = cadena.indexOf(caracterBuscar);
                        }
                        pos = raf.getFilePointer(); //posición de la línea actual que voy a leer
                        cadena = raf.readLine();    //lectura de la línea
                        }
                    raf.close(); //Tancamos el fichero
                }     
            }
            }
        }
        System.out.println("");
    }
    
    
    
    /*funciones  int pideEntero(String pregunta) 
    encargadas de mostrar por consola la pregunta pasada como parámetro,
    pedir un número por consola (si el usuario no introduce un valor 
    correcto ha de volver a pedir el valor hasta
    que el usuario introduzca un valor correcto) 
    y retornar el número introducido como un int*/
    public static int pideEntero(String pregunta){
        int valor = 0;
        boolean esNumero=false;
        do{
            System.out.println(pregunta);
            valorIntroducidoPregunta=sc.nextLine();
            if(isNumericInt(valorIntroducidoPregunta)){//Si es número devolverá true
                valor=Integer.parseInt(valorIntroducidoPregunta);
                esNumero=true;
            }
        }while(esNumero != true);
        return valor;
    }
    
    /*Función que verifica que un String es un número entero*/
    public static boolean isNumericInt(String cadena) {
        try {
            Integer.parseInt(cadena);// el método Integer.parseInt arroja una excepción al pasarle una cadena sin un entero válido. 
            resultado = true;
        } catch (NumberFormatException excepcion) {
            /* Cuando la excepcion de tipo NumberFormatException ocurra, 
            entonces determinamos que la conversion ha fallado 
            y por lo tanto la cadena que se intento convertir
            , no es un numero, retornando FALSE. 
            En caso contrario nos retorna un TRUE.*/
            resultado = false;
        }
        return resultado;
    }
    
}

    
    
