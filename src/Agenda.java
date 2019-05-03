import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class Agenda {
    private String nombre;
    private Map<Contacto, List<Item>> listaContactos=new TreeMap<>();

    Agenda(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void anyadirContacto(Contacto nuevoContacto){
        listaContactos.put(nuevoContacto,new ArrayList<>());
    }

    public void anyadirContacto(Contacto nuevoContacto, ArrayList<Item> listaItem){
        listaContactos.put(nuevoContacto,listaItem);
    }

    public List<Item> listaDeItems(Contacto c){
        return listaContactos.get(c);
    }
    public String lista(){
        String salida="";
        for (Contacto c:listaContactos.keySet()) {
            salida+=c.info()+": ";
            for (Item i: listaDeItems(c)) {
                salida+=i.info()+", ";
            }
            salida+="\n";
        }
        return salida;
    }

    public void anyadirItem(Contacto contacto, Item item){
        try {
            listaContactos.get(contacto).add(item);
        } catch (NullPointerException e){
            throw new NullPointerException("Contacto inexistente.");
        }
    }

}
