import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Adel on 15/10/2017.
 * Test Calss to test the methodes
 */
public class TestVectorHelper {
    @Test
    public void testSomeVec() throws DifferentLengthException {
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        v1.addComponant(3);
        v1.addComponant(4);
        v1.addComponant(6);
        v2.addComponant(4);
        v2.addComponant(2);
        v2.addComponant(1);
        Vector v3 = new Vector();
        try {
            v3 = new VectorHelper().sommeVec(v1, v2);

        } catch (DifferentLengthException e) {

        } finally {
            Vector vecRes = new Vector();
            vecRes.addComponant(7);
            vecRes.addComponant(6);
            vecRes.addComponant(7);
            assertArrayEquals(v3.getVec(), vecRes.getVec());
        }
    }

    @Test
    public void testMultiScal() {
        Vector vec1 = new Vector();
        vec1.addComponant(3);
        vec1.addComponant(4);
        vec1.addComponant(5);
        new VectorHelper().multiScalaire(vec1, 2);
        Vector vecRes = new Vector();
        vecRes.addComponant(6);
        vecRes.addComponant(8);
        vecRes.addComponant(10);
        assertArrayEquals(vec1.getVec(), vecRes.getVec());
    }

}