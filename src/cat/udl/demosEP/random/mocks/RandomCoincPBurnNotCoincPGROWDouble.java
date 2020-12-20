package cat.udl.demosEP.random.mocks;

import cat.udl.demosEP.random.RandomIntf;

import static cat.udl.demosEP.utils.Constants.PBURN;

public class RandomCoincPBurnNotCoincPGROWDouble implements RandomIntf {
    public double nextPBURN() {
        return PBURN;
    }
    public double nextPGROWTH() {
        return 0.02;
    }
}