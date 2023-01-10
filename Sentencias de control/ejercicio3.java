public class Main {
    public static void main(String[] args) {
        int numeroIf = 10;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        int numeroFor = 0;
        String estacion = "verano";

        // Condición con if
        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }

        // Bucle While
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Valor de numeroWhile: " + numeroWhile);
        }

        // Bucle Do-While
        do {
            numeroDoWhile++;
            System.out.println("Valor de numeroDoWhile: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // Bucle For
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Valor de numeroFor: " + numeroFor);
        }

        // Control de selección Switch
        switch (estacion) {
            case "primavera":
                System.out.println("La estación es primavera.");
                break;
            case "verano":
                System.out.println("La estación es verano.");
                break;
            case "otoño":
                System.out.println("La estación es otoño.");
                break;
            case "invierno":
                System.out.println("La estación es invierno.");
                break;
            default:
                System.out.println("La estación no es válida.");
        }
    }
}
