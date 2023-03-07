package ej5ObserverMemento;

import java.util.ArrayList;
import java.util.List;

class Repository implements Subject {
    private String currentVersion;
    private List<Observer> subscribers;
    private List<CommitMemento> mementos;

    public Repository() {
        subscribers = new ArrayList<>();
        mementos = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update();
        }
    }

    public void createCommit(String version) {
        mementos.add(new CommitMemento(version));
        currentVersion = version;
        notifyObservers();
    }

    public void restoreCommit(int index) {
        currentVersion = mementos.get(index).getVersion();
        notifyObservers();
    }


    public String getCurrentVersion() {
        return currentVersion;
    }
}
