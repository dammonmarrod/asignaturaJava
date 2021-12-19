# Proyecto Programación

Ejercicio de java donde utilizar clases y funciones.


## Comenzando 🚀
Crea los archivos .java dentro de una carpeta de nombre actividad03_0485


### Dentro del package actividad03_0485.ejercicio01 define los siguientes packages y clases: 📋

##### En el package actividad03_0485.ejercicio01.introduceDatos crea Pregunta.java con las funciones :
```
int pideEntero(String pregunta) y double pideDouble (String pregunta) 
encargadas de mostrar por consola la pregunta pasada como parámetro, 
pedir un número por consola 
(si el usuario no introduce un valor correcto ha de volver a pedir el valor hasta que el usuario introduzca un valor correcto) 
y retornar el número introducido como un int o double respectivamente.
```

##### En el package actividad03_0485.ejercicio01.main crea Ejercicio01.java:
```
Añade el código que muestre por consola un menú para ejecutar cualquiera de las funciones definidas en el resto del documento. 
Ten en cuenta que se debe pedir al usuario el número de función a ejecutar mediante la función pideEntero creada anteriormente. 
El programa solo debe finalizar cuando el usuario indique que no quiere realizar ninguna otra operación.
```


##### En el package actividad03_0485.ejercicio01.operaciones crea y programa Valores.java :
```
Con las funciones:
muestraPi: que simplemente muestre por consola el valor PI de la clase Math
muestraValorAleatorio: que pida un número mediante pideEntero y muestre por consola un número aleatorio entre 0 y el número introducido.
```

##### En el package actividad03_0485.ejercicio01.operaciones.algebraicas crea y programa Operaciones.java  :
```
Con las funciones:
muestraRaizCuadrada(): pida un número con decimales mediante pideDouble , retorne el resultado de su raíz cuadrada y posteriormente se muestre por consola.
calculaPotencia(double,double) que muestre el resultado de elevar el primer número al segundo utilizando la función pow de la clase Math. 
```


##### En el package actividad03_0485.ejercicio01.operaciones.geometricas  crea y programa Operaciones.java :
```
Con las funciones:
muestraSeno: que reciba un número con decimales por parámetro y muestre su seno.
muestraCoseno: que reciba un número con decimales por parámetro,  retorne su coseno y se muestre por consola.
```

### Dentro del package actividad03_0485.ejercicio02 define los siguientes packages y clases: 📋

##### Crea y programa Ejercicio01.java :
```
Añade el código que muestre por consola un  menú con las siguientes opciones (y programa cada opción en una función aparte)  
  1. Nuevo Archivo.
  2. Listar Archivos.
  3. Muestra un Archivo.
  4. Borrar un Archivo.
  5. Renombrar un Archivo.
  6. Reemplzar carateres de un Archivo.
  7. Salir.
Teniendo presente que si no existe una carpeta de nombre “archivos” ubicada en la carpeta del proyecto, se cree de manera que quedará en la misma carpeta que las carpetas src  y bin:
```

##### Método nuevoArchivo():
```
Debe llamar a una función que pida un nombre de archivo al usuario 
y cree un archivo con el nombre indicado dentro de la carpeta de nombre “archivos” ubicada en la carpeta del proyecto, 
y que rellene el archivo con un texto introducido por el usuario.
```
