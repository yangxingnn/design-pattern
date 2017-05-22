package pers.yangx.stdesignpattern.observer;

/**
 * Created by yangx on 2017/5/16.
 */
public interface Subject {
    boolean addObserver(Observer observer);
    boolean removeObserver(Observer observer);
    void notifyObserver();
    String getState();
    void setState(String state);
}
