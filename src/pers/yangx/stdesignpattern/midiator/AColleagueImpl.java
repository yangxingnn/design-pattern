package pers.yangx.stdesignpattern.midiator;

/**
 * Created by yangx on 2017/6/16.
 */
public class AColleagueImpl implements Colleague {
    private Midiator midiator;

    public AColleagueImpl(Midiator midiator)
    {
        this.midiator = midiator;
    }
    @Override
    public void send(String message) {
        this.midiator.send(message,this);
    }

    @Override
    public void receivd(String message) {
        System.out.println("i am a colleague, i receive a message:");
        System.out.println(message);
    }
}
