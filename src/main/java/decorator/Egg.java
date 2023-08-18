package decorator;

public class Egg extends SandwichDecorator {

    public Egg(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 1 Egg";
    }
}
