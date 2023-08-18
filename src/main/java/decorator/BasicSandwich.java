package decorator;

public class BasicSandwich implements Sandwich{


    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Mini Sandwich";
    }
}
