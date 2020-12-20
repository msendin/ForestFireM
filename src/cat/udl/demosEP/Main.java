package cat.udl.demosEP;

import cat.udl.demosEP.random.*;
import cat.udl.demosEP.random.mocks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cell c;
        char ch;
        String s = "12345f";
        boolean hasBurningNeighbour;
        RandomIntf random1 = new RandomMath();
        RandomIntf random2 = new RandomCoincPBurnCoincPGROWDouble();
        RandomIntf random3 = new RandomCoincPBurnNotCoincPGROWDouble();
        RandomIntf random4 = new RandomNotCoincPBurnCoincPGROWDouble();
        RandomIntf random5 = new RandomNotCoincPBurnNotCoincPGROWDouble();

        c = new Cell();
        do {
            System.out.println("Enter the value for hasBurningNeighbour. Type 1 for TRUE; Any other character for FALSE ...");
            Scanner sc = new Scanner(System.in);
            hasBurningNeighbour = (sc.next().charAt(0) == '1');
            System.out.println("MENU. Select one of the next options:");
            System.out.println();
            System.out.println("    1. Use java.util.Random");
            System.out.println("    2. Use a test double returning PBURN and PGROWTH");
            System.out.println("    3. Use a test double returning PBURN but not PGROWTH");
            System.out.println("    4. Use a test double not returning PBURN, but returning PGROWTH");
            System.out.println("    5. Use a test double not returning PBURN neither PGROWTH");
            System.out.println("    f. Finalize");
            System.out.println("        ... enter your selection: ");
            do {
                ch = sc.next().charAt(0);
                switch (ch) {
                    case '1':
                        c.setRandom(random1);
                        break;
                    case '2':
                        c.setRandom(random2);
                        break;
                    case '3':
                        c.setRandom(random3);
                        break;
                    case '4':
                        c.setRandom(random4);
                        break;
                    case '5':
                        c.setRandom(random5);
                        break;
                    case 'f':
                        break;
                    default:
                        System.out.println(" Selection ERROR; Try again... ");
                }
            } while (s.indexOf(ch) == -1);
            if (ch != 'f') {
                c.step(hasBurningNeighbour);
                System.out.print("** New state for Cell: ");
                System.out.println(c.getState()); System.out.println();
            }
          } while (ch != 'f');
        }
}





