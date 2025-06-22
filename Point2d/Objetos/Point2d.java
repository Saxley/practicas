package Objetos; 
//package practicas.Point2d.Objetos; 
// Para ejecutarlo con paquetes, colocarse en la raiz y compilar con javac direccion del paquete *.java.
//Para ejecutar con java colocarse en la raiz y ejecutar java direccion del paquete Main ( ó el archivo que contenga el metodo main).
import static java.lang.Math.*;
// Point2d :: Esta clase me permite crear puntos en un plano 2d, tiene diferentes funcionalidades:
// Cuenta el numero de puntos creados con su variable estatica numberOfPoints, esto nos ayida para saver la cabtidad de puntos que se han creado.
//Obtiene las coordenas de forma individual de cada punto.
//Calcula la distancia del punto hasta el origen.
//Calcula el angulo del punto respecto al eje X positivo.
//Calcula la distancia euclidiana al punto ingresado.
//Mueve el punto sumando los datos ingresados, los suma a su posicion x , y.
//Escala el punto multiplcando sus coordenadas.
//Rota el punto actual alrededor de otro punto que se le pase como parametro.
// Esta clase es fundamental para practicar el manejo de graficos 2d simple.
public class Point2d{
  private Double x,y; // Creamos las variables privadas que almacenaran las coordenadas x,y.
  private static Integer numberOfPoints;// Creamos la variable que almacenara el conteo de numero de puntos creados.
  static { // El bloque static es un bloque especial donde se inicializan o se introduce logica para inicializar variables, en este caso inicializamos Point.2d.numberOfPoints en 0, ya que aun no hay ningun objeto Point2d creado.
  //Cabe mencionar que la clase static se ejecuta al momento de ejecutar la clase, por eso mismo para llamarlo hay que usar el nombre de la clase y no usar this, ya que this se refiere a un atributo del objeto y en este caso no es un atributo de un objeto es un atributo de clase.
    Point2d.numberOfPoints = 0;
  }
  
  public Point2d(){// Este bloque de codigo crea por asi decirlo un punto nuevo en el origen.
    this(0.0,0.0); // Hacemos referencia a el objeto y le pasamos por parametro los datos solicitados Double x y Double y del conatructor. A esto se le llama delegacion de constructor.
  }
  
  public Point2d(final Double x, final Double y){ // Este segundo constructor de la clase Point2d solicita 2 argumentos de tipo Double que seran constantes.
    this.x=x; // almacenamos el valor de la constante en la variable x del objeto.
    this.y=y; // almacenamos el valor de la constante y en la variable y del objeto.
    Point2d.numberOfPoints++; // aumentamos la variable numberOfPoints de la clase Point2d.
  }
  
  public Double getX(){ // Devuelve el valor de la variable x del punto actual.
    return this.x;
  }
  
  public Double getY(){// Devuelve el valor de la coordenada y del objeto actual.
    return this.y;
  }
  
  public static Integer getNumberOfPoints(){ // Devuelve la cantidad de puntos creados al momento.
    return Point2d.numberOfPoints;
  }
  
  public Double getRho(){ // Devuelve la distancia que existe del punto actual al origen.
    return sqrt(pow(x,2)+pow(y,2)); // calculamos la distancia con ayuda del teorema de pitagoras.
    //sqrt() es la funcion de java.lang.Math.* que asimila a una raiz cuadrada.
    //pow(valor,exponente) es la funcion que asimila a un numero con exponencia n.
  }
  
  public Double getTheta(){ // Esta funcion retorna un valor de tipo Double y se dedica a calcular el angulo del punto actual respecto al origen.
    Double angrad = atan2(y,x); // atan2(y,x) es la funcion que calcula en radianes el angulo.
    return toDegrees(angrad); //toDegrees() es la funcion que hace la conversion de radianes a grados
  }
  
  public Double getDistance(final Point2d p){ // Calcula la distancia que existe entre 2 puntos
    return sqrt(pow(x - p.x, 2) + pow(y - p.y, 2)); // utilizamos el teorema de pitagoras para calcular la distancia entre punto a y punto b.
  }
  
  public void translate(final Double a, final Double b){ // Sumamos la cantidad ingresada a los ejes x, y para trasladar el punto a una nueva coordenada
    x += a;
    y += b;
  }
  
  public void scale(final Double factor){ // Multiplicamos la cordenada actual x, y para scalar el punto
    x *= factor;
    y *= factor;
  }
  
  public void rotate(final Point2d p, final Double angle){ // rotamos el punto respecto a otro punto en un angulo determinado
    Double angrad = toRadians(angle);
    Double x1 = this.x - p.x;
    Double y1 = this.y - p.y;
    Double x2 = x1 * cos(angrad) - y1 * sin(angrad);
    Double y2 = x1 * sin(angrad) - y1 * cos(angrad);
    this.x = x2 + p.x;
    this.y = y2 + p.y;
  }
}