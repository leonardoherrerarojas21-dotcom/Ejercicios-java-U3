
public class Main {
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Lista enlazada en Java");
        System.out.println("¿Esta vacia? " + lista.estaVacia());

        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);

        System.out.print("Insertar al final: ");
        lista.imprimir();

        lista.insertarAlInicio(5);

        System.out.print("Insertar al inicio: ");
        lista.imprimir();

        System.out.println("¿Existe el 20? " + lista.buscar(20));
        System.out.println("¿Existe el 99? " + lista.buscar(99));

        System.out.println("Cantidad de elementos: " + lista.contar());
        System.out.println("Elemento en indice 2: " + lista.obtener(2));

        lista.eliminar(10);

        System.out.print("Eliminar el 10: ");
        lista.imprimir();

        lista.eliminar(5);

        System.out.print("Eliminar el primero: ");
        lista.imprimir();

        lista.eliminar(30);

        System.out.print("Eliminar el ultimo: ");
        lista.imprimir();

        lista.eliminar(20);

        System.out.print("Eliminar todos los elementos: ");
        lista.imprimir();

        System.out.println("¿Esta vacia? " + lista.estaVacia());
    }
}
