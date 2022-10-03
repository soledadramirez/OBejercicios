public class Coche {

    private int numPuertas;

    public Coche(int puertas) {
        numPuertas = puertas;
    }

    public void agregarPuerta () {
        numPuertas = numPuertas +1;
    }

    public static void main(String[] args) {
        Coche coche = new Coche (4);
        coche.agregarPuerta();
        System.out.println(coche.numPuertas);
    }
}
