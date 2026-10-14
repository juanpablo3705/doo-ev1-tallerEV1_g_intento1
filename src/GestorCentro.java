import java.util.ArrayList;

public class GestorCentro {

    // inicializar lista
    private ArrayList<Clase> listaClase;

    // constructor
    public GestorCentro() {
        listaClase = new ArrayList<>();
    }

    // metodo para añadir objetos a la lista
    public void agregadorLista(Clase objetoClase) {
        listaClase.add(objetoClase);
        System.out.println(objetoClase.getNombre() + "(" + objetoClase.getClass().getSimpleName() + ") registrado correctamente");
    }

    // getter para retornar nombre de la lista
    public ArrayList<Clase> getListaClase() {
        return listaClase;
    }

    // metodo buscador
    public ArrayList<Clase> buscador(String nombre) {
        ArrayList<Clase> encontrados = new ArrayList<>(); // crear lista para colocar encontrados
        for (Clase objeto : listaClase) {
            if (objeto.getNombre().equalsIgnoreCase(nombre)) {
                encontrados.add(objeto);
            }
        }
        return encontrados;
    }

}
