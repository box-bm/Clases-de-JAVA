public class Clases {
    public static void main(String[] args) {

        // Variable / instancia de un objeto
        Persona persona = new Persona("Brandon", "Manzo", 23, true);
        String nombreCompleto = persona.obtenerNombreCompleto();

        System.out.println(nombreCompleto);
        System.out.println(persona.toString());

        persona.marcarComoDifunto();
        persona.setNombre("Luis");
        System.out.println(persona.toString());

        // sobrecarga de un constructor
        Persona persona2 = new Persona("Marianne", "Stewart");
        System.out.println(persona2.obtenerNombreCompleto());
        System.out.println(persona2.toString());
    }
}
