package demo_triangle;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class TriangleTest {

    public TriangleTest() {
    }

    @Test
    public void testGetTipusTriangle() {
        int entrades[][] = {
            {-1, 2, 2},
            {2, -1, 2},
            {2, 2, -1},
            {-1, -1, -1},
            {0, 2, 2},
            {2, 0, 2},
            {2, 2, 0},
            {0, 0, 0},
            {1, 1, 8},
            {1, 8, 1},
            {8, 1, 1},
            {2, 2, 2},
            {2, 3, 4},
            {2, 2, 1},
            {2, 1, 2},
            {1, 2, 2}
        };
        TipusTriangle sortides[] = {
            TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.NO_TRIANGLE, TipusTriangle.EQUILATER, TipusTriangle.ESCALE, TipusTriangle.ISOSCELES, TipusTriangle.ISOSCELES, TipusTriangle.ISOSCELES};

        Triangle t = new Triangle();
        for(int i=0;i<sortides.length;i++) {
            TipusTriangle tip = 
            t.getTipusTriangle(entrades[i][0], entrades[i][1], entrades[i][2]);
            
            assertEquals( sortides[i], tip );
        }
        
    }

}
