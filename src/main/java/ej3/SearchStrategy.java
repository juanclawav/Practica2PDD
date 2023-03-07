package ej3;

import java.util.List;

public interface SearchStrategy {
    List<Celular> search(List<Celular> celulares, String modelo, int precio);
}
