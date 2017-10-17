/**
 * Created by Adel on 14/10/2017.
 * Class Vector repersent the one dimension integer vectors with  their constructive properties
 */
public class Vector {
    /**
     * the maximum size defined for Vector
     */
    public int maxt = 100;
    /**
     * the real size of a Vector ( the length)
     */
    protected  int componantNumber ;
    /**
     * the effective table (vector)  containg the values stored in the Vector
     */
    private int[] vec;
    /**
     * the minimum value in the Vector
     */
    protected int min;
    /**
     * the maximum value in the vector
     */
    protected int max;
    /**
     * this is a constructor for the class Vector to initilise the vector and the number of cases
     */

    public Vector() {
        this.vec = new int[this.maxt];
        this.componantNumber =0;
    }
    /**
     * this is a getter to have the table of values ( vector) of one object Vector
     * @return  the values of the vector
     */
    public int [] getVec(){ return this.vec;}
    /**
     * this is a getter to have the real  number of elments that a Vector  has at themoment
     * @return the number of elements in the vector.
     *      Exemples:
     *      input:  1| 2| 3 |5
     *      output:   4
     */

    public  int getComponantNumber(){return this.componantNumber;}
    /**
     * un function that add a element ( a value) to the vector
     *@param number the element's  value  we ant to add to the vector.
     *       Exemples:
     *      input:  1| 2| 3 |5      int 6
     *      output:   1| 2| 3 |5 | 6
     */
    public void addComponant( int number){
        this.vec[componantNumber]=number;
        this.componantNumber++;
    }
}
