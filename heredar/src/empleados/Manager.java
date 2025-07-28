package empleados; // Mencionamos que Manager pertenece al paquete empleados
public class Manager extends Employee{ // Declaramos nuestra clase Manager y heredamos de Employee
  private Double incentivo; // Variable que guardara un Double de tipo privado
  public Manager(final String nombre, final Double salario, final Integer anno, final Integer mes, final Integer dia){ // Metodo constructor que solicita el nombre , el salario, el año, el mes y dia todos inmutables con la palabra reservada final
    super(nombre,salario,anno,mes,dia); // llamamos al metodo constructor padre y le pasamos los parametros recividos.
    this.incentivo = 0.0; // inicializamos la variable de clase incentivo en 0
  }
  public Double getIncentivo(){ // Metodo que nos permite recuperar el valor de la variable incentivo
    return this.incentivo;
  }
  public void setIncentivo(Double incentivo){ // Metodo que nos permite asignarle un nuevo valor a la variable incentivo
    this.incentivo = incentivo;
  }
  @Override // @Override es una palabra reservada que nos permite sobrescribir metodos de la clase padre o superior
  public Double getSueldo(){ // getSueldo nos devuelve el valor del sueldo del Manager.
    Double sueldoBase = super.getSueldo(); // llamamos al metodo getSueldo() de la clase padre para asignarlo a la variable sueldoBase. Usamos la palabra reservada super para llamar a el metodo de la clase padre.
    return sueldoBase + this.incentivo; // retornamos el resultado de sumar el sueldoBase con el incentivo.
  }
}