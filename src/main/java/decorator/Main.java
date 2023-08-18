package decorator;

public class Main {
    public static void main(String[] args) {

        Sandwich sandwich = new Cheese(new Egg(new BasicSandwich()));
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.getPrice());
    }
}