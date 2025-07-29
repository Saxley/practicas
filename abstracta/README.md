# Figuras

> Este proyecto trata sobre la herencia y objetos abstractos.
> Nuestra clase Shape es una clase abstracta que solamente contiene constructores para construir figuras y un metodo abstracto llamado getArea() ** cabe resaltar que una clase es considerada abstracta siempre y cuando contenga almenos un metodo abstracto ** es por ese motivo que nuestra clase es abstracta.

## Clase circulo y cuadrado

> Estas clases crean la figura determinada y el plano donde se creara la figura en cuestion, ademas sobrescribimos el metodo abstracto que heredamos de la clase padre Shape getArea() para que cumpla su funcion de devolver el area de la figura, para el cuadrado (Square) multiplicara lado por lado (side \* side), para el circulo(Circle) Multiplcara PI por radio al cuadrado.

## Lo aprendido.

> Aprendi a compilar un proyecto, la estructura basica para proyectos, que un .jar puede servir como biblioteca y que al momento de compilarlo es ** IMPORTANTE ** hacerlo desde la carpeta correcta y direccion correcta ya que ** EN CASO DE NO HACERLO ** los paquetes (package) no funcionaran, las rutas de estos paquetes deben quedar excatamente igual que en la carpeta de compilacion. La siguiente es una lista de los comandos que aprendí:

- javac: Este comando se utiliza para compilar los proyectos y crear las clases que seran utilizadas para despues crear el .jar
- -d: Esta es una opcion que marca el directorio donde se guardaran los archivos, es decir, **la carpeta destino** donde se almacenaran las clases.
- -cp: Se trata del classpath el cual ayuda a la maquina virtual de java a buscar las clases que tu como desarrollador le estas pidiendo que use.
- -p: Este argumento hace que se creen carpetas de forma recursiva ejemplo/semana1/etc haciendo de esta manera un sistema de carpetas más sencillo.
- jar: Se utilica para crear archivos .jar
- -c: Crea un nuevo archivo.
- -v:Genera la salida en pantalla de forma detallada.
- -f: Especifica el nombre del archivo jar de salida.
- jar tf lib/Point2dLib.jar | grep Point2d : este comando de consola nos ayuda a verificar el paquete donde se encuentra la clase Point2d, en esta parte tarde bastante ya que al compilar compilaba dsde la carpeta **bin** y mi **package** no contenia dicha carpeta contemplada, por lo cual la libreria Point2d no podia ser encontrada con -cp, lo que se realizo fue volver a compilar pero esta ocasión desde dentro de la carpeta bin, evitando este problema al pasar el .jar a el proyecto figuras.
- abstract: Esta palabra se utiliza en los metodos de una clase para especificar que dicho proyecto es abstracto y que este tendra que ser sobrescrito en las subclases.
- final: Esta clase nos ayuda a no heredar o a hacer inmutables/reescritos metodos ya creados
- @Override: Este metodo nos ayuda a sobrescribir codigo.

## Conclusión.

> Reutilizar una libreria ya existente es bastante sencillo, simplemente se corrobora su maquetado y las librerias que desee pueden ser utilizadas.
