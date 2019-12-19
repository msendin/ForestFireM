package cat.udl.demosEP;

import cat.udl.demosEP.random.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static cat.udl.demosEP.utils.State.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CellTest {
    private Cell c;
    private RandomIntf random;

    @BeforeEach
    void setUp() {
        c = new Cell();
    }

    @Test
    void stepCoincPBurnCoincPGROWTest() {
        random = new RandomCoincPBurnCoincPGROWDouble();
        c.setRandom(random);
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

    @Test
    void stepCoincPBurnNotCoincPGROWTest() {
        random = new RandomCoincPBurnNotCoincPGROWDouble();
        c.setRandom(random);
        c.step(false);
        assertEquals(EMPTY,c.getState());
    }

    @Test
    void stepNotCoincPBurnCoincPGROWTest() {
        random = new RandomNotCoincPBurnCoincPGROWDouble();
        c.setRandom(random);
        c.step(false);
        assertEquals(TREE,c.getState());
        c.step(false);
        assertEquals(TREE,c.getState());
        c.step(true);
        assertEquals(BURNING,c.getState());
        c.step(true);
        assertEquals(EMPTY,c.getState());
        c.step(true);
        assertEquals(TREE,c.getState());
    }

    @Test
    void stepNotCoincPBurnNotCoincPGROWTest() {
        random = new RandomNotCoincPBurnNotCoincPGROWDouble();
        c.setRandom(random);
        c.step(false);
        assertEquals(EMPTY,c.getState());
    }
}
