package ej5ObserverMemento;

// Memento
class CommitMemento {
    private String version;

    public CommitMemento(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
