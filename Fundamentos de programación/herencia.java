class Persona {
  private int edad;
  private String nombre;
  private String telefono;

  public Persona(int edad, String nombre, String telefono) {
    this.edad = edad;
    this.nombre = nombre;
    this.telefono = telefono;
  }

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

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
}
class Cliente extends Persona {
  private int credito;

  public Cliente(int edad, String nombre, String telefono, int credito) {
    super(edad, nombre, telefono);
    this.credito = credito;
  }

  public int getCredito() {
    return credito;
  }

  public void setCredito(int credito) {
    this.credito = credito;
  }
}
Cliente cliente1 = new Cliente(25, "Juan", "555-555-555", 1000);
System.out.println("Edad: " + cliente1.getEdad());
System.out.println("Nombre: " + cliente1.getNombre());
System.out.println("Telefono: " + cliente1.getTelefono());
System.out.println("Credito: " + cliente1.getCredito());
