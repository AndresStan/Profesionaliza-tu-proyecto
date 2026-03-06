import java.time.LocalDate;

public class PersonalAdministrativo extends Trabajador{

    private String departamento;
    private int nivel;

    public PersonalAdministrativo(String nombre, String apellidos, String dni, LocalDate fechaIncorporacion, double salarioBase, String departamento, int nivel) {
        super(nombre, apellidos, dni, fechaIncorporacion, salarioBase);
        this.departamento = departamento;
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        int multiplicador = 0;

        if (nivel < 0){
            System.out.println("Error, nivel incorrecto");
        }

        if (this.nivel == 0 || this.nivel == 1){
            multiplicador = 1;
        } else if (this.nivel == 2) {
            multiplicador = 2;
        } else if (this.nivel == 3) {
            multiplicador = 3;
        } else {
            multiplicador = 3;
        }

        return getSalarioBase() * multiplicador;
    }

    @Override
    public String trabajar() {
        return super.trabajar() + " realizando tareas administrativas de " + this.departamento;
    }
}
