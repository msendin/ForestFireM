package cat.udl.demosEP;

import cat.udl.demosEP.utils.State;
import cat.udl.demosEP.random.RandomIntf;

import static cat.udl.demosEP.utils.Constants.*;
import static cat.udl.demosEP.utils.State.*;

class Cell {
    private State state;
    private RandomIntf random;

    Cell() {
        state = EMPTY;
    }

    void setRandom(RandomIntf rd) {
        random = rd;
    }

    void step(boolean hasBurningNeighbour) {
        double pb = random.nextPBURN();
        double pg = random.nextPGROWTH();

        switch (state) {
            case TREE:
                if (pb == PBURN || hasBurningNeighbour)
                    state = BURNING;
                break;
            case EMPTY:
                if (pg == PGROWTH)
                    state = TREE;
                break;
            case BURNING:
                state = EMPTY;
                break;
        }
    }

    /**********  THIS METHOD SUBSTITUTES THE ONES DEFINED IN PREVIOUS VERSION OF PROBLEM 6 ********/

    State getState() {
        return state;
    }

    /********** SUBSTITUTED METHODS ***********/
    /*
    boolean isBurning() {
        return (state == BURNING);
    }

    boolean isEmpty() {
        return (state == EMPTY);
    }

    boolean hasTree() {
        return (state == TREE);
    }
    ******************************************/
}
