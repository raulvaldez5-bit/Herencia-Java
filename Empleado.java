public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }
    public double getSalario() { return salario; }

    // Método heredable que las subclases pueden sobrescribir.
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " | Salario: $" + salario);
    }
}
