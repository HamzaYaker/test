import com.sun.org.apache.xpath.internal.operations.Equals;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.BeforeClass;
import  static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by pc on 14/10/2017.
 */
public class TestVectorHelper {


    @Test
    public  void testTri () {
        VectorHelper vhelp =new VectorHelper();
Vector v1=new Vector();
v1.addComponant(1);
v1.addComponant(3);
v1.addComponant(2);
Vector v2 =new Vector();
v2.addComponant(1);
v2.addComponant(2);
v2.addComponant(3);
 vhelp.triVec(v1);



     assertArrayEquals(v1.getVec(), v2.getVec());

    }


    @Test
    public void testInverse () {
        VectorHelper vhelp=new VectorHelper();
        Vector v2 =new Vector();
        v2.addComponant(1);
        v2.addComponant(2);
        v2.addComponant(3);
        Vector res=new Vector();
        res.addComponant(3);
        res.addComponant(2);
        res.addComponant(1);
        vhelp.Inverse(v2);
        assertArrayEquals(v2.getVec(),res.getVec());

    }
    @Test
    public void testExtrema () {
        VectorHelper vhelp=new VectorHelper();
        Vector v1 =new Vector();
        v1.addComponant(5);
        v1.addComponant(2);
        v1.addComponant(3);
        vhelp.setExtrema(v1);

        int min=2;
        int max=5;

       assertEquals(max,v1.max);
       assertEquals(min,v1.min);


    }

}
