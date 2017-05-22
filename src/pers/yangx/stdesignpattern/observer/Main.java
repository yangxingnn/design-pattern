package pers.yangx.stdesignpattern.observer;


/**
 * Created by yangx on 2017/5/16.
 */
public class Main {
    public static void main(String[] args){
        BossSubjectImpl bossA = new BossSubjectImpl("我回来了");
        Observer employeeA = new NbaObserverImpl(bossA,"看NBA");
        Observer employeeB = new GameObserverImpl(bossA,"玩游戏");
        bossA.addObserver(employeeA);
        bossA.addObserver(employeeB);
        bossA.notifyObserver();
    }

}
