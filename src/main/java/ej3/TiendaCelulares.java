package ej3;

import java.util.List;

public class TiendaCelulares {
    private List<Celular> celulares;

    private SearchStrategy searchStrategy;

    private int threshold = 1000;

    public TiendaCelulares(List<Celular> celulares) {
        this.celulares = celulares;
    }

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public List<Celular> buscar(String modelo, int precio) {
        if (celulares.size() < threshold) {
            setSearchStrategy(new SimpleSearchStrategy());
        } else {
            setSearchStrategy(new AdvancedSearchStrategy());
        }

        return searchStrategy.search(celulares, modelo, precio);
    }
}
