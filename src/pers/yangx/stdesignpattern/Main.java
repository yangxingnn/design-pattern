package pers.yangx.stdesignpattern;

import org.junit.Test;

import java.util.Random;

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
        Long s = new Long(2000);
        Long ss = s/(5*6);
        System.out.println(ss);
    }
}
