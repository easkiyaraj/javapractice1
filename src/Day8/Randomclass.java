package Day8;

import java.util.Random;

public class Randomclass {
    public static void main(String[] args) {
        Random r=new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextBoolean());
        System.out.println(r.nextFloat());
        System.out.println(r.nextLong());
    }
}
