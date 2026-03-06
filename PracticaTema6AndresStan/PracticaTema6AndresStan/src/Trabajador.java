import java.time.LocalDate;
import java.time.Period;

public abstract class Trabajador {

    private String nombre;
    private String apellidos;
    private String dni;
    private LocalDate fechaIncorporacion;
    private double salarioBase;

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    public Trabajador(String nombre, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Trabajador(String nombre, String apellidos, String dni, LocalDate fechaIncorporacion, double salarioBase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaIncorporacion = fechaIncorporacion;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String trabajar(){
        return "Estoy trabajando en el centro educativo";
    }


    // Creo la funcion que devuelve la antiguedad del trabajador en años
   public int calcularantiguedad(){

        return Period.between(this.fechaIncorporacion,LocalDate.now()).getYears();

    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + " Apellidos: " + apellidos +
                " Dni: " + dni + " FechaIncorporacion: " + fechaIncorporacion +
                " SalarioBase: " + salarioBase;
    }
}
