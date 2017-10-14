/**
 * Created by Adel on 14/10/2017.
 */
public class VectorHelper {
	public class vectorHelper {
    private int maxt = 100;
    private int nbElements = 0;
    private int nbElements2 = 0;
    private int nbElements3 = 0;
    private int[] vec;
    private int[] vec2;
    private int[] vec3;
    private int min;
    private int max;

    public vectorHelper() {
        this.vec = new int[this.maxt];
        this.vec2 = new int[this.maxt];
        this.vec3 = new int[this.maxt];
    }

    

    public void inverser() {
        int[] vec2 = new int[this.maxt];
        int j = 0;

        int i;
        for(i = this.nbElements - 1; i >= 0; --i) {
            this.vec2[j] = this.vec[i];
            ++j;
        }

        for(i = 0; i < this.nbElements; ++i) {
            this.vec[i] = this.vec2[i];
        }

    }

   

    public void sommeVec() throws DifferentLengthExceeption {

       try{
       if(this.nbElements != this.nbElements2) {
            throw new DifferentLengthExceeption();
        } else {
            for(int i = 0; i < this.nbElements; ++i) {
                this.vec3[i] = this.vec2[i] + this.vec[i];
            }

            this.nbElements3 = this.nbElements;
        }
          }
        catch (DifferentLengthExceeption e)
        {
            System.out.println("Oops ! c'est pas la meme taille ");
        }
    }

    public int smallIndex(int n1, int n2) {
           int petit = this.vec[n1];
           int ind =n1;
   
           for(int i =n1 + 1; i <n2; ++i) {
               if(this.vec[i] < petit) {
                   petit = this.vec[i];
                   ind = i;
               }
           }
   
           return ind;
       }

    public void triVec() {
        for(int i = 0; i < this.nbElements - 1; ++i) {
            int x = this.vec[this.smallIndex(i, this.nbElements)];
            this.vec[this.smallIndex(i, this.nbElements)] = this.vec[i];
            this.vec[i] = x;
        }
    }

  public void setExtrema () {
    	    int i=0;
    	    int minValue =this.vec[0];
    	    int maxValue=this.vec[0];
    	    while (i<vec.length) {
            if (vec[i] <minValue) {
                minValue=vec[i];
           			 }
            if (vec[i]> maxValue) {
                maxValue=vec[i];
            }
            i++;
            }
            this.min=minValue;
            this.max=maxValue;
     }

     public void multiScalaire (int scal) { //multiplie le vecteur par un scalaire
                 int i=0;
                 //modification
                  for (i=0;i<this.vec.length;i++) {
     		    this.vec[i]=vec[i]*scal ;
                   }

    }



}
    
}
