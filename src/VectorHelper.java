/**
 * Created by Adel on 14/10/2017.
 * VectorHelper Class to make some basic operations on one dimension tables or vectors
 */
public class VectorHelper{
    /**
     * this is the constructor of the Class
     */
       public VectorHelper (){}

    /**
     * a function that inverse the order of one vector elements
     * @param vec the Vector of which we desire to inverse the elements.
     *      Exemples:
     *      input:  1| 2| 3 |5
     *     output:   5 |3 |2| 1
     */

      public void Inverse(Vector vec) {

         Vector vec2= new Vector();
        int j = 0;

        int i;
        for(i = vec.getComponantNumber()- 1; i >= 0; --i) {
            vec2.getVec()[j]= vec.getVec()[i];
            ++j;
        }

        for(i = 0; i < vec.getComponantNumber(); ++i) {
            vec.getVec()[i] = vec2.getVec()[i];
        }

      }
    /**
     * a function that make the additon of two vectors  with the same size and throw an exception if not
     * @param vec1  vector of which we want to add the values to those of vec2
     * @param vec2  vector of which we want to add the values to those of vec1
     * @return the vectors of the result of the addition
     * @throws  DifferentLengthException
     *      Exemples:
     *      input:  1| 2| 3 |5      2 |3 |4| 1
     *      output:   3 |5 |7 | 6
     */

//AJOUT D'une ligne de code en commentaire !!
		




    public Vector sommeVec(Vector vec1 , Vector vec2 ) throws DifferentLengthException {
         Vector vec3 = new Vector();
       try{
       if(vec1.getComponantNumber() != vec2.getComponantNumber()) {
            throw new DifferentLengthException();
        } else {
            for(int i = 0; i < vec1.getComponantNumber(); ++i) {
                vec3.getVec()[i] = vec2.getVec()[i] + vec1.getVec()[i];
            }

            vec3.componantNumber = vec1.componantNumber;
        }
          }
        catch (DifferentLengthException e)
        {
          e= new DifferentLengthException();
        }
        return vec3;
    }

    /**

     *  a function that gives the smallest element's index in one interval of values

     * @param vec  the vector on which we make the operation of research
     * @param n1 the beginning of the research index
     * @param n2 the ending of the research index
     * @return the index of the smallest value.
     *      Exemples:
     *      input:  1| 9| 7 |5 |8 |4   index 2   index 4
     *      output:    3
     */

    public int smallest(Vector vec,int n1, int n2) {
           int small =vec.getVec()[n1];
           int ind =n1;
   
           for(int i =n1 + 1; i <n2; ++i) {
               if(vec.getVec()[i] < small) {
                   small = vec.getVec()[i];
                   ind = i;
               }
           }
   
           return ind;
    }

    /**
     *  a function that sort the elements of one vector
     * @param vec the vector of which we want to put the elements in order.
     *      Exemples:
     *      input:    2 | 4 |3  | 1
     *      output:   1 |2 |3 | 4
     */

    public void triVec(Vector vec) {
        for(int i = 0; i < vec.componantNumber - 1; ++i) {
            int x = vec.getVec()[this.smallest(vec, i, vec.componantNumber)];
            vec.getVec()[this.smallest(vec,i, vec.componantNumber)] = vec.getVec()[i];
            vec.getVec()[i] = x;
        }
    }

    /**
     *  a function that gives the minimum  and the maximum of one vector
     * @param vec thee of which we desire to find the min and the max.
     * Exemples:
     *             intput: |1 |2 | 3 |5 |
     *            output : min =1  max= 5
     */

  public void setExtrema(Vector vec) {
    	    int i=0;
    	    int minValue =vec.getVec()[0];
    	    int maxValue =vec.getVec()[0];
    	    while (i<vec.getComponantNumber()-1) {
            if (vec.getVec()[i] <minValue) {
                minValue=vec.getVec()[i];
           			 }
            if (vec.getVec()[i]> maxValue) {
                maxValue=vec.getVec()[i];
            }
            i++;
            }
            vec.min=minValue;
            vec.max=maxValue;
     }

    /**
     * a function that multiplicate all the values of one vector by a number
     * @param vec the vector of which we want to multiplicate the elements
     * @param scal the number that we multiplicate the values by.
     *       Exemples:
     *       input:  1| 2| 3 |5      scal 2
     *       output:   2 |4 |6 | 10
     *
     */

     public void multiScalaire ( Vector vec,int scal) {
                 int i=0;



                  for (i=0;i<vec.getComponantNumber()-1;i++) {

        



                  for (i=0;i<vec.getComponantNumber()-1;i++) {

     		          vec.getVec()[i]=vec.getVec()[i]*scal ;
                   }

    }



}

