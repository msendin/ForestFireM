package cat.udl.demosEP;

import cat.udl.demosEP.interfaces.CellTestInterface;
import cat.udl.demosEP.random.*;
import cat.udl.demosEP.random.mocks.RandomCoincPBurnCoincPGROWDouble;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cat.udl.demosEP.utils.State.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CellCoincPBurnCoincPGROWTest implements CellTestInterface {
    private Cell c;
    private RandomIntf random;

    @BeforeEach
    void setUp() {
        c = new Cell();
        random = new RandomCoincPBurnCoincPGROWDouble();
        c.setRandom(random);
    }

    @Override
    @Test
    public void stepTest() {
        c.step(false);
        assertEquals(TREE,c.getState());
        c.step(false);
        assertEquals(BURNING,c.getState());
        c.step(false);
        assertEquals(EMPTY,c.getState());
        c.step(true);
        assertEquals(TREE,c.getState());
        c.step(true);
        assertEquals(BURNING,c.getState());
    }
}
