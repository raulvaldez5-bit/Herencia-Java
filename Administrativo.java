
public class Administrativo extends Empleado {

    // Atributo exclusivo de la clase Administrativo
    private String departamento;

    // Constructor que reutiliza el constructor de Empleado
    public Administrativo(String nombre, double salario,
                          String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    // Sobrescritura del método heredado
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }

    // Método exclusivo de Administrativo
    public void generarReporte() {
        System.out.println(getNombre() + " generó un reporte de "
                + departamento);
    }
}
