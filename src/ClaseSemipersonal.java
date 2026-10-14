public class ClaseSemipersonal extends Clase {

    // atributos
    private int cantidadParticipantes;

    // constructor vacio
    public ClaseSemipersonal() {
    }

    // constructor con parametros
    public ClaseSemipersonal(String nombre, int cupoMaximo, int duracion, int cantidadParticipantes) {
        super(nombre, cupoMaximo, duracion);
        this.setCantidadParticipantes(cantidadParticipantes);
    }

    // getters y setters
    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void setCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }

    // metodo funcional implementado de la superclase
    @Override
    public double costoClase() {
        double costoBase = 18000;
        if (cantidadParticipantes > 3) {
            costoBase = costoBase * 1.1;
        }
        return costoBase;
    }

    // metodo obtener detalle
    @Override
    public String obtenerDetalle() {
        return "Tipo: Clase Semipersonal | Nombre: " + nombre + " | Cupo: " + cupoMaximo
                + " | Duración: " + duracion + " min | Participantes: " + cantidadParticipantes
                + " | Costo clase: $" + String.format("%.0f", costoClase());
    }
}
