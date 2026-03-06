import java.util.ArrayList;

public class CentroEducativo {

    private ArrayList<Trabajador> lista;

    public CentroEducativo() {
        lista = new ArrayList<>();
    }

    public CentroEducativo(ArrayList<Trabajador> lista) {
        this.lista = lista;
    }

    public void añadirTrabajador(Trabajador t) {
        lista.add(t);
    }

    public void mostarTrabajadores() {

        for (Trabajador t : lista) {
            if (t instanceof Profesor) {
                System.out.println(t);
            } else if (t instanceof PersonalAdministrativo) {
                System.out.println(t);
            }

        }

    }

    public double salarioMedio (){

        double salarioMedio = 0;

        for (Trabajador t : lista){


            salarioMedio = salarioMedio + t.calcularSalario();

        }

        return salarioMedio/lista.size();

    }

    // Metodo que devuelva el trabajador con mayor antiguedad

    public Trabajador mayorAntiguedad(){

        Trabajador devolucion = lista.getFirst();

        for (Trabajador e : lista){
            if (e.calcularantiguedad() > devolucion.calcularantiguedad()){

                devolucion = e;

            }


        }

        return devolucion;
    }

    //

    public ArrayList<Trabajador> buscarTrabajador (String nombreOTipo){

        ArrayList<Trabajador> trabajadoresEncontrados = new ArrayList<>();

        for (Trabajador e : lista){

            if (e.getNombre().equalsIgnoreCase(nombreOTipo)){
                trabajadoresEncontrados.add(e);
            } else if (e instanceof Profesor && nombreOTipo.equalsIgnoreCase("profesor")) {
                trabajadoresEncontrados.add(e);
            } else if (e instanceof PersonalAdministrativo && nombreOTipo.equalsIgnoreCase("personal administrativo")) {
                trabajadoresEncontrados.add(e);
            }

        }

        return trabajadoresEncontrados;



    }



}
