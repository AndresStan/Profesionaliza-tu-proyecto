import java.time.LocalDate;

public class Profesor extends  Trabajador{

    private String especialidad;
    private int horasLectivasSemanales;

    public Profesor(String nombre, String apellidos, String dni, LocalDate fechaIncorporacion, double salarioBase, String especialidad, int horasLectivasSemanales) {
        super(nombre, apellidos, dni, fechaIncorporacion, salarioBase);
        this.especialidad = especialidad;
        this.horasLectivasSemanales = horasLectivasSemanales;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasLectivasSemanales * 9) ;
    }

    @Override
    public String trabajar() {
        return super.trabajar() + " con especialidad en " + this.especialidad;
    }


}
