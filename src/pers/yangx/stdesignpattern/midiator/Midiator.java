package pers.yangx.stdesignpattern.midiator;

/**
 * Created by yangx on 2017/6/16.
 */
public interface Midiator {
    public void send(String message,Colleague colleague);
}
