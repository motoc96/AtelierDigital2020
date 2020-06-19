package lab5.ch1;

public class ExchangeDesk {
    public <F extends Currency,T extends Currency> T convert(F from,Class<T> toClass,double rate){
        T toReturn = null;

        try {
            toReturn = toClass.getDeclaredConstructor().newInstance();
            toReturn.setUnits(from.getUnits() * rate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toReturn;
    }
}
