public class Contacto {
    private final String nombre;
    private final int numero;
    private final TiposNumero tipo;
    private final String correo;

    public Contacto(String nombre, int numero, TiposNumero tipo, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public TiposNumero getTipo() {
        return tipo;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", tipo=" + tipo +
                ", correo='" + correo;
    }

    public String info() {
        return nombre + " con número de " + tipo + ": " + numero;
    }

    public static void main(String[] args) {
        Contacto contacto1=new Contacto("Contacto 1", 963845235, TiposNumero.MOVIL.getTipo(), "correo1@gmail.com");

        System.out.println(contacto1.info());
    }
}
