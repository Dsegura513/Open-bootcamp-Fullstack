public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("El número de puertas de miCoche es: " + miCoche.numPuertas);
    }
}

class Coche {
    int numPuertas;
    public Coche() {
        numPuertas = 4;
    }
    public void incrementarPuertas() {
        numPuertas++;
    }
}
