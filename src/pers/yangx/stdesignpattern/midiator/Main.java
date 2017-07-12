package pers.yangx.stdesignpattern.midiator;

/**
 * 中介者模式
 * Created by yangx on 2017/6/16.
 */
public class Main {
    public static void main(String[] args) {
        AMidiatorImpl aMidiator = new AMidiatorImpl();
        AColleagueImpl aColleague = new AColleagueImpl(aMidiator);
        BColleagueImpl bColleague= new BColleagueImpl(aMidiator);

        aMidiator.addColleague(aColleague);
        aMidiator.addColleague(bColleague);
        aColleague.send("hello b");

    }
}
