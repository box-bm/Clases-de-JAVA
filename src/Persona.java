// Niveles de seguridad:
// 1. public: que estan expuestas a todos
// 2. protected: que estan expuestas pero protegidas
// 3. private:

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private String nombreCompleto;
    private Integer edad;
    private Boolean vivo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.nombreCompleto = nombre + " " + this.apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        this.nombreCompleto = this.nombre + " " + apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // Constructores
    public Persona(String nombre, String apellido, Integer edad, Boolean vivo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vivo = vivo;
    }

    // sobrecarga de un constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.vivo = true;
        this.edad = 1 + 1;
        this.apellido = apellido;
    }

    // Metodos / funciones
    String obtenerNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    // sobrecarga de funciones
    String obtenerNombreCompleto(String nombre) {
        return nombre + " " + this.apellido;
    }

    void marcarComoDifunto() {
        // ... conecta a sql
        // ... finaliza y altera el objeto
        this.vivo = false;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", vivo=" + vivo +
                '}';
    }
}
