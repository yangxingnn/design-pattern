package pers.yangx.stdesignpattern.midiator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangx on 2017/6/16.
 */
public class AMidiatorImpl implements Midiator {
    private List<Colleague> colleagues =  new ArrayList<>();
    public AMidiatorImpl(){

    }

    public void setColleagues(List<Colleague> colleagues) {
        this.colleagues = colleagues;
    }
    public void addColleague(Colleague colleague){
        this.colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague colleague) {
        for(Colleague sColleague: colleagues){
            if (sColleague!=colleague){
                System.out.println("i am a Midiator, message from: " + colleague.getClass().getName()+" to: "+sColleague.getClass().getName());
                sColleague.receivd(message);
            }
        }
    }
}
