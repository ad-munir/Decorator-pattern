package decorator;

public class SandwichDecorator implements Sandwich{

    Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
