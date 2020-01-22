package aillament;

/**
 *
 * @author bernat
 */
public class Producte {

    int mCodi;
    int mPreu;
    int mDescomptePerVolum;

    public Producte(int mCodi, int mPreu, int mDescomptePerVolum) {
        this.mCodi = mCodi;
        this.mPreu = mPreu;
        this.mDescomptePerVolum = mDescomptePerVolum;
    }
    
    int getCodi(){
        return mCodi;
    }
    
    int getPreu() {
        return mPreu;
    }

    int getDescomptePerVolum() {
        return mDescomptePerVolum;
    }
    
}
