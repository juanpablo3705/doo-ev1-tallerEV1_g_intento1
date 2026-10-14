public abstract class Clase {

    // atributos
    protected String nombre;
    protected int cupoMaximo;
    protected int duracion;

    // constructor sin parametros
    public Clase() {
    }

    // constructor con parametros
    public Clase(String nombre, int cupoMaximo, int duracion) {
        this.setNombre(nombre);
        this.setCupoMaximo(cupoMaximo);
        this.setDuracion(duracion);
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("Error, el nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo < 1 || cupoMaximo > 30){
            throw new IllegalArgumentException("Error, el cupo debe estar entre 1 y 30.");
        }
        this.cupoMaximo = cupoMaximo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion <= 0){
            throw new IllegalArgumentException("Error, la duración debe ser mayor a cero.");
        }
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | " +
                "Cupo: " + cupoMaximo;
    }

    // metodo abstracto para obtener detalle
    public abstract String obtenerDetalle();

    // metodo funcional
    public abstract double costoClase();
}
