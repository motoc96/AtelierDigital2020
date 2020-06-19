package lab5.ch1;

public class RON extends Currency {
    public RON(){}
    public RON(double units) {
        super(units);
    }

    public String toString(){
        return ("Ron: " + getUnits());
    }
}
