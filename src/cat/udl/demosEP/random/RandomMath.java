package cat.udl.demosEP.random;

import cat.udl.demosEP.random.RandomIntf;

import java.util.Random;

public class RandomMath implements RandomIntf {
    private Random rand;

    public RandomMath() {
        rand = new Random();
    }

    public double nextPBURN() {
        return rand.nextDouble();
    }

    public double nextPGROWTH() {
        return rand.nextDouble();
    }
}
