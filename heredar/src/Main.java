import empleados.Employee; // Se importa la clase Employee que se encuentra en el paquete empleados
import empleados.Manager; // Se importa la clase Manager que se encuentra en el paquete empleados
public class Main{ //Nombre de la clase Main
  public static void main(String []args){ // Constructor main ó metodo main
  Employee trabajador = new Employee("Luis", 2000.00, 2025, 7, 27); //Creamos un objeto de tipo Employee y le pasamos los paramentros solicitados a su constructor.
  Manager gerente = new Manager("Javier", 14000.00, 2025, 7, 25); // Creamos un objeto de tipo Manager y le pasamamos los parametros solicitados a su constructor
    gerente.setIncentivo(2.0); // Agregamos un incentivo al gerente por sus servicios
  System.out.print("Sueldo del gerente: \n" + gerente.getSueldo() +"\nSueldo del trabajador: \n"+
  trabajador.getSueldo()+"\n"); // Imprimimos en pantalla los sueldos del trabajador y del gerente.
  }
}