package pers.yangx.stdesignpattern.midiator;

/**
 * Created by yangx on 2017/6/16.
 */
public class BColleagueImpl implements Colleague {
    private Midiator midiator;
    public BColleagueImpl(Midiator midiator)
    {
       this.midiator = midiator;
    }
    @Override
    public void send(String message) {
       this.midiator.send(message,this);

    }

    @Override
    public void receivd(String message) {
        System.out.println("i am b colleague, i receive a message:");
        System.out.println(message);
    }
}
