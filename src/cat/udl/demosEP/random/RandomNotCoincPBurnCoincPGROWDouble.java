package cat.udl.demosEP.random;

import static cat.udl.demosEP.utils.Constants.PGROWTH;

public class RandomNotCoincPBurnCoincPGROWDouble implements RandomIntf {
    public double nextPBURN() {
        return 0.00007;
    }
    public double nextPGROWTH() {
        return PGROWTH;
    }
}
