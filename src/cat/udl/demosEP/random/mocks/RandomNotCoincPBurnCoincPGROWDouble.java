package cat.udl.demosEP.random.mocks;

import cat.udl.demosEP.random.RandomIntf;

import static cat.udl.demosEP.utils.Constants.PGROWTH;

public class RandomNotCoincPBurnCoincPGROWDouble implements RandomIntf {
    public double nextPBURN() {
        return 0.00007;
    }
    public double nextPGROWTH() {
        return PGROWTH;
    }
}
