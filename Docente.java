// Docente hereda los atributos y métodos públicos de Empleado.
public class Docente extends Empleado {
    private String asignatura;

    public Docente(String nombre, double salario, String asignatura) {
        super(nombre, salario); // Llama al constructor de la clase base.
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Reutiliza el método de Empleado.
        System.out.println("Asignatura: " + asignatura);
    }

    public void impartirClase() {
        System.out.println(getNombre() + " está impartiendo " + asignatura);
    }
}
