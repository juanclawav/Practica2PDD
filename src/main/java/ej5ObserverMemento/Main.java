package ej5ObserverMemento;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();

        Developer developer1 = new Developer("Desarrollador 1", repository);
        Developer developer2 = new Developer("Desarrollador 2", repository);
        Developer developer3 = new Developer("Desarrollador 3", repository);

        repository.createCommit("Commit 1");
        repository.createCommit("Commit 2");
        repository.createCommit("Commit 3");
        repository.createCommit("Commit 4");
        repository.createCommit("Commit 5");

        repository.restoreCommit(0);

        developer1.unsubscribe();
        developer2.unsubscribe();
        developer3.unsubscribe();

        Developer developer4 = new Developer("Desarrollador 4", repository);
        Developer developer5 = new Developer("Desarrollador 5", repository);
        Developer developer6 = new Developer("Desarrollador 6", repository);

        repository.restoreCommit(4);
    }
}