package decorator;

public class Cheese extends SandwichDecorator{

    public Cheese(Sandwich sandwich){
        super(sandwich);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", 1 slice of cheddar cheese";
    }
}
