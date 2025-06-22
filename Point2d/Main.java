//package practicas.Point2d.Objetos;
// Para ejecutarlo con paquetes, colocarse en la raiz y compilar con javac direccion del paquete *.java.
//Para ejecutar con java colocarse en la raiz y ejecutar java direccion del paquete Main ( ó el archivo que contenga el metodo main).
import Objetos.*; // importamos nuestro package Objetos
public class Main{ // Metodo main donde aplicaremos nuestras clases Point2d y Count, al estar en una misma carpeta se pueden ejecutar sin package sin embargo por fines educativos utilizaremos package para ejecutar desde un package y aprender a utilizarlo.
  public static void main(String [] args){ 
    Counter count = new Counter(); // Creamos un objeto tipo Counter y lo inicializamos llamando a su constructor Counter().
    System.out.println("Counter value: "+count.currentCount()); //Imprimimos en pantalla el valor de count usando el metodo del objeto Counter.currentCount()
    count.incrementCount(); // incrementamos el valor de count con el metodo del objeto Counter.incrementCount()
    count.incrementCount();
    count.incrementCount();
    System.out.println("Counter value: "+count.currentCount());
    System.out.println("Number of Points :  "+ Point2d.getNumberOfPoints());// Utilizamos un metodo de clase de la clasr Point2d.getNumberOfPoints() el cual nos devuelve el numero de puntos creados, recuerda que para que este metodo sea metodo de clase tuvo que ser declarado como static
    Point2d point = new Point2d(12.0,5.0); // Creamos un nuevo objeto point de tipo Point2d y lo inicializamos con su constructor Point2d que recibe 2 argumentos, cordenada x, y.
    System.out.println("Number of Points :  "+ Point2d.getNumberOfPoints()); // Llamamos de nuevo al metodo de clase getNumberOfPoints() para visualizar el cambio
    System.out.println("Radio de coordenadas Polares : "+ point.getRho()); // Llamamos al metodo getRho de nuestro objeto point para obtener la distancia de point respecto al origen.
    System.out.println("Angulo en grados de cordenadas polares : "+point.getTheta()); // Llamamos al metodo getTheta() de nuestro objeto point para obtener el angulo respecto al origen de nuestro objeto.
    Point2d pointA=new Point2d(-1.0,-1.0);
    Point2d pointB=new Point2d(2.0,3.0); // Creamos 2 nuevos puntos
    System.out.println("Distancia del punto a al punto b : "+pointA.getDistance(pointB)); // Llamamos al metodo getDistance() del objeto pointA para saber la distancia entre 2 puntos, para ello levpasamos comobparametro el poitB que es el punto de cual queremos saber la distancia.
    Point2d pointC=new Point2d(1.0,3.0);
    Point2d pointD=new Point2d(3.0,6.0);
    // Creamos 2 puntos mas 
    System.out.println("Antes de rotar el punto D alrrededor del punto C en un grado de 270:  "+pointD.getX()+" , "+pointD.getY()); // Solicitamos las coordenadas del objeto pointD que es el objeto que rotaremos mas adelante.
    pointD.rotate(pointC, 270.0); // Llamamos al metodo rotate del objeto pointD levpaaamos como parametro el punto respectivo al que queremos rotar y los grados que deseamos rotar
    System.out.println("Resultado de rotar el punto D alrrededor del punto C en un grado de 270:  "+pointD.getX()+" , "+pointD.getY()); // Volvemos a solicitar las coordenadas para visualizar la rotacion de 270° respecto a el pointC
    System.out.println("Number of Points: "+Point2d.getNumberOfPoints()); // Por ultimo volvemos a llamar a nuestro metodo de clase getNumberOfPoints() para visualizar el cambio respecto al numero de puntos.
  }
}