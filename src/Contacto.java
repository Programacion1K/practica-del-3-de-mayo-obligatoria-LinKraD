import java.util.Objects;

public class Contacto {
    private final String nombre;
    private final String numero;
    private final String tipo;
    private String correo;

    public Contacto(String nombre, String numero, String tipo, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.correo = correo;
    }

    public Contacto(String nombre, String numero, String tipo){
        this(nombre,numero,tipo,null);
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre) &&
                Objects.equals(numero, contacto.numero) &&
                Objects.equals(tipo, contacto.tipo) &&
                Objects.equals(correo, contacto.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numero, tipo, correo);
    }

    public String info() {

        if (correo==null){

            return nombre + " con número de " + tipo + ": " + numero;

        } else {

            return nombre + " con número de " + tipo + ": " + numero + " y su correo es: " + correo;

        }

    }

    public static void main(String[] args) {

    }
}
