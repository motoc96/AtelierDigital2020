package lab6.ch1;

public class EUR extends Currency {
    public EUR(){}
    public EUR(double units) {
        super(units);
    }

    public String toString(){
        return ("EUR: " + getUnits());
    }
}
