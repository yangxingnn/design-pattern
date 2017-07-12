package pers.yangx.stdesignpattern.midiator;

/**
 * Created by yangx on 2017/6/16.
 */
public interface Colleague {
    public void send(String message);

    public void receivd(String message);
}
