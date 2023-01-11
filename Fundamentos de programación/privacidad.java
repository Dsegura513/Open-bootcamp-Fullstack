class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    // Getters y Setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        // Utilizando setters para asignar valores a las variables
        persona1.setEdad(25);
        persona1.setNombre("Juan");
        persona1.setTelefono(12345678);

        // Utilizando getters para obtener los valores de las variables
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Telefono: " + persona1.getTelefono());
    }
}
