//package practicas.Point2d.Objetos; 
package Objetos; 
// Para ejecutarlo con paquetes, colocarse en la raiz y compilar con javac direccion del paquete *.java.
//Para ejecutar con java colocarse en la raiz y ejecutar java direccion del paquete Main ( ó el archivo que contenga el metodo main).
public class Counter {
  //Clase que crea un contador
  private Integer count;// Creamos nuestra variable que se encargara de almacenar el conteo
  public Counter(){
    this.count=0; // Constructor inicializa nuestra variable count en 0
  }
  public Integer currentCount(){ // retorna el valor de nuestra variable count.
    return this.count;
  }
  public void incrementCount(){ // suma 1 a nuestra variable count
    this.count = this.count + 1;
  }
  public void reset(){ // resetea nuestra variable count a 0
    this.count = 0;
  }
}