public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int resultado = suma(a, b, c);
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}