public class test{
	public static void main(String [] args){
	  arbolFamiliarTres(args);
	}
	//Ejercicio 7:
	private static String armarNombre(String nombre, String apellidoPaterno, String apellidoMaterno){
	  //Ejercicio 7: armarNombre recibe 3 parametros, el nombre y los dos apellidos, arma el nombre y devuelve el nombre en una nueva cadena de texto.
	  String armado = nombre +" "+apellidoPaterno+" "+apellidoMaterno;
	  return armado;
	}
	private static void pintarNombre(String nombre){
	  // Ejercicio 7: pintarNombre recibe un stribg el cual despues imprime en pantalla
	  System.out.println(nombre);
	}
	public static void arbolFamiliarTres(String [] args){
	  //Ejercicio 7:
	  //Recibe los parametros completos :: pasa los nombres en un metodo dedicado a armar los nombres completos y despues que estan armados los pasa a un metodo encargado de p8ntarlos en pantalla
	  String text="1.Primer Apellido.\n2.Segundo Apellido.\n3.Nombre Primer hijo.\n4.Nombre Segundo hijo.\n5.Nombre Tercer hijo.\n6.Nombre del padre.\n7.Nombre de la madre"; // text es una variable de tipo Stribg que jos ayudara a mostrar informacion en pantalla, almacenara unicamente texto. Lo inicializamos con un texto predeterminado para mostrar la primera ocasion que se ejecute el programa.
	  String apellidoMaterno,apellidoPaterno,nPadre,nMadre,nHijoUno,nHijoDos,nHijoTres; // Declaramos 7 variables de tipo String donde almacenaremos los argumentos.
	  if(args.length < 7  || args.length > 7) System.out.println("Debes introducir 7 argumentos.\n"+text); // Solicitamos al usuario los parametros idoneos para que el programa funciine correctamente, en caso de ibtroducir mas o menos argumentos este texto seta mostrado nuevamente al usuario.
	  if(args.length == 7){
	    //Almacenamos los argumentos en las variables declaradas anteriormente, inicializando sus valores 
	    apellidoPaterno = args[0];
	    apellidoMaterno = args[1];
	    nHijoUno = args[2];
	    nHijoDos = args[3];
	    nHijoTres = args[4];
	    nPadre = args[5];
	    nMadre = args[6];
	    // Llamamls al metodo pintarNombre para imprimir en pantalla el nombre completo de cada integrante y llama al metodo armarNombre para armar el nombre de cada integrante.
	    System.out.println("Padres : \n");
	    pintarNombre(armarNombre(nPadre,apellidoPaterno," "));
	    pintarNombre(armarNombre(nMadre,apellidoMaterno," "));
	    System.out.println("Hijos : \n");
	    pintarNombre(armarNombre(nHijoUno,apellidoPaterno, apellidoMaterno));
	    pintarNombre(armarNombre(nHijoDos,apellidoPaterno, apellidoMaterno));
	    pintarNombre(armarNombre(nHijoTres,apellidoPaterno, apellidoMaterno));
	  }
	}
	//Ejercicio 6:
	public static void pintarPersona(String nombre, String apellidoPaterno, String apellidoMaterno){
	  //Ejercicio 6: Imprimir el nombre a construir de un familiar, identificar si es hijo ó padre.
	  String text; // text Nos servira para almacenar texto.
	  text = (apellidoMaterno == " ") ? "Padres : \n" : "Hijo : \n"; // Si el apellido materno esta vacio determinar que la persona es padre caso contrario sera madre
	  text += "Nombre : "+nombre+" Apellidos : "+apellidoPaterno+" "+apellidoMaterno; // Agregamos el armado del nombre
	  System.out.println(text);
	}
	public static void arbolFamiliarDos(String [] args){
	  //Ejercicio 6:
	  //Recibe los parametros completos
	  String text="1.Primer Apellido.\n2.Segundo Apellido.\n3.Nombre Primer hijo.\n4.Nombre Segundo hijo.\n5.Nombre Tercer hijo.\n6.Nombre del padre.\n7.Nombre de la madre"; // text es una variable de tipo Stribg que jos ayudara a mostrar informacion en pantalla, almacenara unicamente texto. Lo inicializamos con un texto predeterminado para mostrar la primera ocasion que se ejecute el programa.
	  String apellidoMaterno,apellidoPaterno,nPadre,nMadre,nHijoUno,nHijoDos,nHijoTres; // Declaramos 7 variables de tipo String donde almacenaremos los argumentos.
	  if(args.length < 7  || args.length > 7) System.out.println("Debes introducir 7 argumentos.\n"+text); // Solicitamos al usuario los parametros idoneos para que el programa funciine correctamente, en caso de ibtroducir mas o menos argumentos este texto seta mostrado nuevamente al usuario.
	  if(args.length == 7){
	    //Almacenamos los argumentos en las variables declaradas anteriormente, inicializando sus valores 
	    apellidoPaterno = args[0];
	    apellidoMaterno = args[1];
	    nHijoUno = args[2];
	    nHijoDos = args[3];
	    nHijoTres = args[4];
	    nPadre = args[5];
	    nMadre = args[6];
	    // Llamamls al metodo pintarPersona para imprimir en pantalla el nombre completo de cads integrabte y su papel en la familia
	    pintarPersona(nPadre,apellidoPaterno," ");
	    pintarPersona(nMadre,apellidoMaterno," ");
	    pintarPersona(nHijoUno,apellidoPaterno, apellidoMaterno);
	    pintarPersona(nHijoDos,apellidoPaterno, apellidoMaterno);
	    pintarPersona(nHijoTres,apellidoPaterno, apellidoMaterno);
	  }
	}
	//Ejercicio 5:
	public static void entradaRectanguloDos(String [] args){
	 // Ejercicio 5: Detalles en areaRectanguloDos.
	  String base, altura;
	  base=args[0];
	  altura=args[1];
	  areaRectanguloDos(Integer.valueOf(base),Integer.valueOf(altura));
	}
	public static void areaRectanguloDos(int base, int altura){
	  // Ejercicio 5:
	  // Usar el ejercicio 3 como metodo en el metodo main.
	  int c=base*altura;
	  String text="El área del rectangulo de : "+base+" cm de ancho \n por : "+altura+" cm de alto \n es de : "+c;
	  System.out.println(text);
	}
	//Ejercicio 4:
	public static void arbolFamiliar(String [] args){
	  //Ejercicio 4:
	  //Concatenar los nombres y apellidos de las personas. Mostrar en pantalla los nombres concatenados del padre, la madre, los hijos con sus respectivos apellidos.
	  String text="1.Primer Apellido.\n2.Segundo Apellido.\n3.Nombre Primer hijo.\n4.Nombre Segundo hijo.\n5.Nombre Tercer hijo.\n6.Nombre del padre.\n7.Nombre de la madre"; // text es una variable de tipo Stribg que jos ayudara a mostrar informacion en pantalla, almacenara unicamente texto. Lo inicializamos con un texto predeterminado para mostrar la primera ocasion que se ejecute el programa.
	  String apellidoMaterno,apellidoPaterno,nPadre,nMadre,nHijoUno,nHijoDos,nHijoTres; // Declaramos 7 variables de tipo String donde almacenaremos los argumentos.
	  if(args.length < 7  || args.length > 7) System.out.println("Debes introducir 7 argumentos.\n"+text); // Solicitamos al usuario los parametros idoneos para que el programa funciine correctamente, en caso de ibtroducir mas o menos argumentos este texto seta mostrado nuevamente al usuario.
	  if(args.length == 7){
	    //Almacenamos los argumentos en las variables declaradas anteriormente, inicializando sus valores 
	    apellidoPaterno = args[0];
	    apellidoMaterno = args[1];
	    nHijoUno = args[2];
	    nHijoDos = args[3];
	    nHijoTres = args[4];
	    nPadre = args[5];
	    nMadre = args[6];
	    // en text vamos a sobreescribir su valor, iremos concatenando poco a poco cada una de las lineas a mostrar.
	    text = "Padre:"+nPadre+" "+apellidoPaterno+"\n"; //Esta linea suplanta el valor por defecto.
	    text += "Madre:"+nMadre+" "+apellidoMaterno+"\n"; // El += significa que se concatenara el nuevo texto al final de la linea existente
	    text += "Hijos :\n"+nHijoUno+" "+apellidoPaterno+" " +apellidoMaterno+"\n";
	    text += nHijoDos+" "+apellidoPaterno+" " +apellidoMaterno+"\n";
	    text += nHijoTres+" "+apellidoPaterno+" " +apellidoMaterno+"\n";
	    System.out.println(text); // Mostramos text en pantalla.
	  }
	}
	//Ejercicio 3:
	public static void areaRectangulo(String [] args){
	  //Ejercicio 3: Hacer un prohrama que calcule el area de un rectangulo, los argumentos deberan ser rec8bidos desde consola al momento de ejecutar.
	  int a=Integer.valueOf(args[0]);
	  int b=Integer.valueOf(args[1]);
	  int c=a*b;
	  String text="El área del rectangulo de : "+args[0]+" cm de ancho \n por : "+args[1]+" cm de alto \n es de : "+c;
	  System.out.println(text);
	}
	//Ejercicio 2:
	public static void argumentos(String [] args){
	  //Ejercicio 1: Mostrar uno de los argumentos
	  System.out.println("He recibido el siguiente argumento:"+args[1]);
	  //Ejercicio 2:Mostrar la cantidad de argumentos recibidos.
	  System.out.println("He recibido "+args.length+" argumentos");
	}
	//Ejercicio 1:
	public static void testOperadoresIncrementoDecremento(){
		int n=7;
		System.out.println(n);//7
		System.out.println(++n); //Suma 1 y almavcena el resultado, despues se muestra el resultado. 8
		System.out.println(n);//8
		System.out.println(n++);//Muestra el valor de n y desoues suma 1 y guarda el resultado. 8
		System.out.println(n);//9
	}
}
