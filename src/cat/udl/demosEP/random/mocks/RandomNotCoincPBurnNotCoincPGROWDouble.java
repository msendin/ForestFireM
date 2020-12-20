package cat.udl.demosEP.random.mocks;

import cat.udl.demosEP.random.RandomIntf;

public class RandomNotCoincPBurnNotCoincPGROWDouble implements RandomIntf {
    public double nextPBURN() {
        return 0.00007;
    }
    public double nextPGROWTH() {
        return 0.02;
    }
}
