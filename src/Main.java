public class Main {
    public static void main(String[] args){

        // objetos
        ClasePersonal clasePersonal1 = new ClasePersonal("Yoga",1,60,"Camila Rojas",false,true);
        ClasePersonal clasePersonal2 = new ClasePersonal("Pilates",1,50,"Diego Soto",true,true);
        ClaseSemipersonal claseSemipersonal1 = new ClaseSemipersonal("Yoga",4,60,5);
        ClaseSemipersonal claseSemipersonal2 = new ClaseSemipersonal("Spinning",3,45,2);

        // aplicar metodo de la interfaz
        clasePersonal1.cancelador();

        // crear objeto arraylist
        GestorCentro gestor = new GestorCentro();

        // registrar objetos en la lista
        gestor.agregadorLista(clasePersonal1);
        gestor.agregadorLista(clasePersonal2);
        gestor.agregadorLista(claseSemipersonal1);
        gestor.agregadorLista(claseSemipersonal2);

        // buscar
        System.out.println("--- BUSCAR POR NOMBRE: 'Yoga' ---");
        for (Clase nombreObjeto : gestor.buscador("Yoga")) {
            System.out.println(nombreObjeto.obtenerDetalle());
            System.out.println("---");
        }

        // listar todos
        System.out.println("--- LISTADO DE CLASES ---");
        for (Clase nombreObjeto : gestor.getListaClase()) {
            System.out.println(nombreObjeto);
        }
    }
}
