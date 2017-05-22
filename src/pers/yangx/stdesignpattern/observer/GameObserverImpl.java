package pers.yangx.stdesignpattern.observer;

/**
 * Created by yangx on 2017/5/16.
 */
public class GameObserverImpl implements Observer {
    private Subject bossSubject;
    private String state;

    public GameObserverImpl(Subject bossSubject,String state) {
        this.bossSubject = bossSubject;
        this.state = state;
    }

    @Override
    public void update() {
        System.out.println("我还在打游戏，老板说:\""+bossSubject.getState()+"\",不能再"+this.state+"，得赶紧工作");
    }
}
