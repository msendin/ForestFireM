package cat.udl.demosEP;

import cat.udl.demosEP.random.RandomIntf;
import cat.udl.demosEP.random.mocks.RandomCoincPBurnCoincPGROWDouble;
import cat.udl.demosEP.random.mocks.RandomCoincPBurnNotCoincPGROWDouble;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cat.udl.demosEP.utils.State.*;
import static cat.udl.demosEP.utils.State.EMPTY;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellCoincPBurnNotCoincPGROWTest implements CellTestInterface {
    private Cell c;
    private RandomIntf random;

    @BeforeEach
    void setUp() {
        c = new Cell();
        random = new RandomCoincPBurnNotCoincPGROWDouble();
        c.setRandom(random);
    }

    @Override
    @Test
    public void stepTest() {
        c.step(false);
        assertEquals(EMPTY,c.getState());
        c.step(true);
        assertEquals(EMPTY,c.getState());
    }
}

