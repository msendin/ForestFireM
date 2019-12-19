package cat.udl.demosEP.random;

import static cat.udl.demosEP.utils.Constants.PBURN;
import static cat.udl.demosEP.utils.Constants.PGROWTH;

public class RandomCoincPBurnCoincPGROWDouble implements RandomIntf {
    public double nextPBURN() {
        return PBURN;
    }
    public double nextPGROWTH() {
        return PGROWTH;
    }
}
