package pers.yangx.stdesignpattern.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangx on 2017/5/16.
 */
public class BossSubjectImpl implements Subject {
    private String bossState;
    private List<Observer> employees = new LinkedList<>();

    public BossSubjectImpl(String bossState) {
        this.bossState = bossState;
    }

    @Override
    public boolean addObserver(Observer observer) {
        return employees.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return employees.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer employee :
                employees) {
            employee.update();
        }
    }

    @Override
    public String getState() {
        return this.bossState;
    }

    @Override
    public void setState(String state) {
        this.bossState = state;
    }


}
