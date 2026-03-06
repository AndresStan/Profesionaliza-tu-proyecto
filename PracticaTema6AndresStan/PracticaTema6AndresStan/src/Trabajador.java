import java.time.LocalDate;
import java.time.Period;

public abstract class Trabajador {

    private final String nombre;
    private final String apellidos;
    private final String dni;
    private final LocalDate fechaIncorporacion;
    private final double salarioBase;




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






    public double getSalarioBase() {
        return salarioBase;
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
