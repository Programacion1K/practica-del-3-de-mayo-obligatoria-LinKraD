import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class Agenda {
    private String nombre;
    private Map<Contacto, List<Item>> listaContactos=new Map<Contacto, List<Item>>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public List<Item> get(Object key) {
            return null;
        }

        @Override
        public List<Item> put(Contacto key, List<Item> value) {
            return null;
        }

        @Override
        public List<Item> remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends Contacto, ? extends List<Item>> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<Contacto> keySet() {
            return null;
        }

        @Override
        public Collection<List<Item>> values() {
            return null;
        }

        @Override
        public Set<Entry<Contacto, List<Item>>> entrySet() {
            return null;
        }
    };



}
