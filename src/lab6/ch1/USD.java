package lab6.ch1;

public class USD extends Currency{
    public USD(){}
    public USD(double units) {
        super(units);
    }
    public String toString(){
        return ("USD: " + getUnits());
    }
}
