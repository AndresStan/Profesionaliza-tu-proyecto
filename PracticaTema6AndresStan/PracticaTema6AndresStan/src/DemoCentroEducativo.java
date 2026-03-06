import java.time.LocalDate;
import java.util.ArrayList;

public class DemoCentroEducativo {
    public static void main(String[] args) {

        Profesor p1 = new Profesor("Pascual" , "Perez Bagan" , "F546578K", LocalDate.parse("1975-02-22"), 1000.00, "Mantenimiento de equipos", 4);
        Profesor p2 = new Profesor("Angel" , "Sanchez Espilez" , "A2344143P", LocalDate.parse("1985-01-13"), 1250.00, "Programacion", 11);

        PersonalAdministrativo pa1 = new PersonalAdministrativo("Lucas" , "Perez" , "X3441144M" , LocalDate.parse("1999-06-23"), 900.00, "Fol" , 1);
        PersonalAdministrativo pa2 = new PersonalAdministrativo("Santiago" , "Sanchez" , "P4848888J" , LocalDate.parse("1960-01-19"), 1200.00, "Peluqueria" , 2);

        ArrayList<Trabajador> plantilla = new ArrayList<>();
        plantilla.add(p1);
        plantilla.add(p2);
        plantilla.add(pa1);
        plantilla.add(pa2);



        CentroEducativo chomon = new CentroEducativo(plantilla);

        chomon.mostarTrabajadores();

        System.out.println(chomon.salarioMedio());

        System.out.println(chomon.mayorAntiguedad());

        System.out.println(pa1.trabajar());
        System.out.println(p2.trabajar());

        // busco el empleado por nombre o tipo
        System.out.println(chomon.buscarTrabajador("Pascual"));
        System.out.println(chomon.buscarTrabajador("Personal administrativo"));
    }

}
