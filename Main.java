public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Ana López", 15000, "Matemáticas");
        Administrativo administrativo = new Administrativo("Luis Pérez", 13000, "Control escolar");

        docente.mostrarInformacion();
        docente.impartirClase();
        System.out.println("--------------------");
        administrativo.mostrarInformacion();
        administrativo.generarReporte();
    }
}
