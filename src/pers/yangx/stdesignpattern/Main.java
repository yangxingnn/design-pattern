package pers.yangx.stdesignpattern;

import org.junit.Test;

import java.math.BigInteger;
import java.util.*;

class ABC{
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here

        Random random  = new Random(23);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(12));
            System.out.println(System.nanoTime());
        }

    }

    @Test
    public void ss(){
        Map temp = new HashMap<>();
        temp.put(1,2);
        temp.put(3,5);
        System.out.println(temp.get(2)==null);
        System.out.println();
        Double band = 0D;
        System.out.println(band);

    }
}
