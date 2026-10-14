public class ClasePersonal extends Clase implements Cancelable {

    // atributos
    private String nombreInstructor;
    private boolean hayEvaluacionFisica;
    private boolean hayCancelacion;

    // constructor sin parametros
    public ClasePersonal() {
    }

    // constructor con parametros
    public ClasePersonal(String nombre, int cupoMaximo, int duracion, String nombreInstructor, boolean hayEvaluacionFisica, boolean hayCancelacion) {
        super(nombre, cupoMaximo, duracion);
        this.setNombreInstructor(nombreInstructor);
        this.setHayEvaluacionFisica(hayEvaluacionFisica);
        this.setHayCancelacion(false);
    }

    // getters y setters
    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public boolean isHayEvaluacionFisica() {
        return hayEvaluacionFisica;
    }

    public void setHayEvaluacionFisica(boolean hayEvaluacionFisica) {
        this.hayEvaluacionFisica = hayEvaluacionFisica;
    }

    public boolean isHayCancelacion() {
        return hayCancelacion;
    }

    public void setHayCancelacion(boolean hayCancelacion) {
        this.hayCancelacion = hayCancelacion;
    }

    // metodo funcional implementado de la superclase
    @Override
    public double costoClase() {
        double costoBase = 35000;
        if (!hayEvaluacionFisica){
            costoBase = costoBase * 1.2;
        }
        return costoBase;
    }

    // metodos implementados desde interfaz
    @Override
    public boolean cancelacionActiva() {
        return hayCancelacion;
    }

    @Override
    public void cancelador() {
        hayCancelacion = true;

    }

    // metodo obtener detalle
    @Override
    public String obtenerDetalle() {
        return "Tipo: Clase Personal | Nombre: " + nombre + " | Cupo: " + cupoMaximo
                + " | Duración: " + duracion + " min | Instructor: " + nombreInstructor
                + " | Evaluación previa: " + (hayEvaluacionFisica ? "Si" : "No")
                + "\n  Cancelación activa: " + (hayCancelacion ? "Si" : "No")
                + " | Costo clase: $" + String.format("%.0f", costoClase());
    }
}
