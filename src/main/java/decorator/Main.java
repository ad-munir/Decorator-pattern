package decorator;

public class Main {
    public static void main(String[] args) {

        BasicSandwich sandwich = new BasicSandwich();
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.getPrice());
    }
}