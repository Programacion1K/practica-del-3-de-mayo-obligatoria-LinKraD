import java.util.Objects;

public class Item {
    private final String nombre;
    private String dato;

    public Item(String nombre, String dato) {
        this.nombre = nombre;
        this.dato = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(nombre, item.nombre) &&
                Objects.equals(dato, item.dato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dato);
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", dato='" + dato;
    }

    public String info(){
        return nombre + ": " + dato;
    }
}
