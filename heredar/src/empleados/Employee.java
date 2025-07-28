package empleados; // Mencionamos que empleados pertenece a un paquete llamado empleados
import java.util.Date; // Importamos la libreria Date para trabajar con fechas
import java.util.GregorianCalendar; // Importamos la libreria GregorianCalendar
public class Employee{ // Creamos la clase
  private final String nombre; // variable de tipo private que servira para almacenar una cadena de texto, la palabra clave final evita que esta variable sea inmutable una ves se le haya asignado un valor
  private Double sueldo; // variable de tipo Double que almacenara el sueldo del empleado
  private final Date fechaContrato; // variable de tipo fecha donde se registrara el ingreso del empleado
  public Employee(final String nombre, final Double salario, final Integer anno, final Integer mes, final Integer dia){ // Nuestro metodo constructor solicitara el nombre del empleado, el salario del empleado, el año de ingreso, el mes de ingreso y el dia de ingreso, estos parametros seran inmutables por lo cual se declaran con la palabra reservada final
    this.nombre=nombre; // asignamos el valor del parametro a la variable nombre de la clase, con la palabra reservada this hacemos referencia a dicha variable de clase
    this.sueldo=salario; // asignamos el valor de salario a la variable de clase sueldo con la palabra reservada this para hacer referencia a esta variable de clase
    GregorianCalendar calendario = new GregorianCalendar(anno,mes - 1,dia); // Creamos un nuevo objetobde tipo GregorianCalendar llamado calendario el cual tendra el formato de año, mes y dia.
    this.fechaContrato = calendario.getTime(); // en la variable de clase fechaContrato almacenamos la fecha que nos arroja el objeto calendario.
  }
  public String getNombre(){ // Este metodo nos retorna el nombre almacenado dentro de la variable de clase nombre.
    return this.nombre;
  }
  public Double getSueldo(){ // Este metodo nos retorna el valor almacenado enbla variable de clase sueldo.
    return this.sueldo;
  }
  public Date getFechaContrato(){ // Este metodo nos retorna un objeto de tipo Date(fecha) el cual solicita con el metodo getTime() del objeto fechaContrato la fecha registrada
    return new Date(this.fechaContrato.getTime());
  }
  public void subirSueldo(Double porcentaje){ // Este metodo es vacio y simplemente aumenta el sueldo del empleado por el porcebtaje que se le pase como parametro
    Double aumento = this.sueldo * porcentaje / 100; // Determinamos de cuanto sera el aumento multiplicando el sueldo por el resultado de dividir el porcebtaje asignado entre 100
    this.sueldo += aumento; // sumamos a sueldo el aumento
  }
}