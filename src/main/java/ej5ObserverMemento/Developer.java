package ej5ObserverMemento;

class Developer implements Observer {
    private String name;
    private Repository repository;

    public Developer(String name, Repository repository) {
        this.name = name;
        this.repository = repository;
        repository.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(name + " ha sido notificado del cambio de versión: " + repository.getCurrentVersion());
    }

    public void unsubscribe() {
        repository.removeObserver(this);
    }
}
