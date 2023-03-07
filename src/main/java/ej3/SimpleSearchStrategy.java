package ej3;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleSearchStrategy implements SearchStrategy {
    @Override
    public List<Celular> search(List<Celular> celulares, String modelo, int precio) {
        return celulares.stream()
                .filter(c -> (c.getModelo().equalsIgnoreCase(modelo) && c.getPrecio() <= precio)|(c.getModelo().equalsIgnoreCase(modelo)))
                .collect(Collectors.toList());
    }
}
