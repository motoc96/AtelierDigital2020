package Lab3.decorator;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(String description,int cost, Beverage bevrage) {
        super(description, cost);
        this.beverage = bevrage;

    }

    public int getCost(){
        return super.getCost() + beverage.getCost();
    }

    public String getDescription(){
        return super.getDescription() + ", " + beverage.getDescription();
    }
}
